package Ejercicios;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Por favor, dime un número y te daré su tabla");
		
		int num = leer.nextInt();
		
		for (int i = 0;i<=10; i++) {
			
			int resultado = i * num;
			
			System.out.println("\nEl número " + num + " por " + i + " es: " + resultado );
			}
		
		
		
		
		
		
		leer.close();
	}

}
