package pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EjerExcep3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String teclado, comando;
		Integer ca = null, cb = null;
		//ArrayList<String> comando = new ArrayList<>();
		
		System.out.println(">");
		teclado = input.nextLine();
		
		while (!teclado.equalsIgnoreCase("f")) {
			
			comando = teclado.substring(0,1);
			//comando = (ArrayList<String>) Arrays.asList(teclado.split(" "));
			switch (comando.toUpperCase()) {
				case "A":
					try {
						ca = Integer.parseInt(teclado.substring(1,teclado.length()).trim());
						System.out.println("Cateto A: " + ca);
					} catch (NumberFormatException e) {
						System.err.println("Error al introducir valor del cateto");
					} finally {
						break;
					}
				case "B":
					try {
						cb = Integer.parseInt(teclado.substring(1,teclado.length()).trim());
						System.out.println("Cateto B: " + cb);
					} catch (NumberFormatException e) {
						System.err.println("Error al introducir valor del cateto");
					} finally {
						break;
					}
				case "C":
					try {
						if (ca == null || cb == null) {
							throw new NullPointerException();
						}
						System.out.println("Hipotenusa: " + calcula(ca,cb));
						ca=null;
						cb=null;
					} catch (NullPointerException e) {
						System.err.println("ERROR. Establezca el valor de los catetos. A: " + ca + ", B: " + cb);
					} catch (Exception e) {
						System.err.println(e);
					} finally {
						break;
					}
				default:
					System.err.println("Introduzca un comando válido o \"F\" para salir");
			}
			
			System.out.println(">");
			teclado = input.nextLine();
		}
		input.close();
	}
	
	public static double calcula(int ca, int cb) {
		double h;
		h = (Math.pow(ca, 2) + Math.pow(cb, 2));
		return h;
	}
}
