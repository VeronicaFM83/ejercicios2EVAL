package u7_empleados;

public class Asalariado extends Empleado {
	// atributos
	
	// metodos
	
	public Asalariado(String nombre, String apellidos, String fecha, String cuenta) {
		super(nombre, apellidos, fecha, cuenta);
	}
	
	@Override
	public void realizarPago(double cantidad) {
		System.out.println("Realizando pago de " + cantidad + " a " + getNombre());
	}
	
	@Override	
	public String toString() {
		return "Asalariado [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha=" + fecha + ", cuenta=" + cuenta
				+ "]";
	}
	
	
}
