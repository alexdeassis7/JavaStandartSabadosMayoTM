package com.educacionit.programa;

import com.educacionit.modelos.StaticDemo;

public class Test {

	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		StaticDemo obj2 = new StaticDemo();
//cada uno de las instancias tiene su propia copia de la variable x
		obj1.x = 10;
		obj2.x = 12;

		System.out.println("obj1.x y obj2.x son independientes ");
		System.out.println("obj1.x : " + obj1.x);
		System.out.println("obj2.x : " + obj2.x);

		// accedo a una variable estatica directamente
		// mediante el nombre de la clase
		StaticDemo.y = 1000;
		System.out.println("la variable estatica  'y' es compartida .");
		System.out.println("obj1.y : " + obj1.y);
		System.out.println("obj2.y : " + obj2.y);
		System.out.println("StaticDemo.y : " + StaticDemo.y);

		System.out.println("llamamos a un metodo static mediante el nombre la clase ");
		System.out.println(StaticDemo.valDiv2());

	}
}
