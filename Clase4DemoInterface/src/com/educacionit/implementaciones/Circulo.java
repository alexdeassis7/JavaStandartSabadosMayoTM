package com.educacionit.implementaciones;

import com.educacionit.misinterfaces.Figura;

// clase que implementa la interface Figura
public class Circulo implements Figura{

	private float diametro;
	
	public Circulo(float diametro) {
		this.diametro = diametro;
	}
	
	@Override
	public float area() {
		return (PI * diametro * diametro/4f);
	}

}
