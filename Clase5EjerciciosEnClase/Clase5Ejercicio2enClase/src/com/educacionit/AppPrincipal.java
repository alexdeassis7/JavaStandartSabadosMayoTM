package com.educacionit;

import java.util.Scanner;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		
		String mensaje = "";
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un mensaje a enviar:");
		mensaje = teclado.next();
		
		mensaje(mensaje);
		System.out.println("Mensaje enviado!");
		
	}
	
	public static void mensaje(String mensaje) {
		
		System.out.println(mensaje);
		
	}
	

}