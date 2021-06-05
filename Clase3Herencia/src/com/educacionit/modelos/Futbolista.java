package com.educacionit.modelos;

//Clase hija de seleccionFutbol
//con "extends" indicamos cual es la clase padre 
//En JAVA NO EXISTE LA HERENCIA MULTIPLE!
public class Futbolista extends SeleccionFutbol {
	// atributos especificos de la clase hija
	private int dorsal;
	private String demarcacion;

	// metodos constructores
	public Futbolista() {
		// llamamos al cosntructor de la clase padre
		super();
	}

	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		// invocamos al constructor con parametros del padre
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	// metodos especificos de la clase hija
	public void jugarPartido() {
		System.out.println("Futbolista ,jugarPartido()");
	}

	public void entrenar() {
		System.out.println("Futbolista ,entrenar()");
	}
	
	//el override es metadata , que chequea que en la clase padre
	//exista el metodo que intentamos sobreescribir
	//@Override no es obligatorio , si recomendable 
	@Override
	public void viajar() {
		System.out.println("Futbolista viaja en clase ejecutiva,viajar()");
	}
	// gets & sets
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

}
