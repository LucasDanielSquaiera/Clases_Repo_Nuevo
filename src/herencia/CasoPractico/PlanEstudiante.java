package herencia.CasoPractico;

public class PlanEstudiante extends Suscripcion{
	private int maxPerfiles=1;
	private final double DESCUENTO = 0.5;
	private String nombreUniversidad;

	public PlanEstudiante(String nombreUsuario, double precioBase, String nombreUniversidad) {
		super(nombreUsuario, precioBase);
		this.nombreUniversidad = nombreUniversidad;
	}

	@Override
	public double calcularPrecio() {
		
		return getPrecioBase() * DESCUENTO;
	}


	@Override
	protected int getMaxPerfiles() {	
		return maxPerfiles;
	}
	
	
	

}
