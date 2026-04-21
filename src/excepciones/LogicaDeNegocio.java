package excepciones;

import java.io.IOException;

public class LogicaDeNegocio extends AccesoADatos {

	public void procesarInformacion() throws IOException{
		leerDatoFisico();
	}
	
}
