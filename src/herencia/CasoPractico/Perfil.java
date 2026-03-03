package herencia.CasoPractico;

public class Perfil {
	
	private String nombre;
	private int edad;

	public Perfil(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	
	

	public String toString() {
		return "Perfil [nombre=" + nombre + ", edad=" + edad + "]";
	}



	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	
	
}
