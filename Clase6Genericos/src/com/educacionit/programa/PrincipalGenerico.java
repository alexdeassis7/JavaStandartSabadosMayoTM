package com.educacionit.programa;

import com.educacionit.BolsaGenerica;
import com.educacionit.Chocolatina;
import com.educacionit.Golosina;

public class PrincipalGenerico {

	public static void main(String[] args) {
		// creamos una instancia de la clase generica
		BolsaGenerica<Chocolatina> bolsa = new BolsaGenerica<Chocolatina>(5);

		// agregamos elemento a la bolsaGenerica
		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("ferrero");
		Chocolatina c2 = new Chocolatina("cofler");
		Chocolatina c3 = new Chocolatina("cofler3");
		Chocolatina c4 = new Chocolatina("cofler4");
//		Chocolatina c5 = new Chocolatina("cofler5");

		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(c3);
		bolsa.add(c4);
//		bolsa.add(c5);
		
		System.out.println("recorremos la bolsa Generica de Chocolatinas");
		for (Chocolatina chocolatinaAux : bolsa) {
			System.out.println(chocolatinaAux.getMarca());
		}

		// creamos una instancia de la clase generica
		BolsaGenerica<Golosina> bolsaGenerica = new BolsaGenerica<Golosina>(3);

		Golosina g1 = new Golosina("gomitas");
		Golosina g2 = new Golosina("chicle");
		Golosina g3 = new Golosina("chicle2");
//		Golosina g4 = new Golosina("chicle3");

		bolsaGenerica.add(g1);
		bolsaGenerica.add(g2);
		bolsaGenerica.add(g3);
//		bolsaGenerica.add(g4);
		
		
		System.out.println("recorremos la bolsa Generica de Golosinas");
		for (Golosina gAux : bolsaGenerica) {
			System.out.println(gAux.getNombre());
		}

	}

}
