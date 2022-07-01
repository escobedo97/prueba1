package holamundo;

import java.util.Scanner;

public class Cifras {
	public static void main(String[] args) {
    	int numero = 0;
    	int contador = 0;
    	Scanner num1 = new Scanner (System.in);
    	
    	do {
    		System.out.println("Introduce un numero");
            numero=num1.nextInt();
    	}while (numero < 0);
    	
    	for(int i=numero;i>0;i/=10){
    		contador++;
     }
    	if (contador==1){
            System.out.println("El numero "+numero+ " tiene "+contador+" cifra");
        }else{
            System.out.println("El numero "+numero+ " tiene "+contador+" cifras");
        }
    	

	}

}
