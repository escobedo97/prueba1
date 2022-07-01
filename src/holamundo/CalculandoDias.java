package holamundo;

import java.util.Scanner;

public class CalculandoDias {
	 public static void main(String[] args) {
	    	int cantidaddias = 0;
	    	int horas = 0;
	    	int minutos = 0;
	    	int segundos = 0;
	        Scanner n1 = new Scanner( System.in );
	        Scanner n2 = new Scanner( System.in );
	        Scanner n3 = new Scanner( System.in );
			
			 System.out.println ("Ingresar la cantidad de Días: ");
			 cantidaddias = n1.nextInt();
			 
			 horas = cantidaddias * 24;
			 minutos = cantidaddias * 1440;
			 segundos = cantidaddias *86400;
			 
			 System.out.println(cantidaddias + " " +  "dia(s) tiene" + " " + horas + " " + " horas" + " " + minutos + " " + "minutos" + " " + segundos +  " " + "segundos");
			
	 }

}


