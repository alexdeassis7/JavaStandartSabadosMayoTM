package com.educacionit.streams.ejemplo7;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.swing.JOptionPane;

public class NioEjemplos {

	public static void main(String[] args) {
		// utilizamos java nio
		// String nombreDelDirectorio = JOptionPane.showInputDialog("ingrese el nombre
		// del directorio que desea crear");
		// crearDirectorio(nombreDelDirectorio);

		// copyFile();
		// moverArchivo();
		borrarArchivo();
	}

	public static void borrarArchivo() {
		Path path = Paths.get("login-move.properties");

		try {
			Files.delete(path);
			System.out.println("Se borro el archivo");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void moverArchivo() {
		Path archivoOrigen = Paths.get("datos/login.properties");
		Path rutaDestino = Paths.get("login-move.properties");

		try {
			Files.move(archivoOrigen, rutaDestino, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("se movio el Archivo ");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	public static void copyFile() {
		Path origenArchivo = Paths.get("datos/login.properties");
		Path destinoArchivo = Paths.get("login-copia.properties");

		try {
			Files.copy(origenArchivo, destinoArchivo);
			System.out.println("Se copio el archivo Correctamente");
		} catch (FileAlreadyExistsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void crearDirectorio(String nombreDirectorio) {
		Path path = Paths.get(nombreDirectorio);

		try {
			Path nuevoDirectorio = Files.createDirectory(path);
			System.out.println("se creo el directorio existosamente " + path.getFileName());
		} catch (FileAlreadyExistsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
}
