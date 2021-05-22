package com.educacionit.modelos;

public class StaticDemo {

	public int x; // variable de instancia normal
	public static int y; // variable estatica (de clase)
	static int valor = 1024;// variable statica de clase

	// retornar la suma de la varioable de instancia "x"
	// y la variable estatica "y"
	int suma() {
		return x + y;
	}
//los metodos declarador como static tienen las siguientes restricciones:
//	1) pueden llamar solo a otros metodos estaticos dentro de su clase o fuera de su clase 
//	2) pueden acceder solamente a variables estaticas dentro de su clase o fuera de su clase
//	3) no se tiene una referencia al 'this'
	
	public static int valDiv2() {
		//suma(); error no se puede por que suma no es static 
//		int resultado = x; error no se puede por que 'x' no es static 
		return valor / 2;
	}

}
