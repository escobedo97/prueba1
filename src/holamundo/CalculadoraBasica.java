package holamundo;

import java.util.Scanner;

public class CalculadoraBasica {
public static void main(String[] args) {
		
		int numero1 = 0; 
		int numero2 = 0; 
		int resultado = 0;
		char operacion;
		Scanner num1 = new Scanner (System.in);
		Scanner num2 = new Scanner (System.in);
		Scanner num3 = new Scanner (System.in);
		
		System.out.println("Ingresar el primer numero: ");
		numero1 = num1.nextInt();
		System.out.println("Ingresar el segundo numero: ");
		numero2 = num2.nextInt();
		System.out.println("Ingresar el operador (+ - * /): ");
		operacion = num3.next().charAt(0);
		
		switch(operacion) {
		
		case '+':
			resultado = numero1 + numero2;
			System.out.println("El resultado de la suma es: " + resultado);
			break;
			
		case '-':
			resultado = numero1 - numero2;
			System.out.println("El resultado de la resta es: " + resultado);
			break;
			
		case '*':
			resultado = numero1 * numero2;
			System.out.println("El resultado de la multiplicacion es: " + resultado);
			break;
			
		case '/':
			resultado = numero1 / numero2;
			System.out.println("El resultado de la division es: " + resultado);
			break;
			
			
		}
	}
}
