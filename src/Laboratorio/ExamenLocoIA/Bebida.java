package Laboratorio.ExamenLocoIA;

public abstract class Bebida {
	protected String nombre;
	protected final double precioBase;
	
	public Bebida(String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	protected abstract double precioFinal();

	public double getPrecioBase() {
		return precioBase;
	}
	
	

}
