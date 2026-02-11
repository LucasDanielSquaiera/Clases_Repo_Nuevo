package Ejercicios;

import java.util.Scanner;

public class PrimerCaracterRepetido {
	public static char caracterRepetido(String f) {
		for (int i =0;i<= f.length()-1;i++) {
			for (int j = i+1;j<=f.length()-1;j++) {
				if(f.charAt(i)==f.charAt(j)) {
					
				}
			}
			
		}
		
		return ' ' ;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime una frase y te diré cuál es la primera letra que se repite:");
		String frase=sc.nextLine();
		
		sc.close();
	}

}
