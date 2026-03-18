package interfaces;

public class Perro extends Animales {
	



	public Perro(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hacerSonido() {
		System.out.println(this.getNombre() +" Guau!");
	}

	
	
}
