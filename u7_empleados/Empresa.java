package u7_empleados;

public abstract class Empresa implements Pago {
	
	// atributos
	protected String nombre;
	protected String cuenta;
	
	// metodos
	public Empresa (String nombre, String cuenta) {
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", cuenta=" + cuenta + "]";
	}
	
	

}
