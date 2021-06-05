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
		// instanciamos tres objetos de las clases hijas Entrenador,Futbolista y
		// Masajista
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "454EFR12");
		Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 31, 6, "Interior Derecho");
		Masajista raulMartinez = new Masajista(3, "Raùl", "Martinez", 48, "Lisenciado en Fisioterapia", 15);

		// agregamos los 3 objetos al ArrayList
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		// ************************** EJECUTAMOS METODOS DE LA CLASE PADRE
		// CONCENTRACION
		System.out.println(
				"				Todos los integrantes comienzan una concentracion . (Todos ejecutan el mismo metodo)");
		for (SeleccionFutbol integrante : integrantes) {// for each
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " ->");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println(
				" 				Todos los integrantes viajan a jugar un partido . (Todos ejecutan el mismo metodo)");
		for (SeleccionFutbol integrante : integrantes) {// for each
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " ->");
			integrante.viajar();
		}

		// ************************** EJECUTAMOS METODOS DE LAS CLASES HIJAS
		// ENTRENAMIENTO
		System.out.println(
				"                Entrenamiento: Solamente el Entrenador y el Futbolista tienen metodo para entrenar : ");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() + " ->");
		delBosque.dirigirEntrenamiento();
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellido() + " ->");
		iniesta.entrenar();

		// MASAJE
		System.out.println("                Masaje: Solamente el Masajista tiene el mentodo para brindar un masaje: ");
		System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellido() + " ->");
		raulMartinez.darMasaje();

		// PARTIDO FUTBOL
		System.out.println(
				"                Partido de Fútbol: Solamente el Entrenador y el Futbolista tienen mentodo para el Partido de fútbol: ");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() + " ->");
		delBosque.dirigirPartido();
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellido() + " ->");
		iniesta.jugarPartido();
		
		///******************************* Sobreescritura de metodos de la clase padre
		iniesta.viajar();
		

	}

}
