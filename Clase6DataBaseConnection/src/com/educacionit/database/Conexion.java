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
	
	public static void main(String[] args) {
		Conexion conex = new Conexion();
	}

}
