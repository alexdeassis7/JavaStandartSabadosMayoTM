package com.educacionit;

import java.util.Scanner;

/*Determine si un alumno aprueba o reprueba un curso , sabiendo que aprobara si
 * su promedio de tres calificaciones es mayor o igual a 7 , reprueba en caso contrario  * */

public class AppPrincipal {

	public static void main(String[] args) {
		final int CANTIDAD_DE_NOTAS = 3; // defino una constante

		float nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("ingrese por favor la nota 1");
		nota1 = teclado.nextFloat();

		System.out.println("ingrese por favor la nota 2");
		nota2 = teclado.nextFloat();

		System.out.println("ingrese por favor la nota 3");
		nota3 = teclado.nextFloat();

		promedio = (nota1 + nota2 + nota3) / CANTIDAD_DE_NOTAS;

		if (promedio >= 7) {
			System.out.println("el alumno esta aprobado ");
		} else {
			System.out.println("el alumno NO esta aprobado ");
		}

		System.out.println("El promedio fue de : " + promedio);

	}

}
