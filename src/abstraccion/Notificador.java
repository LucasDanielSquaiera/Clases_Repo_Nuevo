package abstraccion;

public abstract class Notificador {
	protected String canal;
	
	
	protected Notificador (String canal) {
		this.canal=canal;
	}
	
	abstract void enviarMensaje(String texto);
	
	
}
