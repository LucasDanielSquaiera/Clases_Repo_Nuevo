package herencia.CasoPractico;

public class PlanEstandar extends Suscripcion {
	private int maxPerfiles=1;
	public PlanEstandar(String nombreUsuario, double precioBase) {
		super(nombreUsuario, precioBase);
	
	}

	@Override
	public double calcularPrecio() {
		return getPrecioBase();
	}

	@Override
	//POSIBLE SUBIR EL METODO AL PADRE, EL ATRIBUTO TAMBIÉN E INICIALIZAR EN EL CONSTRUCTOR
	protected int getMaxPerfiles() {	
		return maxPerfiles;
	}

	
	
}
