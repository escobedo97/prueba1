package holamundo;

import java.util.Scanner;

public class DividelaCuenta {
	public static void main(String[] args) {
		float total = 0;
		int personas = 0;
		float propina = 0;
		float propinafinal = 0;
		float porcentajeimpuestos = 0;
		float impuesto = 0;
		float calculo = 0;
		float totalapagar = 0;
		
		Scanner n1 = new Scanner( System.in );
        Scanner n2 = new Scanner( System.in );
        Scanner n3 = new Scanner( System.in );
        Scanner n4 = new Scanner (System.in );
		
		 System.out.println ("¿Cuanto es el total que se debe pagar? ");
		 total = n1.nextFloat();
		 System.out.println ("¿Cuantas personas van a pagar? ");
		 personas = n2.nextInt();
		 System.out.println ("¿Cual es el porcentaje de propina que se va a pagar? ");
		 propina = n3.nextInt();
		 System.out.println ("¿Cual es el porcetaje de impuestos que se van a pagar? ");
		 porcentajeimpuestos = n4.nextInt();
		 
		 
		 propinafinal = (propina / 100) * total;
		 System.out.println("La propina final es: "+ propinafinal);
		 
		 total = total + propinafinal;
		 
		  impuesto = (porcentajeimpuestos / 100) * total;
		  System.out.println("El impuesto es: "+ impuesto);
		  
		  totalapagar = impuesto + total;
		  System.out.println("El total a pagar es: "+ totalapagar);
		  
		  calculo = (total + impuesto) / personas;
		  System.out.println("El total a pagar por persona es: "+ calculo);
		
		}
	
}
