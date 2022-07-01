package holamundo;

import java.util.Scanner;

public class ConversordeMillas {
	public static void main(String[] args) {
    	int millas = 0;
    	int calcular = 0;
   
        Scanner n1 = new Scanner( System.in );
		
		 System.out.println ("Introduce tu distancia en millas: ");
		 millas = n1.nextInt();
		 
		 calcular = (millas * 1609344);
		
		System.out.println("El resultado covertido a KM es : "+ calcular);
		 

	}

}
