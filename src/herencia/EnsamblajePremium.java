package herencia;

public class EnsamblajePremium extends EnsamblajeMovil {

	
	
	
	
	
	
	@Override
	public void colocarPantalla() {
		System.out.println("Colocando pantalla OLED curva.");
	}
	
	@Override
	public void empaquetar() {
		System.out.println("Empaquetando en caja de lujo con auriculares.");
	}
	
	
	//public void fabricar() { // El IDE arroja el error de que un método final de la clase padre no puede sobrescribirse.
	//	super.empaquetar();
	//	super.colocarPlaca();
	//	super.colocarPantalla();
	//}
	
}
