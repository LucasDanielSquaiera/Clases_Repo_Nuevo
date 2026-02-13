package herencia;

public class Perro extends Animal {
	
	public Perro(String nombre) {
		super(nombre); // igual que el constructor de la clase padre
	}
	
	
	@Override
	public void hacerSonido() {
		System.out.println("El animal "+ nombre+" hace guauuuuu");
	}
	
}
