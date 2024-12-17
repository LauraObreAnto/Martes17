package borrarenSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ejercicioborrarpersonasscanner {

	static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	static final String USER = "root";
	static final String PASS = "";
	static final String QUERY = "SELECT * from Personas";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Open a connection
		try {
			Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conexion.createStatement();
			System.out.println("Introduzca un parámetro para borrar la persona");
			String parametro = sc.nextLine();
			System.out.println(parametro);
			String nombre = "";
			String apellido = "";
			int edad = 0;
			if (parametro.equals("nombre")) {
				nombre=sc.nextLine();
				sentencia.executeUpdate("DELETE FROM `personas` WHERE  nombre= '" + nombre + "'");
			} else if (parametro.equals("apellido")) {
				apellido = sc.nextLine();
				sentencia.executeUpdate("DELETE FROM `personas` WHERE apellido= '" + apellido + "'");
			} else if (parametro.equals("edad")) {
				edad = sc.nextInt();
				sentencia.executeUpdate("DELETE FROM `personas` WHERE edad= " + edad + "");
			} else
				System.out.println("No existe");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
