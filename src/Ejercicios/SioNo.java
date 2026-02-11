package Ejercicios;

import java.util.Scanner;

public class SioNo {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String opcion;
		
		do {
			System.out.println("¿Quieres continuar? (s/n)");
			  
			 opcion = leer.nextLine().toLowerCase();
			
		} while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n"));
		
		System.out.println("Hay que revisar");
		
		leer.close();
	}

}
