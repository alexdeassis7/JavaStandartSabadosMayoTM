package com.educacionit;

import java.util.Scanner;

/*calculo del promedio de tres notas de un alumno y la 
 * definicion de la condicion final de acuerdo al promedio 
   aprobado => promedio >= 7 
   desaprobado => promedio < 7*/
/*Lo resolvemos mediante metodos */
// Subproblema 1: entrada de datos (nota 1, nota 2 y nota 3).
// Subproblema 2: cálculo del promedio.
// Subproblema 3: cálculo de la condición del alumno.
// Subproblema 4: salida de resultados.
public class AppPrincipal {

	// variables globales : se pueden acceder desde cualquier metodo
	static float nota1 = 0, nota2 = 0, nota3 = 0, promedio;
	static Scanner teclado = new Scanner(System.in);
	static String condicionAlumno = "";

	public static void main(String[] args) {
		
		System.out.println("Inicio del algoritmo principal");
		solicitarNotas();// invocamos al metodo 1
		calcularPromedio();// invocamos al metodo 2
		validarCondicion();// invocamos al metodo 3
		mostrarResultados();// invocamos al metodo 4
		System.out.println("Fin del algoritmo principal");
	}

	// Metodo 1 : Procedimiento que solicita los datos al usuario
	public static void solicitarNotas() {
		System.out.println("ingrese nota 1");
		nota1 = teclado.nextFloat();

		System.out.println("ingrese nota 2");
		nota2 = teclado.nextFloat();

		System.out.println("ingrese nota 3");
		nota3 = teclado.nextFloat();

	}

	// Metodo 2 : Procedimiento que Calcula el promedio
	public static void calcularPromedio() {
		promedio = (nota1 + nota2 + nota3) / 3;
	}

	// Metodo 3 : Procedimiento que valida la condicion del alumno
	public static void validarCondicion() {
		if (promedio >= 7) {
			condicionAlumno = "Aprobado";
		} else {
			condicionAlumno = "Desaprobado";
		}
	}

	// Metodo 4 : Procedimmiento que muestra los resultados en pantalla
	// las 3 notas
	// el promedio
	// la condicion (aprobado o no )
	public static void mostrarResultados() {
		System.out.println("Sus notas fueron las siguientes :");
		System.out.println(nota1);
		System.out.println(nota2);
		System.out.println(nota3);
		System.out.println("El Promedio de sus notas es : " + promedio);
		System.out.println("La condicion del Alumno es : " + condicionAlumno);
	}
}
