package Laboratorio.ExamenLocoIA;

public class Cafe extends Bebida {
	private static final double PRECIO_SUPLEMENTO=0.5;
	private int numSuplemento;
	
	public Cafe (String nombre, double precioBase, int numSuplemento) {
		super(nombre,precioBase);
		this.numSuplemento=numSuplemento;
	}


	@Override
	protected  double precioFinal() {
		return this.getPrecioBase() + (numSuplemento * PRECIO_SUPLEMENTO);

	}


	@Override
	public String toString() {
		return nombre + ", cantidad de suplementos: " + numSuplemento + ", precioBase=" + precioBase + "] Precio final: "+ this.precioFinal();
	}


	


	
	
	
	
}
