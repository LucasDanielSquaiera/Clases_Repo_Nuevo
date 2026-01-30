package POO;

public class Edificio {
	private int pisoMaximo; 
	private int pisoMinimo;
	private String nombre; 
	private Ascensor ascensor;
	
	
	public Edificio(int pisoMaximo, int pisoMinimo, String nombre) {
		this.pisoMaximo=pisoMaximo;
		this.pisoMinimo=pisoMinimo;
		this.nombre=nombre;
		this.ascensor = new Ascensor();		
	}
	
	public void ordenarSubida(int cuantos){
		
		int destinoFinal = ascensor.getPisoActual() + cuantos;
		if(pisoMaximo >= destinoFinal) {
			this.ascensor.subir(cuantos);
		} else {
			System.out.println("ERROR: No se puede subir tantos, chocaríamos con el tejado");
		}
		
	}
	
	public void ordenarBajada(int cuantos) {
	
		int destinoFinal = ascensor.getPisoActual() - cuantos;
		if(pisoMinimo <= destinoFinal) {
			this.ascensor.bajar(cuantos);
		} else {
			System.out.println("ERROR: No hay tantos sótanos en este edificio");
		}
		
		
	}
	
}
