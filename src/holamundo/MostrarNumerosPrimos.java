package holamundo;

import java.util.Scanner;

public class MostrarNumerosPrimos {
	public static void main(String[] args) {

		int numero = 0;
		int[] primos = new int[0];
		
		 Scanner n1 = new Scanner( System.in );
	     System.out.println ("Ingresar El numero: ");
	     numero = n1.nextInt();
		
		 for (int i = 2; i <= numero; i++) {
			
			boolean primo = true;	
			
			for (int p : primos) {	
				if (i % p == 0) {
					primo = false;	
				}
			}
			if (primo) {
				
				int[] nuevosPrimos = new int[primos.length + 1];
				
				for (int j = 0; j < primos.length; j++) {
					nuevosPrimos[j] = primos[j];
				}
				
				nuevosPrimos[nuevosPrimos.length - 1] = i;
				
				primos = nuevosPrimos;
			}
		}
		
		
		for (int p : primos) {	
			System.out.println("los numeros primos son: "+ p);
		}
		
	}
}
