package interfaces;

public class Aguila extends Animales implements Volador{

	public Aguila(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void hacerSonido() {
		System.out.println(this.getNombre()+" Creak, Creak!");
	}
	
	
	@Override
	public void despega() {
	System.out.println(this.getNombre()+ " despliega sus alas y despega");
		
	}

	@Override
	public void volar(int altitud) {
		System.out.println(this.getNombre()+ " planea a " + altitud + " metros de altura.");
		
	}

	@Override
	public void aterrizar() {
		System.out.println(this.getNombre()+" se posa en una rama.");
		
	}
	
	
	
}
