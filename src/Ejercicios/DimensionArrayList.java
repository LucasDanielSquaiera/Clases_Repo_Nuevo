package Ejercicios;

import java.util.Scanner;
import java.util.ArrayList;

public class DimensionArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> numeros = new ArrayList();
		int eleccion;
		
		
		do { 
			System.out.println("Dime un número entero y lo guardaré en el array.\nSi quieres finalizar ingresa el valor -1.");
			eleccion = sc.nextInt();
		
		if (eleccion != -1) {
			numeros.add(eleccion);	
			} 
		} while(eleccion != -1);
		
			
			System.out.println("\nHas terminado de ingresar valores al array."
					+ " Ha quedado conformado de la siguiente manera: " + numeros);
			System.out.println("Tu array tiene " + numeros.size() + " elementos. "
					+ "En la primer posición está el número " + numeros.get(0)
					+ " y en la última posición está el número " + numeros.get(numeros.size()-1));
	
			
			
		
		
	
		
		
		
		
		sc.close();
	}

}
