package com.educacionit.streams.ejemplo8;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UsoDeFileProperties {

	public static void main(String[] args) {
		// Instanciamos el objeto properties
		Properties propiedades = new Properties();

		try {
			// cargammos el archivo utilizando la ruta relativa donde esta el proyecto
			propiedades.load(new FileInputStream("src/database.properties"));

			// leemos las propiedades del archivo
			//String driver = propiedades.getProperty("db.driver");
			String url = propiedades.getProperty("db.url");
			String usuario = propiedades.getProperty("db.user");
			String clave = propiedades.getProperty("db.pass");

			System.out.println("el driver es " + propiedades.getProperty("db.driver"));
			System.out.println("La url es :" + url);
			System.out.println("el usuario es :" + usuario);
			System.out.println("La clave es : " + clave);

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
	}

}
