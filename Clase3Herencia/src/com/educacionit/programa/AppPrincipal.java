package com.educacionit.programa;

import java.util.ArrayList;

import com.educacionit.modelos.Entrenador;
import com.educacionit.modelos.Futbolista;
import com.educacionit.modelos.Masajista;
import com.educacionit.modelos.SeleccionFutbol;

public class AppPrincipal {
	// ArraysList de objetos SeleccionFutbol . Independientemente de la clase hija a
	// la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		/*
		 * // instanciamos tres objetos de las clases hijas Entrenador,Futbolista y //
		 * Masajista Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque",
		 * 60, "454EFR12"); Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta",
		 * 31, 6, "Interior Derecho"); Masajista raulMartinez = new Masajista(3, "Raùl",
		 * "Martinez", 48, "Lisenciado en Fisioterapia", 15);
		 * 
		 * // agregamos los 3 objetos al ArrayList integrantes.add(delBosque);
		 * integrantes.add(iniesta); integrantes.add(raulMartinez); //
		 * ************************** EJECUTAMOS METODOS DE LA CLASE PADRE //
		 * CONCENTRACION System.out.println(
		 * "				Todos los integrantes comienzan una concentracion . (Todos ejecutan el mismo metodo)"
		 * ); for (SeleccionFutbol integrante : integrantes) {// for each
		 * System.out.print(integrante.getNombre() + " " + integrante.getApellido() +
		 * " ->"); integrante.concentrarse(); }
		 * 
		 * // VIAJE System.out.println(
		 * " 				Todos los integrantes viajan a jugar un partido . (Todos ejecutan el mismo metodo)"
		 * ); for (SeleccionFutbol integrante : integrantes) {// for each
		 * System.out.print(integrante.getNombre() + " " + integrante.getApellido() +
		 * " ->"); integrante.viajar(); }
		 * 
		 * // ************************** EJECUTAMOS METODOS DE LAS CLASES HIJAS //
		 * ENTRENAMIENTO System.out.println(
		 * "                Entrenamiento: Solamente el Entrenador y el Futbolista tienen metodo para entrenar : "
		 * ); System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() +
		 * " ->"); delBosque.dirigirEntrenamiento();
		 * System.out.print(iniesta.getNombre() + " " + iniesta.getApellido() + " ->");
		 * iniesta.entrenar();
		 * 
		 * // MASAJE System.out.
		 * println("                Masaje: Solamente el Masajista tiene el mentodo para brindar un masaje: "
		 * ); System.out.print(raulMartinez.getNombre() + " " +
		 * raulMartinez.getApellido() + " ->"); raulMartinez.darMasaje();
		 * 
		 * // PARTIDO FUTBOL System.out.println(
		 * "                Partido de Fútbol: Solamente el Entrenador y el Futbolista tienen mentodo para el Partido de fútbol: "
		 * ); System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() +
		 * " ->"); delBosque.dirigirPartido(); System.out.print(iniesta.getNombre() +
		 * " " + iniesta.getApellido() + " ->"); iniesta.jugarPartido();
		 * 
		 * ///******************************* Sobreescritura de metodos de la clase
		 * padre iniesta.viajar();
		 * 
		 */

		System.out.println("************************* CLASE 4 *********************");
		// NO SE PUEDE INSTANCIAR OBJETOS DE UNA CLASE ABSTRACTA
		// SeleccionFutbol casillas = new SeleccionFutbol();
		SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "454EFR12");
		SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 31, 6, "Interior Derecho");
		SeleccionFutbol raulMartinez = new Masajista(3, "Raùl", "Martinez", 48, "Lisenciado en Fisioterapia", 15);

		// agregamos los 3 objetos al ArrayList
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion (Todos ejecutan el mismo metodo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido());
			integrante.concentrarce();
		}

		// VIAJAR
		System.out.println("Todos los integrantes viajan para jugar un partido (Todos ejecutan el mismo metodo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido());
			integrante.viajar();
		}

		// ENTRANAMIENTO
		System.out.println(
				"Entrenamiento : Todos los integrantes tienen su funcion en un entrenamiento (Especializacion)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido());
			integrante.entrenar();
		}

		// PARTIDO DE FUTBOL
		System.out
				.println("Partido de Fútbol : Todos los integrantes tienen su funcion en un partido (Especializacion)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido());
			integrante.jugarPartido();
		}

		// PLANIFICAR ENTRENAMIENTO
		System.out.println(
				"Planificar Entrenamiento: Solo le entrenador tiene el método para planificar un entrenamiento");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellido());
		((Entrenador) delBosque).planificarEntrenamiento();

		// ENTREVISTA
		System.out.println("Entrevista: Solo el futbolista tiene el método para dar una entrevista:");
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellido());
		((Futbolista) iniesta).entrevista();

		// MASAJE
		System.out.println("Masaje: Solo el masajista tiene el método para dar un masaje");
		System.out.println(raulMartinez.getNombre() + " " + raulMartinez.getApellido());
		((Masajista) raulMartinez).darMasaje();
	}

}
