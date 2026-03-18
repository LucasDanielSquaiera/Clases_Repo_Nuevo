package interfaces.Ejercicios;

public abstract class Notificador {
	private String canal;
	
	
	public Notificador(String canal) {
		this.canal = canal;
	}
	
	
	public abstract void enviarMensaje(String mensaje);


	public String getCanal() {
		return canal;
	}

	
}
