package pruebas;

import java.util.Scanner;

public class EjerExcep3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String teclado;
		
		do {
			System.err.println(">");
			teclado = input.nextLine();
		} while (!teclado.equalsIgnoreCase("fin"));

		input.close();
	}

}
