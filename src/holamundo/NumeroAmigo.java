package holamundo;

import java.util.Scanner;

public class NumeroAmigo {

	public static void main(String[] args) {
		int suma = 0; 
		int num1 = 0; 
		int num2 = 0;
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
        
        System.out.print("Introduce primer número: ");
        num1 = n1.nextInt();
        System.out.print("Introduce segundo número: ");
        num2 = n1.nextInt();
  
        for(int i = 1;i < num1;i++){                                   
             if(num1%i==0){
                suma=suma+i;
             }
        }
  
        
        if(suma==num2){
           suma=0;
           for(int i = 1;i < num2;i++){                                             
                if(num2%i==0){
                   suma=suma+i;
                }
            }
           
           if(suma==num1){
              System.out.println("Son Amigos");
           }else{
              System.out.println("No son amigos");
           }
        }        
        else{
             System.out.println("No son amigos");
        }

	}

}
