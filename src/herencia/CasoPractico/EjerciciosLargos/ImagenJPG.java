package herencia.CasoPractico.EjerciciosLargos;

public class ImagenJPG extends Imagen {

	public ImagenJPG(int width, int height) {
		super(width, height);
	}

	@Override
	public boolean isValid() {
		long resolucionValida = 5000000;
		
		if (this.getHeight() * this.getWidth() <= resolucionValida) {
			return true;
		} else {
			return false;
		}
	}


	
	
}
