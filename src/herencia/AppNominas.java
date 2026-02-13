package herencia;

public class AppNominas {

	public static void main(String[] args) {
		
		Empleado empleado = new Empleado ("Pedro", 1000);
		Comercial com = new Comercial("Paco", 1000, 250);
		Repartidor repaZonaUno = new Repartidor("Juan", 1000, 1);
		Repartidor repaZonaDos = new Repartidor("Juan", 1000, 2);
		
		System.out.println("El salario de empleado es: " + empleado.calcularSalario());
		System.out.println("El salario de comercial es: " + com.calcularSalario());
		System.out.println("El salario de repartidor en la zona 1 es: " + repaZonaUno.calcularSalario());
		System.out.println("El salario de repartidor en zona 2 es: " + repaZonaDos.calcularSalario());
		
		
		

	}

}
