package herencia.CasoPractico.EjerciciosLargos;

public class ClaseMain {

	public static void main(String[] args) {
		
		//objetos válidos
		Validable f1 = new DocumentoPDF(1000000);
		Validable f2 = new ImagenJPG(2000, 3000);
		Validable f3 = new VideoMp4(200);
		//objetos inválidos de prueba
		Validable f4 = new DocumentoPDF(1050000);
		Validable f5 = new ImagenJPG(2500000, 3);
		Validable f6 = new VideoMp4(310);
		
		Validable [] listaValida = {f1,f2,f3};
		Validable [] listaInvalida = {f4,f5,f6};
		ValidadorService ficheros = new ValidadorService(listaValida);
		
		ValidadorService ficheros2 = new ValidadorService(listaInvalida);
		ficheros.validarTodo();
	
		
	}

}
