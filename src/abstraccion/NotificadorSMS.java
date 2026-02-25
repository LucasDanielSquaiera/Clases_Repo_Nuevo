package abstraccion;

public class NotificadorSMS extends Notificador {

	public NotificadorSMS(String canal) {
		super(canal);
		}

	@Override
	void enviarMensaje(String texto) {
		System.out.println("Este mensaje teleónico es " + texto);

	}

}
