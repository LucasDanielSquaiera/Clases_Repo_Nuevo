package POO;

import java.util.Scanner;

public class AppTamagotchi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		 System.out.println("Hola comencemos a jugar...");
		 System.out.println("--------------------------");
		 System.out.println("Cómo llamaremos a nuestro Tamagotchi?");
		
		 String nombre = sc.nextLine();
		 
		 Tamagotchi tama = new Tamagotchi(nombre);
		
		 do {
			 System.out.println("Qué te apetece hacer ahora?");
			 System.out.println("1. Quieres que " + nombre + " juegue?");
			 System.out.println("2. Quieres que " + nombre + " coma?");
			 System.out.println("3. Quieres que " + nombre + " duerma?");
			 System.out.println("4. Quieres saber cuál es el estado de " + nombre + "?");
			 System.out.println("5. Salir.");
			 opcion = sc.nextInt();
			 
			 switch(opcion){
			 case 1: {
				 tama.jugar();
				 break;}
			 case 2: {
				 tama.comer();
				 break;
			 }
			 case 3:{
				 tama.dormir();
				 break;
			 }
			 case 4:{
				tama.status();
				break;
			 }
			 default: {
				 System.out.println("Elige una opción válida que "+nombre+ " se aburre...");
			 }
			 }
			 
		 }while(opcion == 5);
		 
		 
	
		 
		 
	sc.close();
	}

}
