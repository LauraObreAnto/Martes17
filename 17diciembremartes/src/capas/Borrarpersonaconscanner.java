package capas;

import java.util.Scanner;

public class Borrarpersonaconscanner {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	Personarepository2 repositorio = new Personarepository2();
	
	
	try {
		String parametro = sc.nextLine();
		System.out.println(parametro);
		Persona persona=new Persona();
		String nombreborrado = persona.getNombre();
		String apellidoborrado = persona.getApellido();
		int edadborrado = persona.getEdad();
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
