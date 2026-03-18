package interfaces.Ejercicios;

import java.util.ArrayList;

public class AppMain {

	public static void main(String[] args) {
		ArrayList<Notificador> arr = new ArrayList<>();

		Notificador correo = new NotificadorEmail("Email");
		Notificador movil = new NotificadorSMS("Móvil");
		
		arr.add(correo);
		arr.add(movil);
		
		for (Notificador n : arr) {
			n.enviarMensaje("Este es un mensaje de prueba que se ha enviado por ");
		}
		
	}

}
