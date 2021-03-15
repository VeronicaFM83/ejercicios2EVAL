package u6_empleados;

import java.util.ArrayList;

public class Contratista extends Empleado {

	ArrayList<SociedadAnonima> empresas = new ArrayList<>();
	
	public Contratista(String nombre, String apellidos, String fecha, String cuenta) {
		super(nombre, apellidos, fecha, cuenta);
	}

	public void addEmpresa(SociedadAnonima empresa) {
		empresas.add(empresa);
	}
	
	public void removeEmpresa(SociedadAnonima empresa) {
		empresas.remove(empresa);
	}
	
	public SociedadAnonima [] getEmpresas() {
		return (SociedadAnonima []) empresas.toArray();
	}

	@Override
	public String toString() {
		return "Contratista [empresas=" + empresas + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void realizarPago(double cantidad) {
		System.out.println("Realizando pago de " + cantidad + "€ a " + getNombre() + " en calidad de contratista");
	}

}
