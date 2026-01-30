package POO;

public class AppCoche {

	public static void main(String[] args) {
		Coche coche1 = new Coche ("Fiat", "500","gasolina", 300);
		Coche coche2 = new Coche("Opel","Corsa","diesel",500);
		coche1.mostrarInfo();
		coche2.mostrarInfo();
	}

}
