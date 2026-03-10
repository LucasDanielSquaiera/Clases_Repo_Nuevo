package Laboratorio.ExamenLocoIA;

public class Refresco extends Bebida{
	private char tamanio;
	
	// tamaño (grande = 1, mediano = 0.5, pequeño = 0.25)
	public Refresco(String nombre, double precioBase, char tamanio) {
		super(nombre, precioBase);
		this.tamanio=tamanio;
	}

	@Override
	protected double precioFinal() {
		if (tamanio == 'G') {
			
			return this.getPrecioBase()*1.8;
		} else if (tamanio == 'M') {
			return this.getPrecioBase() * 1.4;
		} else {
		return this.getPrecioBase();
		}
	}

	@Override
	public String toString() {
		return nombre + " [tamanio = " + tamanio + ", precioBase=" + precioBase + "] Precio final: " + this.precioFinal();
	}

	


}
