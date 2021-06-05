package com.educacionit.clase3;

public class Passenger {
	private String nombre;
	private int bolsos;
	private int bolsosPagos;
	private double tarifaXbolso;
	private double totalaPagar;
	private int totalEquipaje;

	// constructor 1 vacio :
	public Passenger() {
	}

	// constructor 2 con un parametro :este llama al constructor private
	public Passenger(int bolsos) {
		this(bolsos > 1 ? 50.0d : 25.0d);// invoco al constructor 4 ,
		this.bolsos = bolsos;
		totalaPagar = bolsos * tarifaXbolso;
		totalEquipaje = bolsos;
	}

	// constructor 3 con dos parametros : este llama al constructor 2 q ue a su vez
	// llama al constructor private
	public Passenger(int bolsos, int bolsosPagos) {
		this(bolsos);// invoco al constructor 2
		this.bolsosPagos = bolsosPagos;
		totalEquipaje = bolsos + bolsosPagos;
		totalaPagar = bolsos * tarifaXbolso;
	}

	// constructor 4 privado :
	private Passenger(double tarifaXbolso) {
		this.tarifaXbolso = tarifaXbolso;
	}
	
	public double getTarifaXbolso() {
		return tarifaXbolso;
	}

	public double getTotalaPagar() {
		return totalaPagar;
	}

	public int getTotalEquipaje() {
		return totalEquipaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void mostrarListaDepasajeros(Passenger listaPasajeros[]) {
		for (Passenger p1 : listaPasajeros) {
			System.out.println("*******************************************************");
			System.out.println("Pasajero Tarifa por bolso : " + p1.getTarifaXbolso());
			System.out.println("Pasajero total a pagar  : " + p1.getTotalaPagar());
			System.out.println("Pasajero total de bolsos : " + p1.getTotalEquipaje());
		}
	}

}
