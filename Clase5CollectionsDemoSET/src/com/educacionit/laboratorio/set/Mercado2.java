package com.educacionit.laboratorio.set;


import java.util.HashSet;
import java.util.Iterator;

import com.educacionit.laboratorio.entidades.Producto;

public class Mercado2 {

	public static void main(String[] args) {
		// definimos 5 instancias de la clase Producto

		Producto m = new Producto("Pan", 6);
		Producto n = new Producto("Leche", 2);
		Producto o = new Producto("Manzanas", 5);
		Producto p = new Producto("Brocoli", 2);
		Producto q = new Producto("Carne", 2);

		// Definimos un HashSet
		HashSet mandado = new HashSet();

		// colocar instancias de producto en HashSet
		mandado.add(m);
		mandado.add(n);
		mandado.add(o);
		mandado.add(p);
		mandado.add(q);

	    //doble insercion de Objeto "o"  
		mandado.add(o);
		//Aunque  son insertados 6 elementos , el hastSet solo contiene 5
		//esto se debe a que un SET NO PERMITE ELEMENTOS DUPLICADOS 

		// Imprimir contenido del HashSet
		System.out.println("- Lista de mandado con " + mandado.size() + " elementos.");

		// Definir un Iterator para extraer/imprimir valores
		for (Iterator it = mandado.iterator(); it.hasNext();) {
				Producto x = (Producto)it.next();
				System.out.println(x.getNombre() + ":" + x.getCantidad());
		}
			
		//NO SE PUEDE ELIMINAR ELEMENTO POR INDICE 
		//Un HashSEt no ofrece este mecanismo, solo eliminacion por valor de OBjeto 
				
		//eliminar todo slos elementos del ArraysList
		mandado.clear();
		// Imprimir contenido de ArrayList
		System.out.println("- Lista de mandado final con " + mandado.size() + " elementos.");
		
	}

}
