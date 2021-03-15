package unidad5;

import java.util.Scanner;

/**
 * CLASE CUENTA
 * @author vero
 *
 */

public class Cuenta {
	
	// atributos 
	
	private String titular;
	private Double cantidad;
	
	// constructores 
	
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public Cuenta(String titular) {
		this.titular = titular;
		this.cantidad = (double) 0;
	}
	
	// get ////
	public String getTitular() {
		return titular;
	}
	
	public Double getCantidad() {
		return cantidad;
	}
	
	// set ////
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	// toString ///
	@Override
	public String toString() {
		return "Titular cuenta: " + titular + ". Cantidad: " + cantidad + "€"; 
	}
	
	// métodos ///
	
	public void ingresar(double cantidad) {
		if (cantidad > 0 ) {
			this.cantidad += cantidad;
		}
	}
	
	public void retirar(double cantidad) {
		if (this.cantidad - Math.abs(cantidad) < 0) {
			this.cantidad = (double) 0;
		} else {
			this.cantidad -= Math.abs(cantidad);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta_1 = new Cuenta("Paco");
        Cuenta cuenta_2 = new Cuenta("Pepe", 300);
        Integer importe;
        System.out.println (cuenta_1 + "\n" + cuenta_2 + "\n");

        System.out.println ("Nombre de la cuenta:");
        Scanner input = new Scanner (System.in); // Creación de objeto Scanner
		String nombre = input.nextLine (); // Almacenamos el texto captado por teclado
		if (cuenta_1.titular.equals(nombre)) { // Uso if-else porque switch solo permite usar expresiones constantes. Uso equals en lugar de == para que funcione
				System.out.println ("Saldo en cuenta: " + cuenta_1.cantidad + "€");
		        System.out.println ("¿Cuánto dinero desea ingresar?");
		        importe = input.nextInt (); // Almacenamos el texto captado por teclado
				cuenta_1.ingresar(importe);
				System.out.println ("Saldo en cuenta: " + cuenta_1.cantidad);
				System.out.println ("¿Cuánto dinero desea retirar?");
				importe = input.nextInt ();
				cuenta_1.retirar(importe);
				System.out.println ("Saldo en cuenta: " + cuenta_1.cantidad);
				System.out.println ("INFO CUENTA");
				System.out.println(cuenta_1);
		} else if (cuenta_2.titular.equals(nombre)) { // Uso equals en lugar de == para que funcione con el atributo del objeto 
			System.out.println ("Saldo en cuenta: " + cuenta_2.cantidad + "€");
	        System.out.println ("¿Cuánto dinero desea ingresar?");
	        importe = input.nextInt (); // Almacenamos el texto captado por teclado
			cuenta_2.ingresar(importe);
			System.out.println ("Saldo en cuenta: " + cuenta_2.cantidad);
			System.out.println ("¿Cuánto dinero desea retirar?");
			importe = input.nextInt ();
			cuenta_2.retirar(importe);
			System.out.println ("Saldo en cuenta: " + cuenta_2.cantidad);
			System.out.println ("INFO CUENTA");
			System.out.println(cuenta_2);
		} else {
				System.out.println ("ERROR, no existe la cuenta.");
		}
		input.close();
	}
}
