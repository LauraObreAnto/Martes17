package Personarepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Personarepository {

	static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	static final String USER = "root";
	static final String PASS = "";
	static final String QUERY = "SELECT * from Personas";

	public void insertar(String nombre, String apellido, int edad) {

		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate("insert into personas values ('" + nombre + "','" + apellido + "'," + edad + ")");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void borrarxnombre(String nombre) {
		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate("DELETE FROM `personas` WHERE  nombre= '" + nombre + "'");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		public void borrarxapellido(String apellido) {
			try {
				Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement sentencia = conexion.createStatement();
				sentencia.executeUpdate("DELETE FROM `personas` WHERE apellido= '" + apellido + "'");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		public void borrarxedad(int edad) {
			try {
				Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement sentencia = conexion.createStatement();
				sentencia.executeUpdate("DELETE FROM `personas` WHERE edad= " + edad + "");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


}
}
