package Ejercicios;

import java.util.Scanner;

public class ContarPalabras {
	
	public static int cantidadPalabras(String frase) {
		int contador=1;
		for(int i=0;i<=frase.length()-1;i++) {
			if(frase.charAt(i) == ' ') {
				contador++;
			}
		} 
		return contador;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase y te diré cuántas palabras tiene: ");
		String frase = sc.nextLine().trim();
		int numero = cantidadPalabras(frase);
		
		System.out.println("La frase contiene "+numero+" palabras.");
		
		sc.close();
	}

}
