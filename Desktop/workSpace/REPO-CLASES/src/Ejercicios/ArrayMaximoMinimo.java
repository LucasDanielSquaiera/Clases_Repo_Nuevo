package Ejercicios;

public class ArrayMaximoMinimo {

	public static void main(String[] args) {
		
		double[] arr = {1.0,2.0,4.0,5.5,1.1};
		double maximo = arr[0];
		double minimo = arr[0];
		
		for (int i = 1;i < arr.length; i ++) {
			if (arr[i] > maximo) {
				maximo = arr[i];
			}else if (arr[i] < minimo) {
				minimo = arr[i];
			}
			
		}System.out.println(maximo);
		System.out.println(minimo);
		

	}

}
