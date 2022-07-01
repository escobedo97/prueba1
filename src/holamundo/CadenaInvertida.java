package holamundo;

import java.util.Scanner;

public class CadenaInvertida {
	 public static void main(String[] args) {
		 
		 String cadena = "";
		 String cadenainvertida = "";
		 Scanner cad1 = new Scanner (System.in);
		 
		 System.out.println ("Ingresar la palabra: ");
	        cadena = cad1.nextLine();
	        
		 for (int i=cadena.length()-1;i>=0;i--) {
			 cadenainvertida = cadenainvertida + cadena.charAt(i);}
		 
		 System.out.println(cadenainvertida);
	}
  }
