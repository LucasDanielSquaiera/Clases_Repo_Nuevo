package herencia;

public class Boton extends Componente {

	private String texto;
	
	
	
	
	public Boton(int id,String texto) {
		super(id);
		this.texto = texto;
	}




	@Override 
	public void renderizar() {
		super.renderizar();
		System.out.print(". Con el texto " + this.texto);
		
	}
	
	
	
	
}
