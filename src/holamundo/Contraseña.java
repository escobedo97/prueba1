package holamundo;

import java.util.Scanner;

public class Contrase�a {
	public static void main(String[] args) {
	
	        Scanner n1 = new Scanner(System.in);
	        String contrase�a="becajava";
	        String password;
	        int intentos = 3;
	        boolean acierto=false;
	  
	        for (int i=0;i<intentos && !acierto;i++){
	            System.out.println("Introduce una contrase�a");
	            password = n1.next();
	  
	              if (password.equals(contrase�a)){
	                System.out.println("Enhorabuena");
	                acierto=true;
	            }
	        }
	    }
	}



