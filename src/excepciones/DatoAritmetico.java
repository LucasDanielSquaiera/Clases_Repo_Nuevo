package excepciones;

import java.lang.ArithmeticException;
import java.util.Scanner;

public class DatoAritmetico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número entero ...");
		int num1 = sc.nextInt();
		System.out.println("Dime otro número entero ...");
		int num2 = sc.nextInt(); 
		int resultado;
		try {
			 resultado =  num1/ num2;
			 System.out.println("El resultado de la división de " + num1 + " entre " + num2 + " es: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error, no es posible realizar una división matemática por cero " + e.toString());
		}
		 
		// Esto realmente se hace con un condicional para no ocupar tanta memoria
		
		if (num2 >= 0) {
			System.out.println("La división es: " + num1/num2);
		} else {
			System.out.println("Error, no es posible realizar una división matemática por cero ");
		}
		
	sc.close();
	}

}
