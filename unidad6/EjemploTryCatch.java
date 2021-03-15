package unidad6;

import java.util.Scanner;

public class EjemploTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numero = 0;
		boolean incorrecto = true;
		while (incorrecto) {
			System.out.println("Introduzca un numero");
			try {
				numero = Integer.parseInt(input.nextLine().trim());
				incorrecto = false;
			}
			catch(NumberFormatException e) {
				incorrecto = true;
				System.err.println("Numero no valido");
			}
			catch(Exception e2) {
				System.err.println("Otro error desconocido");
			}
			finally {
				System.out.println("Fin");
			}
		}
		System.out.println(numero);
	}

}
