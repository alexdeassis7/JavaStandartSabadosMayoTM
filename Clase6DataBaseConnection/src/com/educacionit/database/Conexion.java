package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//esta clase me permite establecer una conexion con la DB (emn este ejemplo mySql)
public class Conexion {

	static String db = "persona"; // nombre de mi base de datos relacional
	static String login = "root";// root es el user por default de mySql
	static String password = "";
	static String url = "jdbc:mysql://localhost/" + db;

	Connection conn = null;

	public Conexion() {
		try {
			// Obtenemos el driver para mySql
			Class.forName("com.mysql.jdbc.Driver");
			// Obtenemos la connection a la base
			conn = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("logramos conectar con la base correctamente");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	// metodo que nos retorna la conexion
	public Connection getConnection() {

		if (conn != null) {
			return conn;
		} else {
			return null;
		}

	}

	// metodo que me permite desconectar de la base de datos
	public void desconectar() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			conn = null;
			System.out.println("Se logro cerrar correctamente la conexion a la DB " + db);
		}
	}

//	public static void main(String[] args) {
//		Conexion conex = new Conexion();
//	}

}
