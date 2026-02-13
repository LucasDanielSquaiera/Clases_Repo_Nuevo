package tresEnRaya;

import java.util.Scanner;

public class AppJuegos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleccion;

		do {

			System.out.println("¿A qué quieres jugar?\n");
			System.out.println("1-Tres en raya");
			System.out.println("2-Tres en raya miseria");
			System.out.println("0-Salir");
			eleccion = sc.nextInt();

		}while(eleccion != 0);




	}

}
