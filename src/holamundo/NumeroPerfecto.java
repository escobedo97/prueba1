package holamundo;

import java.util.Scanner;

public class NumeroPerfecto {

	public static void main(String[] args) {
		int suma = 0;
		int numero;
        Scanner num1 = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = num1.nextInt();
        for (int i = 1; i < numero; i++) {                             
            if (numero % i == 0) {
                suma = suma + i;   
            }
        }
        if (suma == numero) {                       
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
	}
}
    