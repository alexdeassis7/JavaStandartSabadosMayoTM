package com.educacionit.programa;

import com.educacionit.Bolsa;
import com.educacionit.Chocolatina;
import com.educacionit.Golosina;

public class Principal {

	public static void main(String[] args) {

		Bolsa bolsa = new Bolsa(5);// bolsa que contendra maximo 5 golosinas/chocolatinas

		// productos con los que llenaremos la bolsa
		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("ferrero");
		Chocolatina c2 = new Chocolatina("cofler");
		Golosina g1 = new Golosina("gomitas");
		Golosina g2 = new Golosina("chicle");
//		Golosina g3 = new Golosina("chicle");
		
		// agregamos todos los elemento a nuestra bolsa
		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(g1);
		bolsa.add(g2);
//		bolsa.add(g3); 

		// recorremos la bolsa con un for each
		for (Object o : bolsa) {
			if (o instanceof Chocolatina) {
				Chocolatina chocolatina = (Chocolatina) o;
				System.out.println(chocolatina.getMarca());
			} else {
				Golosina golosina = (Golosina) o;
				System.out.println(golosina.getNombre());
			}
		}

	}

}
