package herencia.CasoPractico;

public class PlanFamiliar extends Suscripcion {
	private int maxPerfiles=6;
	private final double PLUS = 0.4; 
	public PlanFamiliar(String nombreUsuario, double precioBase) {
		super(nombreUsuario, precioBase);
	}

	@Override
	public double calcularPrecio() {
		
		return getPrecioBase() * (1 +PLUS);
	}


	@Override
	protected int getMaxPerfiles() {	
		return maxPerfiles;
	}

	
}
