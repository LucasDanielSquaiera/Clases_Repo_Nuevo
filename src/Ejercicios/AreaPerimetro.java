package Ejercicios;

import java.util.Scanner; 

public class AreaPerimetro {

	public static double perimetro(double radio) {
		return 2*Math.PI*radio;
	}

	public static double area(double radio) {
		double area=Math.PI*radio*radio;
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r = 1.4;
		double p; 
		//guardamos el valor que devuelve por el método
		p=perimetro(r);
		System.out.println("El perímetro es: " + p);
		//usamos directamente lo que devuelve sin guardar
		System.out.println("El área es:  " + area(r));

	}

}
