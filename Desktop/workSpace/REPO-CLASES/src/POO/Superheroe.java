package POO;

public class Superheroe {
	private String nombre;
	private String superpoder;
	private boolean capa;
	
	public Superheroe(String nombre, String superpoder) {
		this.nombre=nombre;
		this.superpoder=superpoder;
		this.capa=true;
		}
	
	
	
	public void describir() {
		System.out.println("Soy "+this.nombre+", mi poder es "+ this.superpoder);
		if (this.capa) {
		System.out.print(" y llevo capa.");
		}else {
			System.out.print(" y no llevo capa.");
		}
		
	}
}
