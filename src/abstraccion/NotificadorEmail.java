package abstraccion;

public class NotificadorEmail extends Notificador {
	
	public NotificadorEmail(String mensaje) {
		super(mensaje);
	}
	
	
	@Override
	void enviarMensaje(String texto) {
		System.out.println("Este correo electrónico es un mensaje de " + texto);

	}

}
