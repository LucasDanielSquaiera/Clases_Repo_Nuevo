package Ejercicios;

public class TablasMultiplicar {

		public static void main(String []args){
			
			int num = 0;
			
			for (int i = 0; num <= 10; i++) {
				
				System.out.println("\nTabla del " + i);
				
				for (int j = 0 ; j<=10; j++) {
				
					int resultado = j * num;
					
					System.out.println("\nEl número " + num + " por " + j + " es: " + resultado );
					}
				
				num++; 
				
			}
			
			
			
			
			
		}
}
