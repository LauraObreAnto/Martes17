package capas;

import java.sql.SQLException;
import java.util.Scanner;

public class Scannerpersona {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Personarepository2 repositorio = new Personarepository2();
		
		System.out.println("¿Añadir o borrar?");

		String respuesta = sc.nextLine();
		if (respuesta.equals("añadir")) {

			System.out.println("Introduzca los parámetros correspondientes");
			System.out.println("Nombre");
			String nombre = sc.next();
			System.out.println("Apellido");
			String apellido = sc.next();
			System.out.println("Edad");
			int edad = sc.nextInt();
			Persona persona=new Persona(nombre,apellido, edad);
			repositorio.insertar(persona);
		} else if (respuesta.equals("borrar")) {
			System.out.println("Introduzca un parámetro para borrar la persona");
			try {
				String parametro = sc.nextLine();
				System.out.println(parametro);
				String nombreborrado = "";
				String apellidoborrado = "";
				int edadborrado = 0;
				if (parametro.equals("nombre")) {
					nombreborrado = sc.nextLine();
					repositorio.borrarxnombre(nombreborrado);
				} else if (parametro.equals("apellido")) {
					apellidoborrado = sc.nextLine();
					repositorio.borrarxapellido(apellidoborrado);
				} else if (parametro.equals("edad")) {
					edadborrado = sc.nextInt();
					repositorio.borrarxedad(edadborrado);

				} else {
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
