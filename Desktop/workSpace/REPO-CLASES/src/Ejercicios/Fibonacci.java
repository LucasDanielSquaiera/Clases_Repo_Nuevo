package Ejercicios;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuántos términos de la sucesión de Fibonacci quieres ver?");
		int terminos = entrada.nextInt();
		int antepenultimo = 0;
		int penultimo = 1;
		int actual;
		System.out.println("El término número 1 es 0 \nEl término 2 es 1.");
	
		for(int i = 3; i<= terminos; i++) {
			actual = penultimo + antepenultimo ;
			System.out.println("El término número "+ i + " es:"+ actual);
			antepenultimo = penultimo;
			penultimo = actual;
		}
		entrada.close();
	}

}
