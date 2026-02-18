package modificadorProtected;

public class Guerrero extends Personaje{
	
	
	
	public Guerrero() {}

	public Guerrero(int salud) {
		super(salud);
		}

	
	
	
	
	public int usarEscudo() {
		if (salud < 50) {
			salud = 50;
		} return salud;
	}

}
