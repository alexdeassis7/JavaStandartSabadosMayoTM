package com.educacionit.streams.ejemplo6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class StreamFileRemote {

	public static void main(String[] args) {
		// Asi se setean las configuracion de proxy , en caso de necesitarlo
//		Properties systemSettings = System.getProperties();
//		systemSettings.put("proxySet", "true");
//		systemSettings.put("http.proxyHost", "192.168.0.9");
//		systemSettings.put("http.proxyPort", "80");

		try {
			// construimos un objeto url
			URL url = new URL(
					"https://raw.githubusercontent.com/alexdeassis7/JavaStandartSabadosMayoTM/main/Clase1HolaMundo/src/com/educacionit/AppPrincipal.java");

			// contruimos un Stream contra la url donde voy a leer
			BufferedReader elBuffer = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));

			boolean eof = false;
			String unaLinea;

			while (!eof) {
				// leo una linea del archivo remoto
				unaLinea = elBuffer.readLine();

				// mostramos la linea por la consola
				if (unaLinea != null) {
					System.out.println(unaLinea);
				} else {
					eof = true;// cambiamos el flag indicando que se finalizo la lectura del file remote
				}

			}

		} catch (MalformedURLException e) {
			System.out.println("la url es invalida" + e.toString());
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("No se puede leer desde la internet " + e.toString());
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
	}

}
