package modificadorStatic;

public class AppJugador {

	public static void main(String[] args) {
		
		System.out.println("Mostrar cantidad de jugadores " + Jugador.getNumeroJugadores());
		System.out.println("--------------------------");
		Jugador player1 = new Jugador("Brayan",100);
		Jugador player2 = new Jugador("Lucas",180);
		Jugador player3 = new Jugador("Aitor",280);
		Jugador player4 = new Jugador("Sito",80);
		
		System.out.println(player1.getId()+"-"+ player1.getNombre()+"-"+player1.getPuntuacionActual());
		System.out.println("--------------------------");
		System.out.println(player2.getId()+"-"+player2.getNombre()+"-"+player2.getPuntuacionActual());
		System.out.println("--------------------------");
		System.out.println(player3.getId()+"-"+ player3.getNombre()+"-"+player3.getPuntuacionActual());
		System.out.println("--------------------------");
		System.out.println(player4.getId()+"-"+player4.getNombre()+"-"+player4.getPuntuacionActual());
		System.out.println("--------------------------");
		
		

		Jugador.mostrarResumen();
		
	}

}
