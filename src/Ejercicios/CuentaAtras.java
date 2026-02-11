package Ejercicios;

import java.util.Scanner; 

public class CuentaAtras {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Por favor, indica un número entero");
	
	int num = scan.nextInt();
	
	int contador = num;
	
		while (contador > 0) {
			
			contador--;
			System.out.print(contador + ", ");
		}
    System.out.println("Despegue!!!!");

     scan.close();
	}

}
