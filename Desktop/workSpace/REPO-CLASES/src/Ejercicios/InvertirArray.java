package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class InvertirArray {
	final static int CANTIDAD_ELEMENTOS =5;
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		String [] cadenas = new String [CANTIDAD_ELEMENTOS]; 
		String [] cadenaInvertida = new String[CANTIDAD_ELEMENTOS];
		
		
		
		for (int i = 0;i < CANTIDAD_ELEMENTOS;i++) {
			System.out.println("Dime una cadena para completar el array: ");
			cadenas[i]= sc.nextLine();
			}
		
		for(int i = 0; i < CANTIDAD_ELEMENTOS; i++) {
			
			 cadenaInvertida[CANTIDAD_ELEMENTOS -1-i] = cadenas[i];
			}
		
		System.out.println(Arrays.toString(cadenaInvertida));
	
		sc.close();
	}

}
