package POO;

public class AppTermometro {

	public static void main(String[] args) {
		Termometro termSalon = new Termometro(400, "mercurio");
		
		System.out.println("La temperatura en el salón es de: "+termSalon.getTemperatura() + " Cº. Según el termómetro de tipo " + termSalon.getTipo());
		
		termSalon.setTemperatura(2000);
		System.out.println("La temperatura es de: "+termSalon.getTemperatura()+" así lo marca el termómetro de "+termSalon.getTipo());

	}

}
