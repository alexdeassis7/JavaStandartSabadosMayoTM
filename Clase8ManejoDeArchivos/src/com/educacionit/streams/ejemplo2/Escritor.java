package com.educacionit.streams.ejemplo2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

//Escribimos un archivo caracter a caracter
public class Escritor {

	public static void main(String[] args) throws IOException {

		File outputFile = new File("archivoES" + File.separator + "salida" + File.separator + "destino.txt");

		// FileWriter : es una clase concretautilizada para crear un streams y escribir
		// un archivo de texto
		// FileWriter out = new FileWriter(outputFile);

		// utilizando este constructor puedo hacer un append y no me sobreescribe el
		// archov , tan solo lo agrega al final
		FileWriter out = new FileWriter(outputFile, true);

		String info = JOptionPane.showInputDialog("Escribir la info que desea guardar en el archivo destino.txt");

		for (int i = 0; i < info.length(); i++) {
			out.write(info.charAt(i));
		}

		// cierro el streams
		out.close();
		System.out.println("El archivo ha sido escrito correctamente ...");

	}

}
