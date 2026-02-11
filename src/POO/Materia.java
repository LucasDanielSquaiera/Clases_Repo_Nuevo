package POO;

import java.util.ArrayList;

public class Materia {
	
	private String nombre;
	private int codigoMateria;
	private ArrayList<Estudiante> estudiantes;
	
	private static String facultad="UVA";
	private static int numeroMatriculas = 0;
	private static int genCodMateria=301;
	
	public Materia(String nombre) {
		this.nombre=nombre;
		this.codigoMateria=genCodMateria;
		this.estudiantes= new ArrayList<>();
		genCodMateria++;
	}
	
	public int getCodigoMateria() {
		return codigoMateria;
	}

	public void matricularEstudiante(Estudiante e) {
		estudiantes.add(e);
		//Independiente de la materia
		numeroMatriculas++;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public static String getFacultad() {
		return facultad;
	}

	public static void setFacultad(String facultad) {
		Materia.facultad = facultad;
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public int numeroEstudiantes() {
		return estudiantes.size();
	}
	
	public static int getNumeroMatriculas() {
		return numeroMatriculas;
	}






}