package Ejercicios;

import java.util.ArrayList;

public class PrimerArrayList {

	public static void main(String[] args) {
		ArrayList <String> nombreAlumnos = new ArrayList<>();

		nombreAlumnos.add("Lucas");
		nombreAlumnos.add("Brayan");
		nombreAlumnos.add("Samuel");
		nombreAlumnos.add("Alex");
		nombreAlumnos.add("Michael");
		
		for(int i = 0; i < nombreAlumnos.size();i ++) {
			System.out.println("El nombre del alumno en la posición " + (i+1) + " es: "+nombreAlumnos.get(i));
			
		}
		
		for(String nombre : nombreAlumnos) {
			System.out.println("El nombre del alumno es: " + nombre);
			
		}
		
	}

}
