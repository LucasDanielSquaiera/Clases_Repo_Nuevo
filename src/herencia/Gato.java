package herencia;

public class Gato extends Animal {

	public Gato(String nombre) {
		super(nombre);
		
	}
	@Override // sobrescribo un método del padre
	public void hacerSonido() {
		System.out.println("El animal "+ nombre+" hace miauuuu");
	}
	
}
