package herencia_Juegos;

import java.util.Scanner;

public class TresEnRaya3Fichas extends JuegoDeTablero{

	private static final int NUM_FICHAS=6;
	public TresEnRaya3Fichas(String nombre1, char ficha1, String nombre2, char ficha2) {
		super(nombre1, ficha1, nombre2, ficha2);
	}

	public void inicio() {
		
		//Fase 1 colocación de las 3 fichas (6 turnos, 3 fichas por jugador)
		System.out.println("Fase de colocaión");
		for(int i = 0; i< NUM_FICHAS;i++) {
			mostrarTurno();
			realizarJugada();
			
		//En los tuenos 5 y 6, puede que termine la partida
			
			if (tablero.hayGanador()) {
				tablero.mostrar();
				System.out.println("Enhorabuena " + jugadorActivo.getNombre() + " has ganado!");
				return;
			}
			
			cambiarTurno();
		}
		
		System.out.println("Fase de movimiento");
		
		boolean finPartida=false;
		//Mientras no haya terminado la partida
		while(!finPartida) {
			mostrarTurno();
			moverFicha();
			if(tablero.hayGanador()) {
				finPartida=true;
			}
		}
	}
	
	public void moverFicha() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("dime la fila de la ficha que vas a mover: ");
		int f = sc.nextInt();
		System.out.println("dime la columa de la ficha que vas a mover: ");
		int c = sc.nextInt();
		
		if (tablero.getFicha(f, c)==jugadorActivo.getFicha()) {
		
		
		}
		sc.close();
	}
	
}
