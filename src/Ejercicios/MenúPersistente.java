package Ejercicios;

import java.util.Scanner;

public class MenúPersistente {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int opcion;
		
		do {
			System.out.println("\nPor favor, elija una opción del menú.");
			System.out.println("\n1- Saludar");
			System.out.println("2- Conocer la hora actual");
			System.out.println("3- Agradecer");
			System.out.println("4- Salir");
			
		
				opcion = entrada.nextInt();
			
			if (opcion == 1) {
				System.out.println("\nHola, cómo estás?");
			} else if (opcion == 2) {
				System.out.println("\nLa hora actual es: 19:03 hs.");
			} else if (opcion == 3) {
				System.out.println("\nMuchas gracias por visitar nuestro menú.");
			}

		}
		while( opcion != 4); 
		
		entrada.close();
									// es mucho más práctico un switch
	}

}
