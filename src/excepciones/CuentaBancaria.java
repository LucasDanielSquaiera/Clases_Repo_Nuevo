package excepciones;

public class CuentaBancaria {
	private double saldo; 
	
	public CuentaBancaria(double saldo) {
		this.saldo=saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void retirarDinero(double r) throws IllegalArgumentException, ArithmeticException{
	if (r <= 0) {
		throw new IllegalArgumentException("No se puede retirar una cantidad negativa.");
		}	
	if (r > this.saldo) {
		throw new ArithmeticException("Saldo insuficiente para realizar la operación.");
	}
	
	this.saldo= this.saldo - r;
	System.out.println("Se ha retirado " + r + " éxitosamente.");
	}
	
}
