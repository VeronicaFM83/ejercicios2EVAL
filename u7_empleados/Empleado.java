package u7_empleados;

public abstract class Empleado implements Pago{
	
	// atributos
	
	protected String nombre;
	protected String apellidos;
	protected String fecha;
	protected String cuenta;
	
	// metodos
	
	public Empleado(String nombre, String apellidos, String fecha, String cuenta) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFecha() {
		return fecha;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	@Override	
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha=" + fecha + ", cuenta=" + cuenta + "]";
	}
	
}
