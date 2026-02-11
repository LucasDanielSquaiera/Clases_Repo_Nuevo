package POO;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class AppGestionMatricula {
	private static ArrayList<Materia> materias = new ArrayList<>();
	private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
	
	private static Scanner sc = new Scanner(System.in);

	public static void mostrarEstudiantes() {
		for (Estudiante e : estudiantes) {
			System.out.println(e.getNumMatricula() + "-"+ e.getNombre());
		}
		
	}
	public static void mostrarMaterias() {
		for (Materia m : materias) {
			System.out.println(m.getCodigoMateria()+ "-"+ m.getNombre());
		}
		
	}
	public static void anadirMateria() {
		System.out.println("¿Cómo se llama la materia ?");
		String nombre = sc.nextLine();
		Materia mat = new Materia (nombre);
		materias.add(mat);
	}
	
	public static void anadirEstudiante() {
		System.out.println("¿Cómo se llama el estudiante?");
		String nombre = sc.nextLine();
		Estudiante estu = new Estudiante(nombre);
		estudiantes.add(estu);
	}
	public static void matricularEstudiante() {
		System.out.println("Elige el código del estudiante:");
		mostrarEstudiantes();
		int codEstu = sc.nextInt();
		sc.nextInt();
		mostrarMaterias();
		System.out.println("Elige el código de una materia:");
		sc.nextInt();
		int codMat = sc.nextInt();
		
		Estudiante estudiante = null;
		Materia materia = null;
		
		//Limpiamos buffer
		sc.nextLine();
	
		//buscamos el estudiante
		for (Estudiante e : estudiantes) {
			if(e.getNumMatricula()==codEstu) {
				estudiante = e;
				break;
			}
				
		}
		for (Materia m : materias) {
			if (m.getCodigoMateria() == codMat) {
				//aqui no creamos una copia del objeto, estamos copiando una referencia por eso cambia el array
				materia = m;
			}
		}
		
		if (estudiante != null && materia != null) {
			materia.matricularEstudiante(estudiante);
			System.out.println("Matriculado!");
		}
	}
	
	public static void mostrarTotalMatriculados() {
		System.out.println("En total hay " + Materia.getNumeroMatriculas());
	}
	
	public static void mostrarMatriculadorsMateria() {
		System.out.println("Elige el código de una materia");
		mostrarMaterias();
		int codMateria = sc.nextInt();
		
		for (Materia m : materias) {
			if (m.getCodigoMateria()== codMateria) {
				m.getEstudiantes();
				System.out.println("En total son: " + m.numeroEstudiantes());
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int opcion;
	do {
			
			System.out.println("¿Qué te gustaría hacer?");
			System.out.println("\n1-Añadir una materia");
			System.out.println("2-Añadir un estudiante");
			System.out.println("3-Matricular a un estudiante");
			System.out.println("4-Listar las materias");
			System.out.println("5-Listar los estudiante");
			System.out.println("6-Ver número total de matriculados");
			System.out.println("7-Ver número total de matriculados");
			System.out.println("0-Salir");
			
			System.out.println("\n¿Qué eliges?");
			opcion=sc.nextInt();
			sc.nextLine();

			switch (opcion) {
				case 1: 
					anadirMateria();
						break;
				case 2:
					anadirEstudiante();
					break;
				case 3:
					matricularEstudiante();
					break;
				case 4:
					mostrarMaterias();
					break;
				case 5:
					mostrarEstudiantes();
					break;
				case 6:
					mostrarTotalMatriculados();
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
