package Ejercicios;

import java.util.ArrayList;

public class borrarElementos {

	public static void main(String[] args) {
		ArrayList <String> nombres = new ArrayList();
		
		nombres.add("Primero");
		nombres.add("Segundo");
		nombres.add("Tercero");
		nombres.add("Cuarto");
		nombres.add("Quinto");
		
		System.out.println("Este es el array original: " + nombres);
		nombres.remove(1);
		System.out.println("\nElimino por índice, la posición 1. El array queda así: " + nombres);
		nombres.remove("Primero");
		System.out.println("\nElimino por valor 'Primero'. El array queda así: " + nombres);
		int posicionQuinto = nombres.indexOf("Quinto");
		
		nombres.remove(posicionQuinto);
		System.out.println("\n" +nombres);
	}

}
