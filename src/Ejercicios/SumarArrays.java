package Ejercicios;

import java.util.Arrays;
import java.util.Scanner; 

public class SumarArrays {
	final static int ELEMENTOS = 5;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array1 = new int [ELEMENTOS];
		int [] array2 = new int [ELEMENTOS];
		int [] array3 = new int [ELEMENTOS];
		
		
		for (int i = 0; i < array1.length;i++) {
			System.out.println("Dime un valor entero para el elemento " + (i+1));
			array1[i] = sc.nextInt();
			} 
		System.out.println("El array quedó conformado así:"+ Arrays.toString(array1)); 
		
		for (int i = 0; i < array2.length;i++) {
			System.out.println("Dime un valor entero para otro array y lo sumaré con el array anterior: ");
			array2[i] = sc.nextInt();
			} 
		System.out.println("Nuestro segundo array se conforma así: " + Arrays.toString(array2));
		
			
		for (int i = 0; i< array3.length; i++) {
			array3[i]= array1[i] + array2[i];}
		
		System.out.println("La suma de nuestros dos arrays anteriores es: " + Arrays.toString(array3));
		
		sc.close();
	} 

}
