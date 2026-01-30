package POO;

public class Motor {

		private String tipo;
		private int potencia;
		
		
	public Motor(String tipo, int potencia) {
		this.tipo=tipo;
		this.potencia=potencia;	
	}
	
	public String getInfo() {
		return "El motor es " + tipo +" su potencia es de " + potencia +" CV";
	}
}
