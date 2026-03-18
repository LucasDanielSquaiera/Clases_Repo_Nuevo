package interfaces;

public class Avion implements Volador {
	private String numBastidor;
	
	public Avion(String numBastidor) {
		this.numBastidor=numBastidor;
	}
	
	
	@Override
	public void despega() {
		System.out.println("El avión " + this.numBastidor + " despegando por la pista 15!");
		
	}

	@Override
	public void volar(int altitud) {
		System.out.println("El avión " + this.numBastidor + " sobrevuela Huesca a " + altitud + " metros de altura");
		
	}

	@Override
	public void aterrizar() {
		System.out.println("El avión " + this.numBastidor + " aterriza por la pista 5!");
		
	}

	
	
	
	
	
}
