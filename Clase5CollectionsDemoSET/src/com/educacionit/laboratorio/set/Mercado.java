package com.educacionit.laboratorio.set;

import java.util.ArrayList;
import java.util.Iterator;

import com.educacionit.laboratorio.entidades.Producto;

public class Mercado {

	public static void main(String[] args) {
		// definimos 5 instancias de la clase Producto

		Producto m = new Producto("Pan", 6);
		Producto n = new Producto("Leche", 2);
		Producto o = new Producto("Manzanas", 5);
		Producto p = new Producto("Brocoli", 2);
		Producto q = new Producto("Carne", 2);

		// Definimos un arrayList
		ArrayList mandado = new ArrayList();

		// colocar instancias de producto en ArrayList
		mandado.add(m);
		mandado.add(n);
		mandado.add(o);
		mandado.add(p);
		mandado.add(q);

		// indicamos el indice de inserción
		mandado.add(1, q);

		mandado.add(o);
		

		// Imprimir contenido de ArrayList
		System.out.println("- Lista de mandado con " + mandado.size() + " elementos.");

		// Definir un Iterator para extraer/imprimir valores
		for (Iterator it = mandado.iterator(); it.hasNext();) {
				Producto x = (Producto)it.next();
				System.out.println(x.getNombre() + ":" + x.getCantidad());
		}

		//eliminar elemento de ArrayList
		mandado.remove(2);
		// Imprimir contenido de ArrayList
		System.out.println("- Lista de mandado con " + mandado.size() + " elementos.");

		// Definir un Iterator para extraer/imprimir valores
		for (Iterator it2 = mandado.iterator(); it2.hasNext();) {
				Producto x = (Producto)it2.next();
				System.out.println(x.getNombre() + ":" + x.getCantidad());
		}
		
		
		//eliminar todo slos elementos del ArraysList
		mandado.clear();
		// Imprimir contenido de ArrayList
		System.out.println("- Lista de mandado con " + mandado.size() + " elementos.");
		
	}

}
