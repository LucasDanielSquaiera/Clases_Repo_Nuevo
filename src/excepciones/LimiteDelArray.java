package excepciones;

import java.util.Scanner;


public class LimiteDelArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nombres = {"Lucas", "Brayan", "Aitor"};
		System.out.println("Dime un número del ídice del array ...");
		int numero = sc.nextInt();
		try {
			System.out.println("El nombre de índice número " + numero + " es: " + nombres[numero]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error! Se ha intentado acceder a una zona de memoria fuera de los límites del array. "
					+ "La longitud del array es de " + (nombres.length -1));
		}
		
		
		
	sc.close();
	}

}
