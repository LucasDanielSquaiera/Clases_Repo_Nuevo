package modificadorProtected;

public class Personaje {
	protected int salud; 



	public Personaje() {

	}



	public Personaje (int salud) {
		this.salud= salud;
	}



	public int recibirDanio(int cantidad) {
		salud =- cantidad;
		return salud;
	}



	public int getSalud() {
		return salud;
	}


}
