package Ejercicios;

import java.util.ArrayList;

public class ContarBuscarArrayList {

	public static void main(String[] args) {
	ArrayList <Integer> numeros = new ArrayList<>();
	numeros.add(10);
	numeros.add(4);
	numeros.add(56);
	numeros.add(9);
	numeros.add(88);
	numeros.add(5);
	numeros.add(11);
	numeros.add(2);
	numeros.add(1);
	numeros.add(100);
	
	System.out.println(numeros);
	//encontranod el valor máximo
	int mayor = 0;
	for (int i = 0; i < numeros.size()-1; i++) {
		if(numeros.get(i) > numeros.get(i+1)){
		mayor = numeros.get(i);
		} else if(numeros.get(i) <  numeros.get(i+1)) {
		mayor = numeros.get(i+1); 
		}
	} 	System.out.println("El número mayor del array es: "+mayor);

	//encontrando el valor mínimo
	int menor = 0;
	for (int i = 0; i < numeros.size()-1; i++) {
		if(numeros.get(i) > numeros.get(i+1)){
		menor = numeros.get(i+1);
		} else if(numeros.get(i) <  numeros.get(i+1)) {
		menor = numeros.get(i); 
		}
	} 	System.out.println("El número mayor del array es: "+menor);
	// encontrando cuántos valores son mayores que 10
	int contador= 0; 
	
	for (int i = 0; i < numeros.size(); i++) {
	
		if(numeros.get(i) > 10) {
			contador ++;
		}
	} System.out.println("En el arraylist hay " + contador + " números mayores a 10.");
	
	int acumulador = 0;
	for(int n : numeros) {
	acumulador+= n;	
	}System.out.println("La suma de todos los elementos del arrayList es: " + acumulador);
	
	
	}

}
