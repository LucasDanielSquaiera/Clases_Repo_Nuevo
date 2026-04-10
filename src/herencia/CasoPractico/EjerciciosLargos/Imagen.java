package herencia.CasoPractico.EjerciciosLargos;

public abstract class Imagen implements Validable{
	private int width;
	private int height;
	
	public Imagen (int width, int height) {
		this.height=height;
		this.width=width;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}


}
