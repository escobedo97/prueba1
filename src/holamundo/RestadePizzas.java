package holamundo;

import java.util.Scanner;

public class RestadePizzas {
	public static void main(String[] args) {
    	int EntradaPizza = 0;
    	int PizzasConsumidas = 0;
    	int resultado = 0;
        Scanner p1 = new Scanner( System.in );
        Scanner p2 = new Scanner( System.in );
		
		 System.out.println ("¿Cuantas rebanas de pizza trajiste?: ");
		 EntradaPizza = p1.nextInt();
		 System.out.println ("¿Cuantas rebanadas de pizza se comieron? : ");
		 PizzasConsumidas = p2.nextInt();
		 resultado = EntradaPizza - PizzasConsumidas ;
		 
		 if(resultado>=0) {
			 System.out.println ("Te sobran "+ resultado + " " + "Rebanas de Pizza");
		 } else{
			 System.out.println ("Estas cotando mal");
		 }
		 

	}
	
	

}
