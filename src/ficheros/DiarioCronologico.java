package ficheros;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiarioCronologico {

	public static void main(String[] args) {
		PrintWriter escritor= null;
		Scanner sc = new Scanner(System.in);
		try {
			FileWriter miDiario = new FileWriter("diario.txt",true);
			escritor = new PrintWriter(miDiario);

			System.out.println("Escribe una nueva entrada en el dirio");
			String frase = sc.nextLine();
			escritor.println("["+LocalDate.now()+"] Entrada: "+frase);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: diario no encontrado.");
			e.printStackTrace();
			
		}catch (IOException e2) {
			System.out.println("Error: el diario no existe.");
		} finally {
			if (escritor != null) {
				escritor.close();
			}
			sc.close();
		}
		
		
	}

}
