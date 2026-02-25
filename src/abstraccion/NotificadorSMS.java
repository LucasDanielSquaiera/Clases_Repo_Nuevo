package abstraccion;

public class NotificadorSMS extends Notificador {

	public NotificadorSMS(String mensaje) {
		super(mensaje);
	}
	@Override
	void enviarMensaje(String texto) {
		System.out.println("Este mensaje teleónico es " + texto);

	}

}
