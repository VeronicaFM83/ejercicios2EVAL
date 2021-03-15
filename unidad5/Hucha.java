package unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Hucha {

	// atributos //
	private String clave;
	private int importe; // parece que no hace falta
	private boolean abierta;
	private int[] tipos = {50,20,10,5,2,1}; // tipos de monedas/bill admitidos
	private int[] desglose = new int[tipos.length]; // array para almacenar uds de cada tipo
	public int cincuenta, veinte, diez, cinco, dos, uno;
	
	
	// constructores //
	public Hucha(String clave, boolean abierta) { // crea hucha vacía
		this.clave = clave;
		this.abierta = abierta;
		this.importe = 0;
	}
	
	public Hucha(String clave, boolean abierta, int cincuenta, int veinte, int diez, int cinco, int dos, int uno) { // crea hucha con billetes y/o monedas
		this.clave = clave;
		this.abierta = abierta;
		this.desglose[0] = cincuenta;
		this.desglose[1] = veinte;
		this.desglose[2] = diez;
		this.desglose[3] = cinco;
		this.desglose[4] = dos;
		this.desglose[5] = uno;
		//this(cincuenta,veinte,diez,cinco,dos,uno); sería otro modo más rápido de asignar
		this.importe = (cincuenta * 50 + veinte * 20 + diez * 10 + cinco * 5 + dos * 2 + uno);
	}
	
	public Hucha (String clave, boolean abierta, int importe) { //crea hucha indicando solo el importe
		this.clave = clave;
		this.abierta = abierta;
		this.importe = importe;
		for (int i=0; i<tipos.length && importe > 0; i++) { // recorre el array tipos
			if (importe >= tipos[i]) { // si es mayor o igual que el bill/moneda
				desglose[i] = importe / tipos[i]; // se graba en array desglose
				importe %= tipos[i]; // se asigna el resto del importe para la siguiente iteración
			}
		}
	}
	
	// métodos get
	public int[] getDesglose() { // devuelve desglose
		return desglose;
	}
	
	public String getAbierta() {
		if (abierta) {
			return "Abierta";
		} else {
			return "Cerrada";
		}
	}
	
	public int ingresar(int cantidad, int tipo) {
		//Arrays.asList(this.tipos);
		Arrays.asList(this.tipos).indexOf(tipo); // crea lista de array para poder usar búsqueda que devuelva posición, p.e.: busca "20" y devuelve pos 1 del array
		this.importe += (cantidad * tipo);
		return this.importe;
	}
	
	// métodos set
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public void setImporte(int importe) {
		this.importe = importe;
		for (int i=0; i<tipos.length && importe > 0; i++) { // recorre el array tipos
			if (importe >= tipos[i]) { // si es mayor o igual que el bill/moneda
				desglose[i] = importe / tipos[i]; // se graba en array desglose
				importe %= tipos[i]; // se asigna el resto del importe para la siguiente iteración
			}
		}
	}
	/* NO HACE FALTA
	public void setDesglose(int a, int b, int c, int d, int e, int f) {
		int[] tmpDesglose = {a,b,c,d,e,f};
		for (int i=0; i < tipos.length; i++) {
			this.desglose[i] = tmpDesglose[i];
		}
	}
	*/
	public void setAbierta(String clave) {
		if (clave.equals(this.clave)) {
			if (abierta) {
				abierta=false;
				System.out.println("Hucha cerrada");
			} else {
				abierta=true;
				System.out.println("Hucha abierta");
			}
		} else {
			System.out.println("Clave incorrecta");
		}
	}
	
	public void setRetirar(int cantidad) {
		if (this.importe>=cantidad) {
			this.importe -= cantidad;
			System.out.println(this.importe);
		} else {
			System.out.println("No tiene suficiente saldo");
		}
	}
	
	// toString //
	@Override
	public String toString() {
		return "Hucha con "+ importe +"€\nBilletes: 50x" + desglose[0] + " 20x" + desglose[1] + " 10x" + desglose[2] + " 5x" + desglose[3] + "\nMonedas: 2x" + desglose[4] + " 1x" + desglose[5] + "\nLa hucha está abierta: " + abierta;
	}
	
	
	// EJECUCION //
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); // Lo uso para String
		Scanner in = new Scanner (System.in); // Lo uso para Int

		System.out.println("Alta de nueva hucha. Introduzca clave.");
		String tmpClave=input.nextLine();
		System.out.println("¿Abierta o cerrada?");
		boolean tmpAbierta=true;
		String tmpEstado=input.nextLine();
		if (tmpEstado.equalsIgnoreCase("abierta") ) {
			tmpAbierta=true;
		} else if (tmpEstado.equalsIgnoreCase("cerrada")) {
			tmpAbierta=false;
		} else {
			System.out.println("ERROR");
			System.exit(1);
		}
		System.out.println("Indique importe inicial");
		int tmpImporte=in.nextInt();
		Hucha hucha1 = new Hucha(tmpClave,tmpAbierta,tmpImporte);
		System.out.println(hucha1);
		String accion="inicio";
		do {
			System.out.println("Acciones: ingresar, retirar, abrir o cerrar, estado, clave, salir");
			accion = input.nextLine();
			switch (accion) {
				case "ingresar":
					System.out.println("Valor del bill/moneda");
					int a = in.nextInt();
					System.out.println("Unidades");
					int b = in.nextInt();
					System.out.println(hucha1.ingresar(b,a));
					break;
				case "retirar":
					System.out.println("Cantidad");
					hucha1.setRetirar(in.nextInt());
					break;
				case "abrir":
				case "cerrar":
					System.out.println("Introduzca clave");
					hucha1.setAbierta(input.nextLine());
					break;
				case "estado":
					System.out.println(hucha1);
					break;
				case "clave":
					System.out.println("Introduzca nueva clave");
					hucha1.setClave(input.nextLine());
					break;
				default:
					System.out.println("FIN");
					System.exit(1); //Termina programa de forma inesperada
			}
		} while (accion!="salir");

		input.close();
		in.close();
	}
}
