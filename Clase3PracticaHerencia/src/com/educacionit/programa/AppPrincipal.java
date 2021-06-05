package com.educacionit.programa;

import java.util.ArrayList;
import java.util.List;

import com.educacionit.clase3.Passenger;
import com.educacionit.clase3.Vuelo;
import com.educacionit.clase3.VueloCarga;

public class AppPrincipal {

	public static void main(String[] args) {
		// creo un objneto de la clase hijo
		VueloCarga vc = new VueloCarga();
		// utilizamos metodo especifico de la clase hija
		vc.agregarPaquete(1, 4, 5);

		vc.agregarPaquete(100, 400, 500);

		Passenger marcelo = new Passenger();
		marcelo.setNombre("Marcelo colum");
		Passenger malena = new Passenger();
		malena.setNombre("Malena Ortiz");

//		for (int i = 1; i < 15; i++) {
//			System.out.print(i); 
//			vc.agregarPasajero( malena);
//		}

		// utilizamos metodo heredado de la clase padre
		vc.agregarPasajero(malena);
		vc.agregarPasajero(marcelo);

		// test clase passenger()
		// invocamos al constructor 2
		Passenger juan = new Passenger(5);

		// invocamos al constructor 3
		Passenger joaquin = new Passenger(3, 2);

		Passenger[] pasajeros = new Passenger[2];
		pasajeros[0] = juan;
		pasajeros[1] = joaquin;

		Passenger.mostrarListaDepasajeros(pasajeros);

		Vuelo[] flota = new Vuelo[4];

		flota[0] = new Vuelo();
		flota[1] = new VueloCarga();
		flota[2] = new Vuelo();
		flota[3] = new VueloCarga();

		Vuelo f2 = new Vuelo();
		System.out.println(f2.getAsientos());

		VueloCarga f3 = new VueloCarga();
		System.out.println(f3.getAsientos());

		Object[] o1 = new Object[3];
		o1[0] = new Vuelo();
		o1[1] = new VueloCarga();
		o1[2] = new Passenger();

		Object er = new Object();

	}

}
