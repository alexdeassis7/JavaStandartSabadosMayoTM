package com.educacionit;

import java.util.Scanner;
//atajo de teclado para identar el codigo  : ctrl + shift + f
//atajo de teclado para comentar : ctrl + shift + c

//ejercicio secuencial :
//Un maestro desea saber que porcentaje de hombres y que
//porcentaje de mujeres hay en un grupo de estudiantes
public class AppPrincipal {

	public static void main(String[] args) {
		// definir la variables de trabajo
		float numHombres = 0, numMujeres = 0, totalAlumnos = 0, porcentajeHombres = 0, porcentajeMujeres = 0;
		Scanner teclado = new Scanner(System.in);

		// que entra ?
		System.out.println("Ingrese por favor la cantidad de mujeres");
		numMujeres = teclado.nextFloat();

		System.out.println("Ingrese por favor la cantidad de Hombres");
		numHombres = teclado.nextFloat();

		// que se procesa?
		totalAlumnos = numHombres + numMujeres;
		porcentajeHombres = numHombres * 100 / totalAlumnos;
		porcentajeMujeres = numMujeres * 100 / totalAlumnos;

		// que sale?
		System.out.println("El total de alumnos es : " + totalAlumnos);
		System.out.println("El porcentaje de mujeres es  : " + porcentajeMujeres);
		System.out.println("El porcentaje de Hombres es  : " + porcentajeHombres);

	}

}
