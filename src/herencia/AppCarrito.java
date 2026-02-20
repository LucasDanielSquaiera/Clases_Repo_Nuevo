package herencia;

import java.util.ArrayList;

public class AppCarrito {

	public static void main(String[] args) {
		
		ArrayList<Producto> productos = new ArrayList<>();	

		Smartphone smart = new Smartphone("Redmi Note 14 Pro ", 250, 8);
		Television tele = new Television("Philips T400", 1200, 80);

		smart.toString();
		tele.toString();

		productos.add(tele);

		productos.add(smart);

		for(Producto p : productos) {
			System.out.println(p);
		}

	}

}
