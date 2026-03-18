package interfaces.Ejercicios;

public class NotificadorEmail extends Notificador {

	public NotificadorEmail(String canal) {
		super(canal);
	}

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println(mensaje+ this.getCanal());
	}
	
	
	
	
	
}
