package interfaces.Ejercicios;

public class NotificadorSMS extends Notificador {

	public NotificadorSMS(String canal) {
		super(canal);
	}

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println(mensaje+ this.getCanal());		
	}

	
	
	
}
