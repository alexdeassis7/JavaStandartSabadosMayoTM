package com.educacionit.clase3;

//Clase padre o clase base 
public class Vuelo {

	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;

	// inicializador de bloque : todo el codigo dentro de estas llaves {} se
	// ejecutara siempre que se llame a
	// alguno de los constructores (new Vuelo(....))
	{
		asientosDisponibles = new boolean[getAsientos()];
		for (int i = 0; i < getAsientos(); i++) {
			asientosDisponibles[i] = true;
		}
		System.out.println("Se creo un vuelo de linea con " + getAsientos() + " asientos libres ");
	}

	public Vuelo() {
	}

	public Vuelo(char claseVuelo) {
		this.claseVuelo = claseVuelo;
	}

	public Vuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}

	public int getAsientos() {
		return getAsiento();
	}

	public int getAsiento() {
		return 150;
	}

	public void agregarPasajero(Passenger p1) {
		if (asientoDisponible()) {
			pasajeros += 1;
			System.out.println(p1.getNombre() + " ya puedes subirte al avion!");
		} else {
			faltaAsiento();
		}
	}

	private boolean asientoDisponible() {
		// valido que el numero de pasajeros sea menor al de asientos
		return pasajeros < getAsiento();
	}

	private void faltaAsiento() {
		System.out.println("YA NO QUEDAN ASIENTOS , INTENTA CON OTRA AEROLINEA POR FAVOR ....");
	}

}
