package Ejercicios;

public class SumarArray {

	public static void main(String[] args) {
		int[] enteros = {1,2,3,4,5};
		int contador = 0;
		
		for (int i = 0;i < enteros.length; i++) {
			contador = contador + enteros[i];
		//la variable indica el indice del array, se accede a él con el nombre del array
		// y dentro de los corchetes que indican el índice la i
		}System.out.println("La suma de los elementos del array es: " + contador);
	} 

}
