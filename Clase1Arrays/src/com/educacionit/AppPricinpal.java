package com.educacionit;
/*2)	Llenar dos vectores A y B de 45 elementos cada uno, sumar el elemento 
 * uno del vector A con el elemento uno del vector B y así sucesivamente hasta 45,
 *  almacenar el resultado en un vector C, e imprimir el vector resultante por pantalla.
 */

public class AppPricinpal {

	public static void main(String[] args) {

		final int CANTIDAD = 45;

		double a[] = new double[CANTIDAD];
		double b[] = new double[CANTIDAD];
		double c[] = new double[CANTIDAD];

		for (int i = 0; i < CANTIDAD; i++) {

			a[i] = Math.random() * 11;
			b[i] = Math.random() * 11;
			c[i] = a[i] + b[i];
			System.out.println("Elemento" + i + " " + a[i] + "   +    " + b[i] + "  =  " + c[i]);
		}

	}

}
