package com.educacionit.erroresanidados;

public class TryAnidado {
	public static void main(String[] args) {
		// aqui , nums es màs grande que denom
		int nums[] = { 4, 8, 16, 32, 64, 128,  256, 512 ,1024 ,2048};
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		try { // try externo

			for (int i = 0; i < nums.length; i++) {

				try {// try interno anidado

					System.out.println(nums[i] + "/ " + denom[i] + " = " + nums[i] / denom[i]);
					
				} catch (ArithmeticException e) {
					System.out.println("No se puede dividir por cero en lo numeros reales");
					System.out.println("Mensaje:" + e.getMessage());
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No se encontro ningun elemento en el array");
			System.out.println("ERROOOOOOOOR: FIn de la app!" );
		}

	}
}
