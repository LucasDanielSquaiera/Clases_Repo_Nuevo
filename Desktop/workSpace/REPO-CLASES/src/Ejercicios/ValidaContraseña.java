package Ejercicios;

import java.util.Scanner;

public class ValidaContraseña {
	public static void validar(String usuarioContraseña) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una contraseña válida, de mayor longiutd: ");
		String contraseña = sc.nextLine();
		do {
			System.out.println("Ingresa una contraseña válida, de mayor longiutd: ");
			contraseña = sc.nextLine();
		}while(contraseña.length() < 8);
		System.out.println("Contraseña correcta, bienvenido! ");
		
		sc.close();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Buenas tardes. Por favor, indica tu contraseña:");
		String contraseña = sc.nextLine();
		validar(contraseña);
		sc.close();
	}

}
