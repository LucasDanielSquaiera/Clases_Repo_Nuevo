package herencia;

public class Repartidor extends Empleado {
	private int zona;

	public Repartidor (String nombre, double salarioBase, int zona) {
		super(nombre, salarioBase);
		this.zona=zona;		
	}


	@Override
	public double calcularSalario() {
		if (zona == 1) {
			return salarioBase + 100; 
		} else {
			return salarioBase;
		}



	}

}
