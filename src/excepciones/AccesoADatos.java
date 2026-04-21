package excepciones;

import java.io.IOException;

public class AccesoADatos {

	
	public void leerDatoFisico() throws IOException{
		throw new IOException("El sistema de almacenamiento no está disponible en este momento.");
	}
	

}
