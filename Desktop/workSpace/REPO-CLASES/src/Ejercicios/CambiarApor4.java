package Ejercicios;

import java.util.Scanner;

public class CambiarApor4 {
	
	public static String cambiaAPor4(String frase) {
		StringBuilder aux = new StringBuilder();
		for(int i= 0;i< frase.length();i++) {
			System.out.println(frase.charAt(i));
			if(frase.charAt(i) == 'a' || frase.charAt(i) =='A') {
				aux.append('4');
				
			}else {
				aux.append(frase.charAt(i));
			}
		}
			
		return aux.toString();
	}
	public class cambiaPor {
		public static String replaceMejorado(String f,char p1, char p2) {
			StringBuilder aux = new StringBuilder();
			for(int i= 0;i< f.length();i++) {
				
				if(f.charAt(i) ==Character.toLowerCase(p1)|| f.charAt(i) ==Character.toLowerCase(p1)) {
					aux.append(p2);
					
				}else {
					aux.append(f.charAt(i));
				}
			}
				
			return aux.toString();
		}}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase");
	
		String frase = sc.nextLine();
		String fraseSinA= frase.replace('a', '4');
		System.out.println("La frase '"+frase+"' modificada es: '"+fraseSinA+"'");
		sc.close();
		
		fraseSinA=cambiaAPor4(frase);
	}
	}

