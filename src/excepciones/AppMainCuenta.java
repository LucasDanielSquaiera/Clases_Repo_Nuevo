package excepciones;

public class AppMainCuenta {

	public static void main(String[] args) {
		
		CuentaBancaria c1 = new CuentaBancaria(300);
	
	
		
		try {
			
			c1.retirarDinero(10);
		
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e1) {
			System.out.println(e1.getMessage());
		} 
		
	}

}
