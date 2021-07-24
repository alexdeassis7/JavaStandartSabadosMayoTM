package com.educacionit.streams.ejemplo5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorMejorado {

	public static void main(String[] args) throws IOException {

		//si el archivo no existe y tenemos permisos de escritura en el directorio 
		//se crea un archivo nuevo 
		File outputFile = new File(
				"archivoES" + File.separator + "salida" + File.separator + "bufferedWriterOutPut.txt");

		String linea1 = "soy la primer linea";
		String linea2 = "soy la segunda linea";
		String linea3 = "soy la tercera linea";

		BufferedWriter writerMejorado = new BufferedWriter(new FileWriter(outputFile));

		// escribimos el archivo a traves del Buffered Writer
		writerMejorado.write(linea1, 0, linea1.length());// escribo el string desde su inicio "0" a fin
		// creo una linea en blanco
		writerMejorado.newLine();

		writerMejorado.write(linea2, 0, linea2.length());// escribo el string desde su inicio "0" a fin
		// creo una linea en blanco
		writerMejorado.newLine();

		writerMejorado.write(linea3, 0, linea3.length());// escribo el string desde su inicio "0" a fin
		// creo una linea en blanco
		writerMejorado.newLine();

		// cierro el Buffered Writer para liberar los recursos
		writerMejorado.close();

		System.out.println("Se escribio las tres lineas en el archivo " + outputFile.getName());
	}

}
