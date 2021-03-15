package u7_empleados;

import java.util.ArrayList;
import java.util.Arrays;

public class SociedadAnonima extends Empresa {
	// atributos
	private ArrayList<String> listaTrabajos = new ArrayList<>();
	
	// metodos
	
	public SociedadAnonima(String nombre, String cuenta) {
		super(nombre, cuenta);
	}
	
	public SociedadAnonima(String nombre,  String cuenta, String[] listaTrabajos) {
		super(nombre, cuenta);
		this.listaTrabajos = new ArrayList<String>(Arrays.asList(listaTrabajos));
	}
	
	public void setTrabajo(String trabajo) {
		this.listaTrabajos.add(trabajo);
	}
	
	public ArrayList<String> getListaTrabajos() {
		return listaTrabajos;
	}
	
	public void remTrabajo(String trabajo) {
		boolean encontrado = false;
		for (String x: this.listaTrabajos) {
			if (x.equalsIgnoreCase(trabajo)) {
				this.listaTrabajos.remove(x);
				encontrado = true;
				break;
			}
		}
		if (encontrado) {
			System.out.println("Se ha eliminado: " + trabajo);
		} else {
			System.out.println("No encontrado");
		}
	}
	
	@Override
	public void realizarPago(double cantidad) {
		System.out.println("Realizando pago de " + cantidad + " a " + getNombre());
	}

	@Override
	public String toString() {
		return "S.A. [nombre=" + nombre + ", cuenta=" + cuenta + ", lista de trabajos= " + listaTrabajos + "]";
	}

}
