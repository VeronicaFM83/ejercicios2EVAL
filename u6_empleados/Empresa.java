package u6_empleados;

public abstract class Empresa implements Pagable{
	private String nombre;

	public Empresa(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + "]";
	}
}
