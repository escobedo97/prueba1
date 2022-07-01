package holamundo;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		Scanner lastname = new Scanner(System.in);
		String reto1;
		String reto2;
		
		 System.out.println ("Ingresar tu Nombre: ");
		 reto1 =name.nextLine();
		 System.out.println ("Ingresar tu Apellido: ");
		 reto2 = lastname.nextLine();
		System.out.println("Hola "+ reto1 + " " + reto2);
		 

	}

}
