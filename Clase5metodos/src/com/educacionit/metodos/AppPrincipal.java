package com.educacionit.metodos;

import java.util.Iterator;
import java.util.Scanner;

public class AppPrincipal {

	// metodo de inicio de nuestra app
	public static void main(String[] args) {// algoritmo principal
		System.out.println("inicio del algoritmo principal");
		Scanner teclado = new Scanner(System.in);
		float precioIngresado = 0;

		System.out.println("primer invocacion al procedimiento ");
		mostrarSerieDeNumeros(10, 25);

		System.out.println("segunda invocacion al procedimiento ");
		mostrarSerieDeNumeros(1, 8);
		

		System.out.println("tercera invocacion al procedimiento ");
		mostrarSerieDeNumeros(9, 15);
		
		System.out.println("ingrese por favor el valor del producto ");
		precioIngresado = teclado.nextFloat();
		System.out.println("Usted ingreso el valor : " + precioIngresado);

		// invocamos a la funcion calcularIva() desde nuestro algoritmos principal
		// (main)
		float retornoDeLaFuncion = calcularIva(precioIngresado);

		System.out.println("El iva del producto es : " + retornoDeLaFuncion);
		System.out.println("El precio final a abonar sera de : " + (precioIngresado + retornoDeLaFuncion));

		System.out.println("fin del algoritmo principal");
	}

	// defininimos un metodo de tipo funcion que recibe un
	// parametro de tipo float(precioDelProducto) y retorna
	// un dato de tipo float
	public static float calcularIva(float precioDelProducto) {
		System.out.println("inicio de funcion calcularIva()");
		// cuerpo de mi metodo calculaIva
		float porcentaje = 0.21f;// variable local solo "vive" dentro de el metodo calcularIva()
		float resultado = precioDelProducto * porcentaje;
		System.out.println("fin de funcion calcularIva()");
		return resultado;// valor retornado de la funcion
	}

	// definimos un metodo del tipo procedimiento (void) que NO RETORNA NINGUN
	// VALOR! y recibira
	// dos parametros "minimo" y "maximo"
	public static void mostrarSerieDeNumeros(int minimo, int maximo) {
		System.out.println("ejecutando procedimiento mostrarSerieDeNumeros()");
		for (int i = minimo; i <= maximo; i++) {
			System.out.println(i);
		}
		System.out.println("fin de la ejecucion del procedimiento mostrarSerieDeNumeros()");
	}

	
	
}
