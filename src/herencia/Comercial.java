package herencia;

public class Comercial extends Empleado {
	private double comision;


	public Comercial(String nombre, double salarioBase, double comision) {
		super(nombre, salarioBase);
		this.comision=comision;
	}

	@Override
	public double calcularSalario() {
		return salarioBase + comision;
	}	


}
