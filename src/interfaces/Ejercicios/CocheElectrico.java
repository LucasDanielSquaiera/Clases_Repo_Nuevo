package interfaces.Ejercicios;

public class CocheElectrico implements Recargable{

	@Override
	public void cargar() {
		System.out.println("El coche está cargando...");
	}

	@Override
	public int obtenerNivelBateria() {
		// TODO Auto-generated method stub
		return 15;
	}

}
