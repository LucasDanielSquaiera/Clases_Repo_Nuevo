package Ejercicios;

import java.util.Scanner;

public class ConvertirUnidades {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		double velocidad;
		int  opcion;
		
		double conversion;
		
		System.out.println("¿A qué velocidad vas?");
		
		velocidad = scan.nextDouble();
		System.out.println("Y, ¿Dé qué unidad estamos hablando?");
		
		System.out.println(" \n1-Km/h");
		System.out.println("2-m/s");
		opcion = scan.nextInt();
		scan.close();
		
		if (opcion == 1) {
			conversion = velocidad*1000/3600; 
			System.out.println("Vas a " + velocidad + " KM/h, que equivale a " + conversion + " m/s");
			
		} else {
			conversion = velocidad *3600/1000;
			System.out.println("Vas a " + velocidad + " m/s, que equivale a " + conversion + " Km/h");
		}
		
		switch (opcion) {
		case 1: 	
			conversion = velocidad*1000/3600;
			System.out.println("Vas a " + velocidad + " KM/h, que equivale a " + conversion + " m/s");
			break;
		case 2: 
			conversion = velocidad *3600/1000;
			System.out.println("Vas a " + velocidad + " m/s, que equivale a " + conversion + " Km/h");
			break;
			}
	}

}
