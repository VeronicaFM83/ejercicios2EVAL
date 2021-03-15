package u6_empleados;

import java.util.ArrayList;

public class SociedadAnonima extends Empresa implements Pagable {
	private ArrayList<String> trabajos;
	
	public SociedadAnonima(String nombre) {
		super(nombre);
	}

	public void addTrabajo(String trabajo) {
		trabajos.add(trabajo);
	}
	
	public void removeTrabajo(String trabajo) {
		trabajos.remove(trabajo);
	}
	
	public String [] getTrabajos() {
		return (String[]) trabajos.toArray();
	}

	@Override
	public String toString() {
		return "SociedadAnónima [trabajos=" + trabajos + "]";
	}

	@Override
	public void realizarPago(double cantidad) {
		// TODO Auto-generated method stub
		System.out.println("Realizando pago de " + cantidad + "€ a " + getNombre() + " en calidad de S.A.");
	}
}
