package Ejercicios;

import java.util.Scanner;

public class TablasMultiplicarMetodo {

	public static void mostrarTabla(int num) {
		System.out.println("La tabla del número: "+ num);
		for (int i = 0;i <= 10;i++) {
			
			System.out.println( num + " por " + i + " es: "+ num*i);
		}
	}
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Indica un número y te diré su tabla: ");
	int numero = sc.nextInt();
	mostrarTabla(numero);
	
	for (int i = 1; i <= numero;i++) {
		mostrarTabla(i);
		System.out.println("-------------------------");
	}
	
	
	sc.close();
	

	}

}
