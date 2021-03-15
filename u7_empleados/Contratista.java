package u7_empleados;

import java.util.ArrayList;

public class Contratista extends Empleado {
	
	// atributos
	private ArrayList<SociedadAnonima> sociedades = new ArrayList<>();
	
	// metodos
	
	public Contratista(String nombre, String apellidos, String fecha, String cuenta) {
		super(nombre, apellidos, fecha, cuenta);
	}
	
	public Contratista(String nombre, String apellidos, String fecha, String cuenta, ArrayList<SociedadAnonima> sociedades) {
		super(nombre, apellidos, fecha, cuenta);
		this.sociedades = sociedades;
	}
	
	@Override
	public void realizarPago(double cantidad) {
		System.out.println("Realizando pago de " + cantidad + " a " + getNombre());
	}
	
	@Override
	public String toString() {
		return "Contratista [nombre=" + nombre + ", cuenta=" + cuenta + ", sociedades= " + sociedades + "]";
	}
	

}
