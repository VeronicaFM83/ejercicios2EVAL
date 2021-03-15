package unidad6;

public class EmpresaPepitoPerez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche cocheEmpresaVentas = new Coche("Seat","Panda","Rojo","5555KKK",TipoSeguro.A_TERCEROS);
		Coche cocheEmpresaDireccion = new Coche("0000BBBB");
		System.out.println(cocheEmpresaDireccion.getMatricula());
		System.out.println(cocheEmpresaDireccion.imprimeCoche());
		System.out.println(cocheEmpresaVentas.getMatricula());
		System.out.println(cocheEmpresaVentas.imprimeCoche());
	}

}
