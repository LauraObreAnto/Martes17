package capas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Personarepository2 {

	static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	static final String USER = "root";
	static final String PASS = "";
	static final String QUERY = "SELECT * from Personas";

	public void insertar(Persona persona) {

		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate("insert into personas values ('" + persona.getNombre() + "','" + persona.getApellido() + "'," + persona.getEdad() + ")");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void borrarxnombre(Persona persona) {
		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate("DELETE FROM `personas` WHERE  nombre= '" + persona.getNombre() + "'");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		public void borrarxapellido(Persona persona) {
			try {
				Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement sentencia = conexion.createStatement();
				sentencia.executeUpdate("DELETE FROM `personas` WHERE apellido= '" + persona.getApellido() + "'");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		public void borrarxedad(Persona persona) {
			try {
				Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement sentencia = conexion.createStatement();
				sentencia.executeUpdate("DELETE FROM `personas` WHERE edad= " + persona.getEdad() + "");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


}
}
