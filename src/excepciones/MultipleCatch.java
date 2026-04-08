package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		try {
			System.out.println("Dime un número entero ...");
			int num1 = sc.nextInt();
			System.out.println("Dime otro número entero ...");
			int num2 = sc.nextInt(); 
			int resultado;
			 resultado =  num1/ num2;
			 System.out.println("El resultado de la división de " + num1 + " entre " + num2 + " es: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error, no es posible realizar una división matemática por cero " + e.toString());
		} catch (InputMismatchException e) {
			System.out.println("Error, eso no es un número!");
		}
		 

	}

}
