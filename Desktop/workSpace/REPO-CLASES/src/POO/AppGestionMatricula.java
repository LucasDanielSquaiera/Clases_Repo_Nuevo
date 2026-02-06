package POO;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class AppGestionMatricula {

	public static void mostrarEstudiantes(ArrayList<Estudiante> estus) {
		for (Estudiante e : estus) {
			System.out.println(e.getNumMatricula() + "-"+ e.getNombre());
		}
		
	}
	public static void mostrarMaterias(ArrayList<Materia> materias) {
		for (Materia e : materias) {
			System.out.println(e.getCodigoMateria()+ "-"+ e.getNombre());
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Materia> materias = new ArrayList<>();
		ArrayList<Estudiante> estudiantes = new ArrayList<>();
		
		
		int opcion;
	do {
			
			System.out.println("¿Qué te gustaría hacer?");
			System.out.println("\n1-Añadir una materia");
			System.out.println("2-Añadir un estudiante");
			System.out.println("3-Matricular a un estudiante");
			System.out.println("4-Listar las materias");
			System.out.println("5-Listar los estudiante");
			System.out.println("6-Ver número total de matriculados");
			System.out.println("0-Salir");
			
			System.out.println("\n¿Qué eliges?");
			opcion=sc.nextInt();
			sc.nextLine();

			switch (opcion) {
				case 1: 
					
					System.out.println("Ingrese el nombre de la materia a inscribir: \n");
					String usuario = sc.nextLine();
					Materia materiaIngresada = new Materia(usuario);
 					materias.add(materiaIngresada);
					
					break;
				case 2:
					
					System.out.println("Dime el nombre del alumno: \n");
					usuario = sc.nextLine();
					Estudiante eNuevo = new Estudiante(usuario);
					estudiantes.add(eNuevo);
					
					break;
				case 3:
					System.out.println("Por favor indique el nombre del alumno: ");
					usuario = sc.nextLine();
					Estudiante eMatriculado = new Estudiante(usuario);
					
						//Materia.matricularEstudiante(eMatriculado);
					
					break;
				case 4:
					mostrarMaterias(materias);
					break;
				case 5:
					mostrarEstudiantes(estudiantes);
					break;
				case 6:
					
					break;
				case 0:
					System.out.println("Hasta luego!");
					break;
				default:
					System.out.println("Elige una opción valida");

			}


			
		}while(opcion!=0); 

	
	}

}
