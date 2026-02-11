package Laboratorio;

public class Cartera {
	private String titular;
	private double saldo;
	
	public Cartera (String titular, double saldo) {
		this.saldo=saldo;
		this.titular=titular;
	}

	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			this.saldo += cantidad;
			System.out.println("La operación ha sido completada.");
		}
		else {
			System.out.println("ERROR: No se puede ingresar valores menores a 1");
		}
		
	} 
	
	public void retirar(double cantidad) {
		if(cantidad > 0 && cantidad < this.saldo) {
			this.saldo -= cantidad;	
			System.out.println("La operación ha sido completada.");
		}
		else {
			System.out.println("ERROR: la cantidad deseada no es posible de retirar. Consulte su saldo.");
		}
		
	}

	public void consultarSaldo() {
		System.out.println("\nEl saldo de su cuenta es: " + this.saldo);
	}

}
