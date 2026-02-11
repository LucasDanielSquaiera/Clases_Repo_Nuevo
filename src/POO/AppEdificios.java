package POO;

public class AppEdificios {

	public static void main(String[] args) {
		Edificio edificio1 = new Edificio(10,0,"Torre Central");
		
		Edificio edificio2 = new Edificio(5,-3,"Parking Subterráneo");

		edificio1.ordenarSubida(5);
		edificio1.ordenarSubida(5);
		edificio1.ordenarBajada(11);
		
		edificio2.ordenarBajada(4);
		edificio2.ordenarSubida(8);
		edificio2.ordenarBajada(5);
		
	}

}
