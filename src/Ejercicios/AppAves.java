package Ejercicios;

public class AppAves {

	public static void main(String[] args) {
		
		Ave gallina = new Gallina("Tutuleta");
		Ave gallo = new Gallo("Claudio");
		
		gallina.volar();
		if (gallina instanceof Gallina) {
			((Gallina)gallina).ponerHuevo();
		}
		
		//Si no hago esta comparación, obtengo un error en tiempo de ejecución. 
		if (gallo instanceof Gallina) {
			((Gallina)gallo).ponerHuevo();
		}else {
			gallo.volar();
		}
	}

	
	
}
