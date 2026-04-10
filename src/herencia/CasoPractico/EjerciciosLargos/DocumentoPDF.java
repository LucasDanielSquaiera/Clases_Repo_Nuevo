package herencia.CasoPractico.EjerciciosLargos;

public class DocumentoPDF extends Documento {

	public DocumentoPDF(long size) {
		super(size);
	}

	@Override
	public boolean isValid() {
		if (this.getSize() < 1048576) {
			return true;
		} else {
		return false;
		}
	}

}
