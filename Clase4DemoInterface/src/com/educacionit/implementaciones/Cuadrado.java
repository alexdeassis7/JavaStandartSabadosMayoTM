package com.educacionit.implementaciones;

import com.educacionit.misinterfaces.Figura;
import com.educacionit.misinterfaces.IMensajesDeError;
//la clase que implementa la interface Figura
//podemos "simular" una herencia multiple implementando n interfaces
public class Cuadrado implements Figura, IMensajesDeError {

	private float lado;

	public Cuadrado(float lado) {
		this.lado = lado;
		
	}

	//implementamos el metodo abstracto de nuestra interface 
	@Override
	public float area() {
		return lado * lado;
	}
	
	public void mostrarLado() {
		System.out.println("lado :  " + lado);
	}

}
