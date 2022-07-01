package holamundo;

import java.util.Scanner;

public class SumadeEnteros {
	
    
    public static void main(String[] args) {
    	int num1 = 0;
    	int num2 = 0;
    	int num3 = 0;
    	int resultado = 0;
        Scanner n1 = new Scanner( System.in );
        Scanner n2 = new Scanner( System.in );
        Scanner n3 = new Scanner( System.in );
		
		 System.out.println ("Ingresar Primer Numero: ");
		 num1 = n1.nextInt();
		 System.out.println ("Ingresar Segundo Numero: ");
		 num2 = n2.nextInt();
		 System.out.println ("Ingresar Tercer Numero: ");
		 num3 = n3.nextInt();
		 resultado = (num1 + num2) * num3 ;
		System.out.println("El resultado es: "+ resultado);
		 

	}
    

}

