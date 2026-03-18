package interfaces.Ejercicios;

public class TelefonoInteligente implements Recargable {
	
	@Override
	public void cargar() {
		System.out.println("El móvil está cargando...");
		
	}

	@Override
	public int obtenerNivelBateria() {
		
		return 15;
	}

}
