package Ejercicios;


import java.util.Scanner; 


public class SumarArraysMetodo {
	final static int ELEMENTOS = 5;
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
			
			int [] array1 = new int [ELEMENTOS];
			int [] array2 = new int [ELEMENTOS];
			int [] arrSuma = new int [ELEMENTOS];
			
			System.out.println("Vamos a dar valores al array 1");
			rellenarArray(array1);
			System.out.println("Vamos a dar valores al array 2");
			rellenarArray(array2);
			//esto se puede controlar dentro del método con el control de excepciones 
			if(array1.length == array2.length) {
				arrSuma=sumarDosArrays(array1,  array2);
				mostrarArray(array1);
				mostrarArray(array2);
				mostrarArray(arrSuma);
				
			}else {
				System.out.println("Los arrays tienen que tener el mismo tamaño.");
			}
			sc.close();
	}
		
		public static void mostrarArray (int [] array) {
			System.out.println("\nMostrando array:");
			/*for(int elemento : array) {
				System.out.println(elemento + " ");
			}*/
			for (int i = 0; i<array.length; i++) {
				System.out.println("Elemento [" + i + "] es: " + array[i]);
			}
		}
		
		
		public static int [] sumarDosArrays(int[] array1, int[] array2) {
			int [] suma = new int [array1.length];
			for(int i = 0 ; i< array1.length; i++) {
				suma[i] = array1[i] + array2[i];
			}
			return suma;
		}
			public static void rellenarArray(int arr[]) {
				
				for (int i= 0; i< arr.length; i++) {
					System.out.println("Dime el valor del elemento " + (i+1) + ":");
					arr[i]= sc.nextInt();
				}
			}
		
		
		
}
