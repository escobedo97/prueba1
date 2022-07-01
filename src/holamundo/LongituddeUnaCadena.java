package holamundo;

import java.util.Scanner;

public class LongituddeUnaCadena {
	public static void main(String[] args) {
		
    	String texto1 = "";
    	String texto2 = "";
    	Scanner p1 = new Scanner( System.in );
        Scanner p2 = new Scanner( System.in );
        
        System.out.println ("¿Ingresar la primera palabra?: ");
        texto1 = p1.nextLine();
        System.out.println ("¿Ingresar la segunda palabra?: ");
        texto2 = p2.nextLine();
        
        
    	
        System.out.println("Longitud de una cadena es:" + texto1.length());       
         
        System.out.println("Longitud de una cadena es:" + texto2.length());  
    }

}
