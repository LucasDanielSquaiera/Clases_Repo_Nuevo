package excepciones;

import java.io.IOException;


public class AppInterfaz {
	public static void main (String [] args) {
		
		LogicaDeNegocio ldn = new LogicaDeNegocio();
		
		try {
			ldn.procesarInformacion();
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
