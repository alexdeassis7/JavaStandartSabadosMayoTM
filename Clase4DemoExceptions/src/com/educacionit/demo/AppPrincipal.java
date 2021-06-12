package com.educacionit.demo;

public class AppPrincipal {

	public static int numerador = 10;
	public static Integer denominador = 0;
	public static float division;

	public static void main(String[] args) {
		/*
		 * System.out.println("Antes de hacer la división"); try { // Instrucciones
		 * cuando no hay una Excepción division = numerador / denominador;
		 * 
		 * } catch (ArithmeticException e) { // Instrucciones cuando se produce una
		 * Excepción division = 0; // si hay una excepción doy valor "0" al atributo
		 * 'division' System.out.println("getMessage():" + e.getMessage());
		 * 
		 * } finally { // Instrucciones que se ejecutan ,tanto si hay como si no hay una
		 * Excepción System.out.println("Division :" + division);
		 * System.out.println("Despues de hacer la division "); }
		 */

		/*
		 * int nums[] = new int[10];
		 * 
		 * try { System.out.println("Antes de lanzar la Exception"); nums[25]= 100;
		 * }catch (ArrayIndexOutOfBoundsException exc) { //capturamos la exception
		 * System.out.println("Indice fuera de los limites! ");
		 * System.out.println(exc.getMessage()); }
		 * 
		 * System.out.println("Despues de que se genere la Exception");
		 * 
		 */

		// otro ejemplo con multiples catch
		// aqui , nums es màs grande que denom
		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < nums.length; i++) {
			try {
				System.out.println(nums[i] + " / " + denom[i] + " = " + (nums[i] / denom[i]));
			} catch (ArrayIndexOutOfBoundsException e) {
				// Capturamos la exception de una subclase
				System.out.println("No se encontro ningun elemento para dividir en Denom");
			} catch (Throwable e) {
				// Capturando la Exception de la superclase
				System.out.println("Alguna Exception ocurrió");
			}

		}

	}
}
