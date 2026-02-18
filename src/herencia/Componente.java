package herencia;

public class Componente {

	private int id;

	public Componente() {}
	
	public Componente(int id) {
		this.id = id;
	}
	
	protected void renderizar() {
		System.out.print("Dibujando componente " + this.id);
		}
	
	
	
	
	
}
