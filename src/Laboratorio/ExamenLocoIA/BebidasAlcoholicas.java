package Laboratorio.ExamenLocoIA;

public class BebidasAlcoholicas extends Bebida {
private double recargo;
	public BebidasAlcoholicas(String nombre, double precioBase) {
		super(nombre, precioBase);
		this.recargo=1.5; 
	}

	@Override
	protected double precioFinal() {
		
		return this.getPrecioBase() * recargo;
	}

	@Override
	public String toString() {
		return nombre + " contiene un recargo de " + recargo +", precioBase=" + precioBase + "] Precio final: " + this.precioFinal();
	}

	
	
	
	
	
}
