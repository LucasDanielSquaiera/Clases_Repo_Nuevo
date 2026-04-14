package herencia.CasoPractico.EjerciciosLargos;

public class ValidadorService {
	private Validable [] fichero;
	
	public ValidadorService (Validable [] fichero) {
	this.fichero=fichero;
	}
	
	
	// rehacer si hay uno solo que no sea valido devuelve false y si todos completan devuelve true.
	public boolean validarTodo() {
		for (Validable f : this.fichero) {
			if (!f.isValid()) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validarFichero(Validable v) {
		return v.isValid();
	}
}
