package abstraccion;

import java.util.ArrayList;

public class AppReto {

	public static void main(String[] args) {
		
		// No se puede instanciar una clase abstracta
		//Notificador noti = new Notificador("Alerta!!!");

		Notificador mensaje = new NotificadorEmail("EMAIL");
		Notificador mensaje2 = new NotificadorSMS("SMS");
		
		ArrayList<Notificador> lista = new ArrayList<>();
		lista.add(mensaje);
		lista.add(mensaje2);
		
		for(Notificador n : lista) {
			n.enviarMensaje("ALERTA!!!!!!");
		}
		
	}

}
