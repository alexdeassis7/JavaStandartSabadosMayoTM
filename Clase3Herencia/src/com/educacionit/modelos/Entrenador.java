package com.educacionit.modelos;

//Clase hija de seleccionFutbol
public class Entrenador extends SeleccionFutbol {
	// atributos especificos de la clase hija
	private String idFederacion;

	// metodos constructores
	public Entrenador() {
		// llamamos al cosntructor de la clase padre
		super();
	}

	public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
		// invocamos al constructor con parametros del padre
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	// metodo especifico de la clase hija
	/*public void dirigirPartido() {
		System.out.println("Entrenador ,dirigirPartido()");
	}

	public void dirigirEntrenamiento() {
		System.out.println("Entrenador ,dirigirEntrenamiento()");
	}*/

	@Override
	public void entrenar() {
		System.out.println("Dirige un entrenamiento (Clase Entrenador) ");
	}
	
	@Override
	public void jugarPartido() {
		System.out.println("Dirige un Partido (Clase Entrenador) ");		
	}

	//metodo propio de la clase Entrenador
	public void planificarEntrenamiento() {
		System.out.println("Planifica un Entrenamiento (Clase Entrenador) ");		
	}

	
	// gets & sets
	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}


}
