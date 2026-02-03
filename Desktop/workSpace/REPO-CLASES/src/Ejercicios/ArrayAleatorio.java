package Ejercicios;

import java.util.Arrays;
import java.util.Scanner; 

public class ArrayAleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿cúal es el tamaño del array?");
		int dimension = sc.nextInt();
		int [] arrayNumeros = new int [dimension];
		
		
		for(int i = 0; i < arrayNumeros.length;i++) {
			arrayNumeros[i]= (int)(Math.random()*10)+1;
			System.out.println("El valor del elemento " + i + " es: " + arrayNumeros[i]+ ". Su cuadrado es: " + (int)Math.pow(arrayNumeros[i], 2)+ " y su valor al cubo es: "+ (int)Math.pow(arrayNumeros[i], 3)  );
		} System.out.println(Arrays.toString(arrayNumeros));
		sc.close();
	}

}
