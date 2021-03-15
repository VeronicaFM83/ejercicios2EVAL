package u7_empleados;

import java.util.ArrayList;
import java.util.Arrays;

public class EmpresaServicios extends Empresa {
	
	// atributos
	private String [] arrServicios = {"Catering", "Telefonía", "Suministro eléctrico", "Limpieza"};
	protected ArrayList<String> listaServicios = new ArrayList<>(Arrays.asList(arrServicios));
	private String servicio;
	
	// metodos
	public EmpresaServicios(String nombre, String cuenta) {
		super(nombre, cuenta);
	}
	
	public EmpresaServicios(String nombre, String cuenta, String servicio) {
		super(nombre, cuenta);
		this.servicio = compruebaServicio(servicio);
	}
	
	
	public String getServicio() {
		return servicio;
	}
	
	public void setServicio(String servicio) {
		this.servicio = compruebaServicio(servicio);
	}
	
	

	public ArrayList<String> getListaServicios() {
		return listaServicios;
	}

	public String compruebaServicio(String servicio) {
			for (String x: listaServicios) {
				if (servicio.equalsIgnoreCase(x)) {
					return x;
				}
			}
			listaServicios.add(servicio);
			return servicio;
	}
	
	@Override
	public void realizarPago(double cantidad) {
		System.out.println("Realizando pago de " + cantidad + " en concepto de servicio de " + servicio + " a " + getNombre());
	}
	
	@Override
	public String toString() {
		return "Empresa Servicios [nombre=" + nombre + ", cuenta=" + cuenta + ", servicio= " + servicio + "]";
	}
	
	
}
