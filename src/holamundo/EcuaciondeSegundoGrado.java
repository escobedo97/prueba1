package holamundo;

import java.util.Scanner;

public class EcuaciondeSegundoGrado {
	public static void main(String[] args) {
		int num1 = 0;
    	int num2 = 0;
    	int num3 = 0;
    	
    	Scanner n1 = new Scanner( System.in );
        Scanner n2 = new Scanner( System.in );
        Scanner n3 = new Scanner( System.in );
        
        System.out.println("Introduce el valor del numero 1");
        num1=n1.nextInt();
        System.out.println("Introduce el valor del numero 2");
        num2=n2.nextInt();
        System.out.println("Introduce el valor del numero 3");
        num3 =n3.nextInt();
  
        double discriminante=Math.pow(num2, 2)-(4*num1*num3);
  
        System.out.println("El resultado es: "+discriminante);
  
        if (discriminante>0){
            double x1=((num2*(-1))+Math.sqrt(discriminante))/(2*num1);
            double x2=((num2*(-1))-Math.sqrt(discriminante))/(2*num1);
  
            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
    }

}
