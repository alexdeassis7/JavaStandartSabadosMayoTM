package com.educacionit;

import java.util.Scanner;

/*7)	Calcular e imprimir la tabla de multiplicar de un número cualquiera.
 *  Imprimir el multiplicando , el multiplicador y el producto*/
public class AppPrincipal {

	public static void main(String[] args) {
		int numeroIngresado = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("que tabla desea conocer?");
		numeroIngresado = teclado.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(numeroIngresado + " X " + i + " = " + (numeroIngresado * i));
		}

	}

}
