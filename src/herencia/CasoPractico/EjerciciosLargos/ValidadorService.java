package herencia.CasoPractico.EjerciciosLargos;

public class ValidadorService {
	private Validable [] fichero;
	
	public ValidadorService (Validable [] fichero) {
	this.fichero=fichero;
	}
	
	
	// rehacer si hay uno solo que no sea valido devuelve false y si todos completan devuelve true.
	public void validarTodo() {
		for (Validable v1 : fichero) {
		System.out.println("Documento válido: " + v1.isValid());	
		}
	}
	
	public static boolean validarFichero(Validable v) {
		return v.isValid();
		
	}
}
