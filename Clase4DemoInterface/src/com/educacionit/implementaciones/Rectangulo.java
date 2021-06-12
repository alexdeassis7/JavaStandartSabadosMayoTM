package com.educacionit.implementaciones;

import com.educacionit.misinterfaces.Figura;

//clase que implementa la interface Figura
public class Rectangulo implements Figura{

	private float lado ;
	private float altura ;
	
	public Rectangulo(float lado, float altura) {
		this.lado = lado;
		this.altura = altura;
	}
	//implementamos metodo abstracto de nuestra interface
	@Override
	public float area() {
		return lado * altura;
	}
	
}
