package com.educacionit.modelos;

public class JugadorSeleccion {

	private int dorsal;
	private String nombre;
	private String apellido;

	public JugadorSeleccion() {
	}

	public JugadorSeleccion(int dorsal, String nombre, String apellido) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "JugadorSeleccion [dorsal=" + dorsal + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
