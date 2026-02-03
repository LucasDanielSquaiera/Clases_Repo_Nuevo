package Ejercicios;

import java.util.Scanner; 

public class imprimirHasta0 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola, empecemos a rellenar nuestro array.");
		int [] numeros = new int[10];
		int contador = 0;
		// con do while y condiciones múltiples
		do { 
			System.out.println("Introduce un valor:");
			numeros[contador]=sc.nextInt();
			contador++;
		} while (numeros[contador -1] > 0 && contador < numeros.length);
		
		// con for y break 
		for(int i = 0;i < numeros.length;i++){
			if (numeros[i] <= 0) {
				break;
			}
			System.out.print(numeros[i] + ", ");
		}
	
		
	
		
		sc.close();
	}

}
