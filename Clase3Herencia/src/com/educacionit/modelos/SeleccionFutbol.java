package com.educacionit.modelos;

//Clase Padre 
//con la palabra reservada "final" cortamos la cadena de herencia , 
// osea que ninguna clase podra heredar de SeleccionFutbol 
//Ejemplo final : public final class SeleccionFutbol {
public class SeleccionFutbol {
	// atributos de la clase padre
	// protected: sirve para indicar un tipo de visibilidad de lo atributos y
	// metodos de
	// la clase padre y significa que cuando un atributo es "protected" o protegido,
	// solo es visible ese atributo o metodo desde una de las clase hijas y no desde
	// otra clase!
	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	// metodos de la clase padre
	public void concentrarse() {
		System.out.println("SeleccionFutbol ,concentrarse()");
	}
	
	
	public void viajar() {
		System.out.println("SeleccionFutbol ,viajar()");
	}

	// constructores de la clase padre
	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public SeleccionFutbol() {
	}

	// gets y sets de la clase padre
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
