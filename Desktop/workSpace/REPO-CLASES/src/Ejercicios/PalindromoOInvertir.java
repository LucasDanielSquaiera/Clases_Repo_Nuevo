package Ejercicios;

import java.util.Scanner;

public class PalindromoOInvertir {

	public static boolean esPalindromo(String p) {
		char carcater1, caracter2;
		for (int i =0; i<= (p.length()-1)/2;i++) {
			carcater1=p.charAt(i);
			caracter2=p.charAt(p.length()-1-i);
			if (carcater1 != caracter2) {
				return false;
			} // otra alternativa es (más eficiente): 
			//if(p.charAT(i) != p.charAT(p.length()-(i+1)))
	}
	
	return true;	
	}
	
	public static String cadenaInvertida(String cadena) {
		String cadenaInvertida;
		StringBuilder cadenaTemporal = new StringBuilder();
		for (int i = cadena.length()-1;i>=0;i--) {
			System.out.println("Recorriendo al revés "+ cadena.charAt(i));
			cadenaTemporal.append(cadena.charAt(i));
		}
		cadenaInvertida = cadenaTemporal.toString();
		return cadenaInvertida;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabraInvertida;
		System.out.println("Dime una palabra y vamos a ver si es o no palíndromo.");
		String palabra = sc.nextLine();
		if(esPalindromo(palabra)) {
			
		}else {
			System.out.println("No es palíndromo.");
		}
		sc.close();
	}

}
