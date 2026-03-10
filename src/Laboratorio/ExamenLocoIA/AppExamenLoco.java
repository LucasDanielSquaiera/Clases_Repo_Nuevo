package Laboratorio.ExamenLocoIA;

import java.util.ArrayList;

public class AppExamenLoco {

	public static void main(String[] args) {
		
		ArrayList<Bebida> bebidas = new ArrayList<>();
		
		Cafe cafe1 = new Cafe("Café con Sirope", 1.20, 1);
		Cafe cafe2 = new Cafe("Café solo", 1.20, 0);
		
		BebidasAlcoholicas ba1 = new BebidasAlcoholicas("Birra", 2.20 );
		BebidasAlcoholicas ba2 = new BebidasAlcoholicas("Vino Tinto", 2.00 );
		
		Refresco refre = new Refresco("Coca cola", 1, 'G');
		Refresco refre2 = new Refresco("Coca cola", 1, 'M');
		Refresco refre3 = new Refresco("Coca cola", 1, 'T');
		
		bebidas.add(cafe1);
		bebidas.add(cafe2);
		bebidas.add(ba1);
		bebidas.add(ba2);
		bebidas.add(refre);
		bebidas.add(refre2);
		bebidas.add(refre3);
		
		for (Bebida b : bebidas) {
			
			System.out.println(b.toString() + " Precio final: " + b.precioFinal());
			System.out.println(" -----");
		}
	}

}
