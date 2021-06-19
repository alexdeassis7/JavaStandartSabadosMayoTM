package com.educacionit.demo;

enum Color {
	// la primera linea dentro del enum debe ser una lista de constantes
	ROJO, VERDE, AZUL;
}

enum Transporte {
	// constantes de enumeracion , cada uno se declara implicitamente como pulbi y
	// static }
	// auto-tipado : el tipo de contantes de enumeracion es el tipo de enumeracion
	// en el que se
	// declaran las contantes , en este seria Trasporte
	COCHE, CAMION, AVION, TREN, BARCO;
}

//cada enum es implementado internamente mediante el uso de class 
/*
 * class Color { public static final Color ROJO = new Color(); public static
 * final Color AZUL = new Color(); public static final Color VERDE = new
 * Color();
 * 
 * }
 * 
 */

public class Test {

	public static void main(String[] args) {

		Color c1 = Color.ROJO;
		System.out.println(c1);

		// una vez definida la enumeracion podemos crear variables de ese tipo
		Transporte tp;

		// como tp es de tipo transporte los unicos valores que puede tomar son los
		// definidos por
		// la enumeracion
		tp = Transporte.AVION;

		if (tp == Transporte.TREN) {
			System.out.println("el enum es un tren ");
		} else {
			System.out.println("el enum NOOOO es un tren ");
		}

		switch (tp) {

		// en las seentencias del case , nommbres de las contantes de enumeracion se
		// usan sin estar calificados
		// por el nombre del tipo de enum , es decir , se utiliza CAMION a secas , no
		// "Transporte.CAMION", Esto
		// se debe a que el tipo de enum en la expresion SWITCH ya ah especificado
		// implicitamente el tipo
		// de enum de las contantes del case

		case COCHE: {
			System.out.println("es un coche ");
			break;
		}
		case CAMION: {
			System.out.println("es un camion ");
			break;
		}
		case TREN: {
			System.out.println("es un tren ");
			break;
		}
		case BARCO: {
			System.out.println("es un barco ");
			break;
		}
		case AVION: {
			System.out.println("es un avion ");
			break;
		}
		default:
			System.out.println("es un objeto volador no identificado ");
		}

		// MEtodos
		// values(): se puede usar para devolver todos los valores presentes dentro del
		// enum
		// valueOf() devuelve la contante enum del valor espesificado , si es que existe
		// Ordinal (): lo utilizamos para encontrar el indice

		// values() ej:
		Color arr[] = Color.values();

		// Enum con bucle
		for (Color col : arr) {
			// llamado a ordinal() para encontrar el indice de color
			System.out.println(col + " en el indice " + col.ordinal());

		}

		System.out.println(Color.valueOf("ROJO"));
		try {
			System.out.println(Color.valueOf("BLANCO"));
		} catch (IllegalArgumentException e) {
			System.out.println("Dentro del Enum no Exciste el BLANCO");
		}
	}
}
