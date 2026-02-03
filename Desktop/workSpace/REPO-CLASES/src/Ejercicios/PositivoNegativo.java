package Ejercicios;


import java.util.Scanner;


public class PositivoNegativo {


	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuántos números me vas a dar? ");
		
		int numeros = entrada.nextInt();
		int num;
		int positivo = 0;
		int negativo = 0;
		int cero = 0;
		
		 for (int i = 1; i <= numeros ; i++ ) {
			 System.out.println("Por favor, dime un número.");
			 	num = entrada.nextInt();
			 if (num > 0) {
				 positivo++;
			 } else if (num < 0) {
				negativo++;
			 } else {
				 cero++;
			 }
			 
			
		 }
		entrada.close();
		 System.out.println("\nEl número total de positivos es: " + positivo + ". Los negativos son en total: " + negativo +". La cantidad de ceros fueron: " + cero);
	}

}
