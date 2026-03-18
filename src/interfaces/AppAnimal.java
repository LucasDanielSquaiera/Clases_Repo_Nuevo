package interfaces;

public class AppAnimal {

	public static void main(String[] args) {
		
		Animales a = new Perro("Toby", 5);
		Animales b = new Aguila("Fenix", 2);
	
	a.hacerSonido();
	a.respirar();
	b.hacerSonido();
	b.respirar();
	
	Avion av = new Avion("RF4452");
	
	ejecutarVuelo((Aguila)b, 30);
	ejecutarVuelo(av,30000);
	
	
	Pato patoPato = new Pato("Donald",35);
	Volador patoVolador = new Pato("Lucas", 30);
	Nadador patoNadador = new Pato("Gilito", 60);
		
	ejecutarNado(patoPato,50);
	ejecutarNado(patoNadador, 400);
	ejecutarNado((Nadador)patoVolador, 400); // funciona pero porque el Pato implementa la 
	// la interface de Nadador, con avión no corre
	}

	public static void ejecutarNado(Nadador n, int metros) {
		System.out.println("Iniciando el curso de natación: ");
		n.zambullirse();
		n.nadar(metros);
		n.salirDelAgua();
		System.out.println("A por la toalla.");
	}
	
	public static void ejecutarVuelo(Volador v, int metros) {
		System.out.println("Iniciando vuelo: ");
		v.despega();
		v.volar(metros);
		v.aterrizar();
		System.out.println("Fin de trayecto.");
		
	}
	
	
}
