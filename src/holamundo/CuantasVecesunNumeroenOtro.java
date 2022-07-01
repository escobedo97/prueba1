package holamundo;

import java.util.Scanner;

public class CuantasVecesunNumeroenOtro {
	public static void main(String[] args) {
    	int numeromayor = 0;
    	int numeromenor = 0;
    	int resultado = 0;
    	
        Scanner n1 = new Scanner( System.in );
        Scanner n2 = new Scanner( System.in );
        
		
		 System.out.println ("Ingresar numero mayor a 1000: ");
		 numeromayor = n1.nextInt();
		 System.out.println ("Ingresar numero menor a 100: ");
		 numeromenor = n2.nextInt();
		 
		 
		 if (numeromayor < 1000 || numeromenor > 100) {
			
			 System.out.println("Valores Ingresador Incorrectos. Vuelve a Intentar");
		 }else {
			    resultado = numeromayor / numeromenor;
			    System.out.println("El Numero 2 cabe" + " " + resultado + " Veces en el Numero 1");
			    
		 }
	}
}

	
