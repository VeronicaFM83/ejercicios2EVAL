package u7_empleados;

import java.util.ArrayList;

public class PruebaEmpresas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Empresa> empresas = new ArrayList<>();
		String[] trabajos = {"Trabajo1","Trabajo2"};
		
		empresas.add(new SociedadAnonima("Tukillo, S.A.", "ES2256480", trabajos));
		System.out.println(empresas.get(0));
		SociedadAnonima soc = (SociedadAnonima) empresas.get(0);
		soc.setTrabajo("Trabajo3");
		System.out.println(soc.getListaTrabajos());
		
		EmpresaServicios nuevaEmpServ = new EmpresaServicios("El Romans", "ES9878586", "Catering");
		System.out.println(nuevaEmpServ);
		nuevaEmpServ.setServicio("Diseño");
		System.out.println(nuevaEmpServ.getListaServicios());
		nuevaEmpServ.realizarPago(200);
	}

}
