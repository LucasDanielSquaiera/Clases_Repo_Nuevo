package Ejercicios;

import java.util.Scanner;


public class Ordenar3Numeros {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a , b , c;
		
		System.out.println("Escribe un número");
		a = entrada.nextInt();
		
		System.out.println("Escribe otro número");
		
		b = entrada.nextInt();
		
		System.out.println("Escribe el último número");
		
		c = entrada.nextInt();
		
		entrada.close();
		
	
		if (a >= b && a > c) {
		
			if (b >= c) {
			
		System.out.println("El número " +a + " es mayor que " + b + "  y este es mayor que " + c);
		} else {
			System.out.println("El número " +a + " es mayor que " + c + " y este es mayor que " + b);
		}
		
	} else if (b >= a && b > c){
		if (a >= c) {
	
		System.out.println("El número " +b + " es mayor que " + a + " y este es mayor que " + c);
		} else {
			System.out.println("El número " + b + " es mayor que " + c + " y este es mayor que " + a);
		}
	} else {
		if (c >= a && c>= b) {
			if (a >= b) {
				System.out.println("El número " + c + " es mayor que " + a + " y este es mayor que " + b);
			} else {
				System.out.println("El número " + c + " es mayor que " + b + " y este es mayor que " + a);
			}
		}
		
	}
		

	}

}
