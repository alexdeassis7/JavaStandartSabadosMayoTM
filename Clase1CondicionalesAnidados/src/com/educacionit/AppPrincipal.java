package com.educacionit;

/*
						4) Calcular la utilidad que un trabajador recibe en el reparto anual de 
						utilidades si este se le asigna como un porcentaje de su salario mensual 
						que depende de su antig�edad en la empresa de acuerdo con la siguiente tabla
						
						Tiempo	Utilidad
						Menos de 1 a�o						5% del salario
						1 a�o o m�s y menos de 2 a�os 		7% del salario
						2 a�os o m�s y menos de 5 a�os		10% del salario
						5 a�os o m�s y menos de 10 a�os		15% del salario
						10 a�os o mas 						20% del salario*/
import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		float salarioMensual = 0, antiguedad = 0, utilidad = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("ingrese su salario Mensual");
		salarioMensual = teclado.nextFloat();

		System.out.println("ingrese su antiguedad en la empresa");
		antiguedad = teclado.nextFloat();

		if (antiguedad < 1) {
			utilidad = salarioMensual * 0.05f;
		} else if ((antiguedad >= 1) && (antiguedad < 2)) {
			utilidad = salarioMensual * 0.07f;
		} else if ((antiguedad >= 2) && (antiguedad < 5)) {
			utilidad = salarioMensual * 0.10f;
		} else if ((antiguedad >= 5) && (antiguedad < 10)) {
			utilidad = salarioMensual * 0.15f;
		} else {
			utilidad = salarioMensual * 0.20f;
		}

		System.out.println("su utilidad sera de " + utilidad + " dolares");

	}

}
