package com.educacionit.programa;

import javax.swing.JOptionPane;
import com.educacionit.daos.PersonaDAO;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {

		PersonaDAO dao = new PersonaDAO();

		// borramos un registro de la base de datos
		String idIngresado = JOptionPane.showInputDialog("Ingrese el id del registro que desea BORRAR");
		dao.eliminarPersona(idIngresado);

		// Registramos a una persona en la base con nuestro DAO
		String nombreIngresado = JOptionPane.showInputDialog("Ingrese el nombre de la persona ");
		int edadIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona "));
		String profesionIngresada = JOptionPane.showInputDialog("Ingrese la profesion de la persona ");
		int telefonoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono de la persona "));
		/*
		 * PersonaVO miVO = new PersonaVO(nombreIngresado, edadIngresada,
		 * profesionIngresada, telefonoIngresado);
		 * 
		 * System.out.
		 * println("Los datos que se van a enviar a guardar en la base son : ");
		 * System.out.println(miVO.toString());
		 * 
		 * dao.registrarPersona(miVO); // Obtenemos un registro de la base mediante su
		 * PK int idIngresado = Integer.parseInt(JOptionPane.
		 * showInputDialog("Ingrese el id del registro que desea conocer")); PersonaVO
		 * personaBuscada = dao.buscarPersona(idIngresado);
		 * 
		 * if (personaBuscada != null) { JOptionPane.showMessageDialog(null,
		 * "El Registro obtenido de la base es el siguiente : \n ID:" +
		 * personaBuscada.getIdPersona() + " \n NOMBRE : " +
		 * personaBuscada.getNombrePersona() + " \n EDAD : " +
		 * personaBuscada.getEdadPersona() + " \n PROFESION : " +
		 * personaBuscada.getProfesionPersona() + " \n TELEFONO : " +
		 * personaBuscada.getTelefonoPersona() + "\n"); } else {
		 * JOptionPane.showMessageDialog(null, "No Existe el Registro con ID :" +
		 * idIngresado); }
		 */
		// MOFICAMOS UN REGISTRO DE LA BASE DE DATOS
		int idIngresado2 = Integer
				.parseInt(JOptionPane.showInputDialog("Ingrese el id del registro que desea modificar"));
//		nombreIngresado = JOptionPane.showInputDialog("Ingrese el nombre de la persona ");
//		edadIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona "));
//		profesionIngresada = JOptionPane.showInputDialog("Ingrese la profesion de la persona ");
//		telefonoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono de la persona "));

		PersonaVO miVO2 = new PersonaVO(idIngresado2, nombreIngresado, edadIngresada, profesionIngresada,
				telefonoIngresado);

		dao.modificarPersona(miVO2);

		System.out.println("Los datos que se van a enviar a guardar en la base son : ");
		System.out.println(miVO2.toString());

		System.out.println("Fin de la App");
	}

}
