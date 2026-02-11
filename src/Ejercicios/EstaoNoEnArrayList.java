package Ejercicios;

import java.util.Scanner;
import java.util.ArrayList;

public class EstaoNoEnArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("aitor");
		nombres.add("julio");
		nombres.add("violeta");
		nombres.add("guillermo");
		
		System.out.println("Dime un nombre y te diré si está en el array: ");
		String usuario = sc.nextLine().toLowerCase();
		System.out.println("El array nombres contiene " + usuario + " ?" +" \n" + nombres.contains(usuario));
		
		boolean encontrado = false;
		// recorriendo el array 
		for (String n : nombres) {
			if (n.equals(usuario)) {	
				encontrado = true;
				break;
				
			} 
		} 
		if (encontrado == true) {
			System.out.println("El nombre " + usuario + " está en el array");
		} else {
			System.out.println("El nombre " + usuario + " no está en el array");
		}
		
		sc.close();
	}

}
