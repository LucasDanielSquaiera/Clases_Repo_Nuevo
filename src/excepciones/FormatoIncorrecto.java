package excepciones;

import java.util.Scanner;

public class FormatoIncorrecto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String teclado;
		
		
		System.out.println("Ingrese una cifra ...");
		teclado = sc.nextLine();
		try {
			System.out.println("El valor ingresado es: " + Integer.parseInt(teclado));
		} catch (NumberFormatException e) {
			System.out.println("El texto introducido no tiene un formato numérico válido.");
		}
		
		
		
		
		
		
sc.close();
	}

}
