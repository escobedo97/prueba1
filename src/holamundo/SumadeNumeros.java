package holamundo;

import java.util.Scanner;

public class SumadeNumeros {

	public static void main(String[] args) {
		int numero = 0;
		int suma = 0;
		Scanner num1 = new Scanner (System.in);
		
		System.out.println ("Ingresar el Numero a Sumar: ");
        numero = num1.nextInt();
        
        for(int i = 1; i <= numero; i++){
            suma = suma + i;
        }
        System.out.println(suma);
    }
}


