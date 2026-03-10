package herencia.CasoPractico;

public class AppStreamMaster {

	public static void main(String[] args) {
		PlanEstandar pe = new PlanEstandar("NetflixEstandar", 10.99);
		
		PlanFamiliar pf = new PlanFamiliar("BonoPiscinaTodoElAnio", 300);
	
		PlanEstudiante pes = new PlanEstudiante("MensualidadGimnasio", 50, "UVA");
		
		Perfil estan = new Perfil ("Brayan01", 20);
		
		Perfil familia = new Perfil ("Aitor01", 21);
		
		Perfil estu = new Perfil ("Lucas01", 22);
		
		
		pe.añadirPerfil(estan);
		
		pe.añadirPerfil(estu);
	
	
	
	System.out.println("Número de perfiles en " + pe.getNombreUsuario() );
		
	
	}

	
	
	
}
