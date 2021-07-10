package com.educacionit.daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.educacionit.database.Conexion;
import com.educacionit.errores.customizados.PersonaInexistenteException;
import com.educacionit.modelos.PersonaVO;

/*Cuando Utilizamos estas clases estamos aplicando un patron llamado 
 * Data Access Object , basicamente este patron consiste en centralizar los procesos de acceso
 * a la base de datos evitando inconsistencias y posibles problematicas cuando esto se
 * realiza a lo largo de la app 
 * Con este patron Independizamos la logica de negocio de lo que es la logica de 
 * acceso a datos , obteniendo asi una mayos organizacion y flexibilidad es nuestro 
 * sistema.
*/
public class PersonaDAO {
//creamos el CRUD
	public void registrarPersona(PersonaVO miPersona) {
		// creamos la conexion a la Base
		Conexion conex = new Conexion();
		// ejecutamos la Query contra la base de datos
		try {
			Statement estatuto = conex.getConnection().createStatement();

			estatuto.executeUpdate("INSERT INTO persona ( `nombre`, `edad`, `profesion`, `telefono`) VALUES" + " ('"
					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "' )");

			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente a " + miPersona.getNombrePersona(),
					"Informacion ", JOptionPane.INFORMATION_MESSAGE);

			// libero los recursos
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se Registro a " + miPersona.getNombrePersona() + " En la DB.");

		}

	}

	// metodo que me ppermite buscar un registro de la tabla persona mediante su id
	public PersonaVO buscarPersona(int codigo) {
		// creamos la conexion a la Base
		Conexion conex = new Conexion();
		PersonaVO persona = new PersonaVO();
		boolean existe = false;

		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona where id = ?");
			// reeemplazo el sigo de interrogacion de la query por el valor de la varible
			// codigo que recibo por parametro
			consulta.setInt(1, codigo);

			ResultSet res = consulta.executeQuery(); // guardo el resultado de la ejecucion de la query en un objeto
														// resulset

			// recorro el objeto resulset para obtener los datos de cada columna
			while (res.next()) {
				existe = true;
				// si el resulset me trajo un registro lo cargo en mi VO
				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("nombre"));
				persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));

			}

			// libero recursos
			res.close();
			conex.desconectar();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error , no se logro obtener el dato con el id : " + codigo);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		if (existe) {
			return persona;
		} else {
			return null;
		}

	}

	// metodo encargado de modificar los dator de un registro en la DB
	public void modificarPersona(PersonaVO miPersona) {

		Conexion conex = new Conexion();
		try {
			if (buscarPersona(miPersona.getIdPersona()) != null) {

				String consulta = "UPDATE persona SET nombre = ? , edad = ? , profesion = ? ,telefono = ? WHERE id = ?";

				// Obtenemos un objeto preparedStatement para enviar sentencias SQL
				// parametrizadas a la DB
				PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
				// Reemplazo los signo de interrogacion por los valores de mi VO
				// estatuto.setInt(1, miPersona.getIdPersona());
				estatuto.setString(1, miPersona.getNombrePersona());
				estatuto.setInt(2, miPersona.getEdadPersona());
				estatuto.setString(3, miPersona.getProfesionPersona());
				estatuto.setInt(4, miPersona.getTelefonoPersona());
				estatuto.setInt(5, miPersona.getIdPersona());

				// ejecutamos la query
				estatuto.executeUpdate();
				JOptionPane.showMessageDialog(null,
						"Se ah Actualizado Correctamente el registro de " + miPersona.getNombrePersona(), "Infomacion",
						JOptionPane.INFORMATION_MESSAGE);
				estatuto.close();
			} else {
				JOptionPane.showMessageDialog(null, "No se logro Editar el Registro , por que no existe", "Error",
						JOptionPane.ERROR_MESSAGE);
			}

			// libero los recursos

			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se logro Editar el Registro ", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	// Metodo encargado de eliminar un registro de la tabla persona mediante su PK
	// (id)
	public void eliminarPersona(String codigo) {
		Conexion conex = new Conexion();

		try {
			// validamos que el registro exista antes de intentar eliminarlo
			PersonaVO pvo = buscarPersona(Integer.parseInt(codigo));
			if (pvo != null) {
				Statement estatuto = conex.getConnection().createStatement();
				// Ejecutamos la query para borrar el registro de la db
				estatuto.executeUpdate("DELETE FROM persona WHERE id = '" + codigo + "'");

				JOptionPane.showMessageDialog(null,
						"Se ah eliminado correctamente el registro con id " + codigo + "de la DB", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
				// Libero los recursos
				estatuto.close();
				conex.desconectar();
			} else {
				throw new PersonaInexistenteException();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se logro Eleminar el Registro ", "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (PersonaInexistenteException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

		}
	}

}
