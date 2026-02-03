package Ejercicios;

import java.util.Scanner;

public class SumaFilasyColumnas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique las dimensiones de la matriz, primero la cantidad de filas: ");
		int fila = sc.nextInt();
		System.out.println("Ahora la cantidad de columnas: ");
		int columna = sc.nextInt();
		
		
		int [][] matriz = new int [fila][columna];
		
		Recursos.rellenarMatrizAleatoria(matriz, 10);
		Recursos.mostrarMatriz(matriz);

		//recorremos por filas
		for (int i = 0; i<matriz.length; i++) {
		int	acumulador = 0; 
		for (int j = 0;j<matriz[0].length;j++) {
		acumulador = acumulador+ matriz[i][j];
			} 
		System.out.println("\nLa fila nº" + (i + 1) + " suma: " + acumulador);
		}
		//recorremos las columnas
		for(int j = 0; j<matriz[0].length;j++) {
		int acumColumnas=0;
		for (int i = 0; i<matriz.length; i++) {
			acumColumnas= acumColumnas + matriz[i][j]; 
		}System.out.println("\nLa columna nº "+(j+1)+" suma: " + acumColumnas);
		}
		
		sc.close();
	}

}
