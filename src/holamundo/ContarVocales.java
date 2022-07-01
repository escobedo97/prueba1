package holamundo;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		String palabra ="";
		int contador = 0;
		Scanner pal1 = new Scanner (System.in);
		
		System.out.println ("Ingresar la palabra: ");
        palabra = pal1.nextLine();
		
		for(int i=0;i<palabra.length();i++) {
			 if ((palabra.charAt(i)=='a') || (palabra.charAt(i)=='e') || (palabra.charAt(i)=='i') || (palabra.charAt(i)=='o') || (palabra.charAt(i)=='u')){ 
			    contador++;
			  }
			 
			}
		System.out.println("La palabra " + palabra + " " + "contiene " + contador + " vocales");
      }
  }
