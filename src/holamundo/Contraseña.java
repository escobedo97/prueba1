package holamundo;

import java.util.Scanner;

public class Contraseņa {
	public static void main(String[] args) {
	
	        Scanner n1 = new Scanner(System.in);
	        String contraseņa="becajava";
	        String password;
	        int intentos = 3;
	        boolean acierto=false;
	  
	        for (int i=0;i<intentos && !acierto;i++){
	            System.out.println("Introduce una contraseņa");
	            password = n1.next();
	  
	              if (password.equals(contraseņa)){
	                System.out.println("Enhorabuena");
	                acierto=true;
	            }
	        }
	    }
	}



