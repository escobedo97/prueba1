package holamundo;

import java.util.Scanner;

public class MultiplodeunNumero {

	public static void main(String[] args) {
		int multiplo = 0;
		int contador = 0;
		Scanner num1 = new Scanner( System.in );
        Scanner num2 = new Scanner( System.in );
        
        System.out.print("�De qu� n�mero quieres los m�ltiplos?: ");
        multiplo = num1.nextInt();

       System.out.print("�Hasta qu� n�mero quieres la lista?: ");
        contador = num2.nextInt();
        
        for (int i=1; i <=contador; i++) {

        	if (i % multiplo == 0)
        	 System.out.println("Los Multiplos del numero " + multiplo + " " + "son: "+ i);

        	   }
			}
		}
