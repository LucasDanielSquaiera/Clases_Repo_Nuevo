package herencia;

public class AppLibro {

	public static void main(String[] args) {
	
		Libro libro1 = new Libro("Libro1", 123456);
		Libro libro2 = new Libro("Libro1", 123456);

		
		System.out.println(libro1.equals(libro2));
		System.out.println(libro1==libro2);
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
	}

}
