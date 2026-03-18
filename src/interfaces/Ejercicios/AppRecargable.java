package interfaces.Ejercicios;

import java.util.ArrayList;

public class AppRecargable {

	public static void main(String[] args) {
		ArrayList<Recargable> lista = new ArrayList<>();
		
		Recargable movil = new TelefonoInteligente();
		Recargable coche = new CocheElectrico();
		Recargable linterna = new Linterna();
	
	lista.add(movil);
	lista.add(coche);
	lista.add(linterna);
	
	for (Recargable r : lista) {
		superviarEnergia(r);
	}
	
	}

	public static void superviarEnergia(Recargable r) {
		System.out.println("Obteniendo el nivel de energía: " + r.obtenerNivelBateria());
		
		r.cargar();
	}
	
	
	
	
}
