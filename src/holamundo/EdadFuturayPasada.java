package holamundo;

import java.util.Scanner;

public class EdadFuturayPasada {
	public static void main(String[] args) {
    	String nombre;
    	int edad = 0;
    	int edadfutura = 0;
    	int edadpasada = 0;
        Scanner n1 = new Scanner( System.in );
        Scanner n2 = new Scanner( System.in );
        Scanner n3 = new Scanner( System.in );
		
		 System.out.println ("Ingresa tu nombre: ");
		 nombre = n1.nextLine();
		 System.out.println ("Ingresar tu edad: ");
		 edad = n2.nextInt();
		 edadfutura = edad + 1;
		 edadpasada = edad - 1;
		System.out.println(nombre + " " + "el año pasado tenía "+ edadpasada + " " + "y el año siguiente tendrá " + edadfutura);
		 

	}

}
