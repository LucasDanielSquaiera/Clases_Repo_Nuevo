package herencia;

public class AppEnsamblaje {

	public static void main(String[] args) {
		
		EnsamblajePremium eP = new EnsamblajePremium();
		EnsamblajeMovil eM = new EnsamblajeMovil();
		System.out.println("Ensamblaje Premium.");
		System.out.println("");
		eP.fabricar();
		System.out.println("\nEnsamblaje Móvil.");
		System.out.println("");
		eM.fabricar();
		
	}

}
