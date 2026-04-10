package herencia.CasoPractico.EjerciciosLargos;

public abstract class Video implements Validable{
	private int lenght;
	
	public Video (int lenght) {
		this.lenght=lenght;
	}
	
	public int getLenght() {
		return lenght;
	}
	
}
