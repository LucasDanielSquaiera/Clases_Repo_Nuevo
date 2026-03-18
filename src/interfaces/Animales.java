package interfaces;

public abstract class Animales {
	private String nombre;
	private int edad;
	
	public Animales(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public void respirar() {
		System.out.println(this.nombre + " respira.");
	}
	
	public abstract void hacerSonido();

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	
}
