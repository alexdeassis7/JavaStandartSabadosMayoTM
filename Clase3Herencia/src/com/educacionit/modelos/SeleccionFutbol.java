package com.educacionit.modelos;

import com.educacionit.misinterfaces.IntegrantesSeleccionFutbol;

//Clase Padre  Abstracta
//con la palabra reservada "final" cortamos la cadena de herencia , 
// osea que ninguna clase podra heredar de SeleccionFutbol 
//Ejemplo final : public final class SeleccionFutbol {
public abstract class SeleccionFutbol implements IntegrantesSeleccionFutbol{
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
	
	// constructores de la clase padre
	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public SeleccionFutbol() {
	}

	// metodos de la clase padre
	public void concentrarce() {
		System.out.println("SeleccionFutbol ,concentrarse() (Clase Padre)");
	}
	
	public void jugarPartido() {
		System.out.println("Asiste al Partido de Fútbol (Clase Padre)");
	}
	
	public void viajar() {
		System.out.println("SeleccionFutbol ,viajar() (Clase Padre)");
	}

	public void entrenar() {
		System.out.println("SeleccionFutbol ,entrenar() (Clase Padre)");
	}
	//Metodo Abstracto => no se implementa en la clase Abstracta si en la s clases hijas
	//public abstract void entrenamiento();
	

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
