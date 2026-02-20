package herencia;

public class Smartphone extends Producto{
	private int memoriaRAM;

	public Smartphone(String nombre, double precio, int memoriaRAM) {
		super(nombre, precio);
		this.memoriaRAM = memoriaRAM;
	}

	@Override
	public String toString() {
		return super.toString() + " su memoria RAM es de : " + this.memoriaRAM + " GB.";		
	}

}
