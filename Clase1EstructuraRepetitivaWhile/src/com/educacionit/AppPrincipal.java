package com.educacionit;

import java.util.Scanner;

public class AppPrincipal {
	/*
	 * 1) Calcular el promedio de un alumno que tiene 7 calificaciones en la materia
	 * de Diseño Estructurado de Algoritmos.
	 */
	public static void main(String[] args) {

		final int CANTIDAD_DE_CALIFICACIONES = 7;
		float calificacionesIngresadas = 0, promedio = 0;
		Scanner teclado = new Scanner(System.in);
		int contador = 1;

		while (contador <= CANTIDAD_DE_CALIFICACIONES) {
			System.out.println("ingrese por favor la nota " + contador);
			calificacionesIngresadas += teclado.nextFloat();
			contador++;
		}

		promedio = calificacionesIngresadas / CANTIDAD_DE_CALIFICACIONES;

		System.out.println("Suma de todas las calificaciones : " + calificacionesIngresadas);
		System.out.println("su promedio es de: " + promedio);

		System.out.println("Fin APP");
	}

}
