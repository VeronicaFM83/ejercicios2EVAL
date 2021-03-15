package u6_empleados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaEmpresas {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Pagable> pagables = new ArrayList<>();
		pagables.add(new Asalariado("Juan", "Pérez", "1/1/1991", "1", 1000));
		pagables.add(new Contratista("Juan", "Pérez", "1/1/1991", "1"));
		pagables.add(new EmpresaServicios("Telefónica", "telefonía", "2"));
		System.out.println(pagables);
		ArrayList<Empleado> empleados = new ArrayList<>();
		empleados.add(new Asalariado("Vanesa", "Fernandez", "5/12/1983", "3", 1100));
		empleados.add(new Contratista("Juan", "Pérez", "1/1/1991", "1"));
		System.out.println("SIN ORDEN:\n " + empleados);
		Collections.sort(empleados); // Requiere Comparable o Comparator implementado en superclase
		System.out.println("ORDEN:\n " + empleados);		
		
		for(Pagable p: pagables) {
			double cantidad;
			if (p instanceof Asalariado)
				cantidad = ((Asalariado) p).getSalario();
			else if (p instanceof Contratista)
				cantidad = 10000;
			else
				cantidad = 5000;
			p.realizarPago(cantidad);
		}
	}

}
