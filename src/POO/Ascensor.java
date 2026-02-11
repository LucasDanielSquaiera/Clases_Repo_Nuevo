package POO;

public class Ascensor {
	
	private int pisoActual;
	
	public Ascensor () {
		this.pisoActual= 0;
		}

	
	
public void subir(int n) {
	 this.pisoActual=  this.pisoActual +n;
	System.out.println("Subiendo " + n + " pisos. \nAhora en planta " + this.pisoActual);
}
public void bajar(int n) {
	 this.pisoActual=  this.pisoActual -n;
	System.out.println("Bajando " + n + " pisos. \nAhora en planta " + this.pisoActual);
}

public int getPisoActual() {
	System.out.println("El ascensor se encuentra en el piso " + this.pisoActual);
	return this.pisoActual;
}

}

