package unidad6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) throws Exception {
		
		Ejercicio6 e = new Ejercicio6();
		
		Scanner in = new Scanner(System.in);
		String opcion;
		while (!(opcion = in.next()).equalsIgnoreCase("fin")) {
			try {
				lanzarExcepcion(Integer.parseInt(opcion));
			} catch (ArithmeticException a){
				System.err.println("Dividete por cero! - checked");
			} catch (ArrayIndexOutOfBoundsException a) {
				System.err.println("Te saliste del array! - checked");
			} catch (FileNotFoundException a) {
				System.err.println("Dónde se fue el archivo?!");
			} catch (NullPointerException a) {
				System.err.println("Null es null");
			} catch (NumberFormatException a) {
				System.err.println("Sólo números, please");
			} catch (ClassNotFoundException a) {
				System.err.println("No te inventes clases...");
			}
		}
		in.close();
	}
		static void lanzarExcepcion(int opcion) throws Exception {
		switch (opcion) {
		case 1:
		System.out.println(1 / 0);
		break;
		case 2:
		int [] a = new int[10];
		a[a.length] = a.length;
		break;
		case 3:
		FileInputStream in = new FileInputStream("este fichero no existe");
		break;
		case 4:
		Object o = null;
		System.out.println(o.toString());
		break;
		case 5:
		Ejercicio6 e = new Ejercicio6();
		break;
		default:
		Class.forName("UnaClase");
		}
		}
}
