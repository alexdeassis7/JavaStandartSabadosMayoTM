package com.educacionit.programa;

import com.educacionit.modelos.Documento;
import com.educacionit.modelos.Persona;

public class AppPrincipal {

	public static void main(String[] args) {
		// instanciamos objetos del tipo Persona mediante una invocacion a su
		// constructor
		Persona juan = new Persona(); // invocacion al constructor vacio !

		Documento miDocumento = new Documento("dni", 369887456);
		// invocamos al constructor con todos los parametros
		Persona lisandro = new Persona(-89, "lisandro", "Reinozo", 'm', miDocumento, 1.70f, "5/2/1998");
		// invocamos al contructor con dos parametros
		Persona marcelo = new Persona("Marcelo", "Martinez");

		// invocamos al metodo toString() para conocer el estado de los
		// atributos de un objeto en particular
		System.out.println("juan " + juan.toString());
		System.out.println("lisandro " + lisandro.toString());
		System.out.println("marcelo " + marcelo.toString());

		System.out.println("modificamos el estado de los atributos del objeto Juan");

		// invocamos al metodo toString() para conocer el estado de los
		// atributos de un objeto en particular
		System.out.println("juan " + juan.toString());
		System.out.println("lisandro " + lisandro.toString());
		System.out.println("marcelo " + marcelo.toString());

		// invocamos la metodo estudiar()
		juan.estudiar();

		// invocamos la metodo caminar()
		juan.caminar();

		System.out.println("**************invocamos a los metodos del objeto lisandro **************");
		lisandro.estudiar();
		lisandro.caminar(12);
		System.out.println("**************invocamos a los metodos del objeto marcelo **************");
		marcelo.estudiar("matematicas");
		marcelo.caminar(14);
		System.out.println("########## Marcelo ########");
		System.out.println(marcelo.toString());

		// obtenemos el estado de el atributo edad de marcelo

		System.out.println("edad marce:" + marcelo.getEdad());
		marcelo.setEdad(38);
		marcelo.setSexo('m');
		System.out.println("edad marce:" + marcelo.getEdad());

	}
}
