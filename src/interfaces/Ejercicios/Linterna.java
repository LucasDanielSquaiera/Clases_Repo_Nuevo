package interfaces.Ejercicios;

public class Linterna implements Recargable{

	@Override
	public void cargar() {
		System.out.println("La linterna está cargando...");
		
	}

	@Override
	public int obtenerNivelBateria() {
		// TODO Auto-generated method stub
		return 0;
	}

}
