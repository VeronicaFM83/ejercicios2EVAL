package u6_empleados;

public abstract class Empleado implements Pagable, Comparable<Empleado> {

	protected String nombre;
	protected String apellidos;
	protected String fecha;
	protected String cuenta;

	public Empleado(String nombre, String apellidos, String fecha, String cuenta) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.cuenta = cuenta;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
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

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha=" + fecha + ", cuenta=" + cuenta
				+ "]";
	}
	
	@Override
	public int compareTo(Empleado a) {
		int r;
		if (a==null)
			throw new NullPointerException();
		r = this.getNombre().compareTo(a.getNombre());
		if (r==0)
			r = this.getApellidos().compareTo(a.getApellidos());
		return r;
	}
}
