package com.educacionit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AppPrincipal {

	public static void main(String[] args) {
		// maps : permite alamacenar claves : valores (se las suele llamar diccionarios
		// en otros lengujes)
		// internamente implementan estructuras de Datos de los arboles

		System.out.println("los principales metodos de Maps");
		//declaramos un map (Un hash map ) con clave "integer" y valor "String"
		//el generico debe ser si o si una clase ! no puede ser un atomico
		Map<Integer ,String> nombreMap = new HashMap<Integer,String>();
		nombreMap.size();//retorna el numero de elemento del map 
		nombreMap.isEmpty();// retorna true si no hay elemento en el AMp y false si si los hay
		nombreMap.put(2, "soy el valor ");
		nombreMap.get(3);//retonar el valor de la clave enviada o null si la clave no existe 
		nombreMap.clear();//borra todo los componentes del map
		nombreMap.remove(4);//borra el par clave/valor del mapa 
		nombreMap.containsKey(5);//retorna true si en el map hay una clave que coincide con el 5
		nombreMap.containsValue("soy el valor magico "); // retorna true si el valor existe en el mapa
		nombreMap.values();//retorna una "colletion" con todos los valores de map 
		
		//implementacion o clases
		//HashMap : los elementos que inserta en el map no tendran ningun orden especifico 
		// TreeMap: ordena los elementos de forma natural , por ejemplo si la clave son enteros 
					// los ordena de menor a mayor 
		//LinkedhashMap : inserta en el map los elementos en el orden en que se fueron agregando 
	
		//HASH MAP 
		
		//Map<Integer , String > map = new HashMap<Integer, String>();
		
		//Tree MAP 
		
		Map<Integer , String > map = new TreeMap<Integer, String>();
				
		// LinkedHashMap MAP 
		
	   //Map<Integer , String > map = new LinkedHashMap<Integer, String>();
					
		map.put(1, "Casillas");
		map.put(3, "Pique");
		map.put(11, "Capdevilla");
		map.put(16, "Busquets");
		map.put(18, "Pedrito");
		map.put(7, "Villa");
		map.put(15, "Ramos");
		map.put(5, "Puyol");
		map.put(14, "Xabi Alonso");
		map.put(8, "Xavi Hernandez");
		map.put(6, "iniesta");
		
		//imprimimos el map con un iterator 
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("clave : " + key + " => " + map.get(key));
		}
		
		System.out.println("**********Trabajamos con los metodos de Map********");
		System.out.println("mostramos el num de elem que tiene el map : " + map.size());
		System.out.println("Vemos si el map esta vacio : " + map.isEmpty());
		System.out.println("obtenemos un elemento del map pasandole al clave 6 : " + map.get(6) );
		System.out.println("borramos un elem del map , el 18 :" + map.remove(18));
		System.out.println("vemos que pasa si queremos obtener la clave 18 que ya no existe :" + map.get(18) );
		System.out.println("vemos si existe un elem con la clave 1 : " + map.containsKey(1));
		System.out.println("vemos si existe el valor Villa : " + map.containsValue("Villa"));
		System.out.println("borramos todos los eleme del map : ") ; map.clear();
		System.out.println("comprobamos si lo hemos eliminado por completo chequeando su tamaño : " + map.size());
		System.out.println("lo comprpobamos tambien viendo si esta vacio : " + map.isEmpty());
		
	}

}
