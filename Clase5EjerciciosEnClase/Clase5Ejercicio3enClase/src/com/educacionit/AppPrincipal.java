package com.educacionit;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		
		int teclaIngresada = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese una tecla del 1 al 3:");
		teclaIngresada = teclado.nextInt();
		
		mensaje(teclaIngresada);
		
	}
	
	public static void mensaje(int teclaIngresada) {
		
		switch (teclaIngresada) {
		
		case 1:
			System.out.println("Ha ingresado la tecla 1");
			break;
		case 2:
			System.out.println("Ha ingresado la tecla 2");
			break;
		case 3:
			System.out.println("Ha ingresado la tecla 3");
			break;
		
		}
		
	}

}
