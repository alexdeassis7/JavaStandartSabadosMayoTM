package com.educacionit.laboratorio.set;

import java.util.Iterator;
import java.util.TreeSet;

import com.educacionit.laboratorio.entidades.Producto;

public class Mercado3 {

	public static void main(String[] args) {
		// definimos 6 instancias de la clase Producto
		String m = new String("Pan");
		String n = new String("Leche");
		String o = new String("Manzanas");
		String p = new String("Brocoli");
		String q = new String("Carne");
		String r = new String("Manzanas");
		
		
		// Definimos un TreeSet
		TreeSet mandado = new TreeSet();

		// colocar instancias de producto en HashSet
		mandado.add(m);
		mandado.add(n);
		mandado.add(o);
		mandado.add(p);
		mandado.add(q);
		mandado.add(r);

		//Aunque  son insertados 6 elementos , el hastSet solo contiene 5
		//esto se debe a que un SET NO PERMITE ELEMENTOS DUPLICADOS 
		//A pesar de que "r" y "o" son objetos distintos , el TreeSet detecta
		//que el elementos "manzanas" esta duplicado 
		
		// Imprimir contenido del HashSet
		System.out.println("- Lista de mandado con " + mandado.size() + " elementos.");

		// Definir un Iterator para extraer/imprimir valores
		for (Iterator it = mandado.iterator(); it.hasNext();) {
				String x = (String)it.next();
				System.out.println(x);
		}
			
		//NO SE PUEDE ELIMINAR ELEMENTO POR INDICE 
		//Un HashSEt no ofrece este mecanismo, solo eliminacion por valor de OBjeto 
				
		//eliminar todo slos elementos del ArraysList
		mandado.clear();
		// Imprimir contenido de ArrayList
		System.out.println("- Lista de mandado final con " + mandado.size() + " elementos.");
		
	}

}
