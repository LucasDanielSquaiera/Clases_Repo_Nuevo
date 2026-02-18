package herencia;

import java.util.Objects;

public class Libro {
	private String titulo;
	private int isbn;
	
	public Libro (String titulo, int isbn) {
		this.titulo = titulo;
		this.isbn = isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", isbn=" + isbn + "]";
	}

	
	
	

}
