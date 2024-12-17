package capas;

import java.util.Scanner;

public class Insertarpersonaconscanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Personarepository2 repositorio = new Personarepository2();

		System.out.println("Introduzca los parámetros correspondientes");
		System.out.println("Nombre");
		String nombre = sc.next();
		System.out.println("Apellido");
		String apellido = sc.next();
		System.out.println("Edad");
		int edad = sc.nextInt();
		Persona persona=new Persona(nombre,apellido, edad);
		repositorio.insertar(persona);

	}

}
