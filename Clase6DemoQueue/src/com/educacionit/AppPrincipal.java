package com.educacionit;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AppPrincipal {
	
	public static void main(String[] args) {
		Queue<String> cola1 = new LinkedList<String>();
		System.out.println("insertamos tres elementos en la cola :juan , ana y luis");
		
		cola1.add("juan");
		cola1.add("ana");
		cola1.add("luis");
			
		System.out.println("Cantidad de elementos en la cola: " + cola1.size());
		System.out.println("Extraemos un elemento de la cola: " + cola1.poll());
		System.out.println("Cantidad de elementos en la cola: " + cola1.size());
		System.out.println("Consultamos el primer elemento de la cola sin extraerlo: " + cola1.peek());
		System.out.println("Cantidad de elementos en la cola: " + cola1.size());
		
		System.out.println("Extraemos uno a uno cada elemento de la cola mientras no este vacía");
		
		while(!cola1.isEmpty()) {
			System.out.print("desencolamos :" );
			System.out.println(cola1.poll() );
		}
		

		Queue<Integer> cola2 = new LinkedList<Integer>();
		cola2.add(70);
		cola2.add(120);
		cola2.add(6);
		
		System.out.println("imprimimos la cola2 de enteros");
		for(Integer elemento : cola2) {
			System.out.print(elemento+ "-");
		}
		System.out.println();
		System.out.println("Borramos todos los elementos de la cola2 ");
		cola2.clear();
		
		System.out.println("Cantidad de elementos en la cola2: " + cola2.size());
	
		//************************** cola de prioridades
		PriorityQueue<Integer> colaPrioritaria = new PriorityQueue<Integer>();
		colaPrioritaria.add(70);
		colaPrioritaria.add(120);
		colaPrioritaria.add(6);
		
		System.out.println("imprimimos la cola con prioridades de enteros "); 
		while(!colaPrioritaria.isEmpty())
			System.out.print(colaPrioritaria.poll() + " - ");
		
		
	}

}
