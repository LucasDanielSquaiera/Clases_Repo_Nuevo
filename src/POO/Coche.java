package POO;



public class Coche {
	
	private String marca;
	private String modelo;
	private Motor motor;
	
	public Coche(String marca, String modelo, String tipo, int potencia) {
		this.marca=marca;
		this.modelo=modelo;
		motor = new Motor(tipo,potencia);
		}
	
	public void mostrarInfo() {
		System.out.println("El coche es marca "+this.marca+ ", modelo " + this.modelo + ". " +this.motor.getInfo());
		
	}
}
