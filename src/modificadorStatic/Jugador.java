package modificadorStatic;

public class Jugador {
	private static int numeroJugadores = 0;
	private static int puntuacionMaxima=0;
	
	private String nombre;
	private int puntuacionActual;
	private String id;
	
	public Jugador (String nombre, int puntuacionActual) {
		numeroJugadores++;
		this.id= String.format("J%03d", numeroJugadores);
		this.nombre=nombre;
		this.puntuacionActual=puntuacionActual; 
		//Así no podemos hacer
		//this.id=id;
		if (this.puntuacionActual > puntuacionMaxima) {
			puntuacionMaxima=this.puntuacionActual;
		}
	}
	
	
	
	public static int getNumeroJugadores() {
		return numeroJugadores;
	}



	public static int getPuntuacionMaxima() {
		return puntuacionMaxima;
	}



	public String getNombre() {
		return nombre;
	}



	public int getPuntuacionActual() {
		return puntuacionActual;
	}



	public String getId() {
		return this.id;
	}
	
	public static void mostrarResumen() {
		System.out.println("Hay " + numeroJugadores + " jugadores.");
		System.out.println("La puntuación más alta es: " + puntuacionMaxima);
		
	}
	
}
