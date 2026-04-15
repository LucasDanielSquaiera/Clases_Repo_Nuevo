package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotarioDigital {
	
public static void main (String [] args) {
	File miFichero = new File("registro.txt");	
	PrintWriter escritor = null; 
	Scanner sc = new Scanner(System.in);	
	try { 
		escritor = new PrintWriter(miFichero);
		while(true) { 
		System.out.println("Escribe una frase o escribe FIN");
		String frase = sc.nextLine();
		if (frase.equalsIgnoreCase("FIN")) {
			break;
		}else {
			escritor.println(frase);
			}
		}
		
	} catch (FileNotFoundException e) {
		System.out.println("Error: El fichero no se encuentra.");
	}catch(IOException e2) {
		System.out.println("Error: el fichero no existe.");
	} finally {
		if(escritor!=null) {
			escritor.close();
		}
		sc.close();
		System.out.println("Programa finalizado.");
	}
		
	
		
	
		
		
		
	} 
}
