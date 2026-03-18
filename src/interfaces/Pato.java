package interfaces;

public class Pato extends Animales implements Volador, Nadador{

	public Pato(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void zambullirse() {
		System.out.println(this.getNombre()+" se zambulle");
		
	}

	@Override
	public void nadar(int metros) {
		System.out.println(this.getNombre() + " nada " + metros+ " metros");
		
	}

	@Override
	public void salirDelAgua() {
		System.out.println(this.getNombre()+" sale del agua");
		
	}

	@Override
	public void despega() {
		System.out.println(this.getNombre()+" despega");
		
	}

	@Override
	public void volar(int altitud) {
		System.out.println(this.getNombre()+" vuela a " + altitud + " de altura");
		
	}

	@Override
	public void aterrizar() {
		System.out.println(this.getNombre()+" aterrizó");
		
	}

	@Override
	public void hacerSonido() {
		System.out.println(this.getNombre()+" Cuak, Cuak!");
		
	}

	
	
	
	
}
