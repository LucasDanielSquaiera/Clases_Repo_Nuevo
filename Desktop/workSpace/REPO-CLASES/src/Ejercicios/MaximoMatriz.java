package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class MaximoMatriz {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique las dimensiones de la matriz, primero la cantidad de filas: ");
		int fila = sc.nextInt();
		System.out.println("Ahora la cantidad de columnas: ");
		int columna = sc.nextInt();
		
		int [][] matriz = new int [fila][columna];
		
		Recursos.rellenarMatrizAleatoria(matriz, 100);
		Recursos.mostrarMatriz(matriz);
		
		int maximo = matriz[0][0];
		
		for (int i =0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[0].length; j++) {
				if(maximo < matriz[i][j]) {
					maximo = matriz [i][j];
				}
			}
		}
		System.out.println("El valor máximo es:" + maximo);
		/*for (int i= 0; i< matriz.length; i++) {
			for (int j= 0; j< matriz[0].length; j++) {
				matriz[i][j] = (int)((Math.random()*100)+1);
				System.out.print(matriz[i][j] + " ");
				
			}
		System.out.println();*/
		sc.close();
	}
	 
		
		
	
		
	}


