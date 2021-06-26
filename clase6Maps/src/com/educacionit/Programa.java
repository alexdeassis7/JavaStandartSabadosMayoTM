package com.educacionit;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.educacionit.modelos.JugadorSeleccion;

public class Programa {

	public static void main(String[] args) {

		System.out.println("*******  TreeMap con objetos y clave de tipo String   *******");
		Map<String, JugadorSeleccion> jugadores = new TreeMap<String, JugadorSeleccion>();

		// agrego calves y valores al map
		jugadores.put("Casillas", new JugadorSeleccion(1, "Casillas", "Portero"));
		jugadores.put("Ramos", new JugadorSeleccion(15, "Ramos", "lateral derecho"));
		jugadores.put("Pique", new JugadorSeleccion(13, "Pique", "central"));
		jugadores.put("Puyol", new JugadorSeleccion(5, "Puyol", "central"));
		jugadores.put("Capdevilla", new JugadorSeleccion(11, "Capdevilla", "lateral izquierdo"));
		jugadores.put("Xabi", new JugadorSeleccion(14, "Xabi", "medio centro "));
		jugadores.put("Busquest", new JugadorSeleccion(16, "Busquest", "medio"));
		jugadores.put("Xavi", new JugadorSeleccion(8, "Xavi", "central"));
		jugadores.put("Pedrito", new JugadorSeleccion(18, "Pedrito", "interior izq"));
		jugadores.put("Iniesta", new JugadorSeleccion(6, "Iniesta", "interior derecho"));
		jugadores.put("Villa", new JugadorSeleccion(7, "Villa", "delantero"));
		jugadores.put("pepe", new JugadorSeleccion(7, "Villa", "delantero"));
		// mostramos el map ordenado por sus claves
		for (Entry<String, JugadorSeleccion> jugador : jugadores.entrySet()) {
			String clave = jugador.getKey();
			JugadorSeleccion valor = jugador.getValue();
			System.out.println(clave + " -> " + valor);
		}

	}

}
