package com.educacionit.streams.ejemplo1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Leemos un file caracter a caracter
public class Lector {
	public static void main(String[] args) throws IOException {
//		Path windows :
//		C:\Users\W112550\Documents\AccentureJulio2021
		// Path Linux
		// /c/Users/W112550/Documents/AccentureJulio2021

		File inputFile = new File("archivoES" + File.separator + "entrada" + File.separator + "fuente.txt");
		System.out.println("levantando archivo desde el path :");
		System.out.println("archivoES" + File.separator + "entrada" + File.separator + "fuente.txt");

//		FileReader : genera Streams orientados a caracteres y se encarga de leer el archivo 
		FileReader in = new FileReader(inputFile);

		// DEclaro la variable que contendra el caracter leido del archivo fuente.txt
		int unCaracter;

		while ((unCaracter = in.read()) != -1) {
			System.out.print((char) unCaracter);
		}

//		cerramos el archivo para liberar el recursos
		in.close();

	}
}
