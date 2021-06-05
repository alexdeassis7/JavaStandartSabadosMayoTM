package com.educacionit.modelos;

//Clase hija de seleccionFutbol
public class Masajista extends SeleccionFutbol {

	// atributos especificos de la clase hija
	private String titulacion;
	private int aniosExperiencia;

	// metodos constructores
	public Masajista() {
		// llamamos al cosntructor de la clase padre
		super();
	}

	public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
		// invocamos al constructor con parametros del padre
		super(id, nombre, apellido, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	// metodo especifico de la clase hija
	public void darMasaje() {
		System.out.println("Masajista ,darMasaje() ");
	}

	// gets & sets
	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

}
