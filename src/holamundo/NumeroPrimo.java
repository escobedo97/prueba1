package holamundo;

import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner num1 = new Scanner (System.in);
		int numero = 0;
		int divisor = 0;
		
		System.out.println("Ingresar el numero: ");
		numero = num1.nextInt();
		
		for (int i=1; i<=numero; i++ ) {
			if (numero%i == 0) {
				divisor++;
			}
		
		}
		if (numero == divisor) {
			System.out.println(numero + " " + "es un numero primo");
		}else {
			System.out.println(numero + " " + "no es un numero primo");
		}
	}

	
}
