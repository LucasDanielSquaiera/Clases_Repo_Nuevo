package Ejercicios;

import java.util.Scanner;

public class AdivinarNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int vidas = 10;
		int numeroPensado = (int)(Math.random()*100);
		System.out.println("He pensado el número: " + numeroPensado);// trampa
		
		do {
			System.out.println("Acierta el número que he pensado:");
			numero = sc.nextInt();
				if (numero < numeroPensado) {
					System.out.println("Has fallado el número es mayor, te quedan " + --vidas + " vidas");
				} else if (numero > numeroPensado){
					System.out.println("Has fallado el número es menor, te quedan " + --vidas + " vidas");
				} else {
					System.out.println("Felicitaciones, has acertado!!!");
				}
			
		}while(numero!= numeroPensado && vidas > 0);
		
	}

}
