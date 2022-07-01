package holamundo;

import java.util.Scanner;

public class SumadeunNumero {
	public static void main(String[] args){
		int numero = 0;
		int suma = 0;
		Scanner num1 = new Scanner(System.in);
        
        
        System.out.println("Inserta un numero entero mayor que 1");
        numero = num1.nextInt();
        
         
           if(numero<=1){
               System.out.println("Error. No has introducido un valor correcto."
                       + "Vuelve a intentarlo");
           }
             
       for(int contador=1;contador<=numero;contador++){
            suma+=contador;
        } 
             
        System.out.println("La suma es: "+suma);
         
    }
}


