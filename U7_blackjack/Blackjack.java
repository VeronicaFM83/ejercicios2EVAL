package U7_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

import u6_biblioteca.Publicacion;

public class Blackjack {
	public static void main(String[] args) {
		System.out.print("Blackjack>");
		Scanner input = new Scanner (System.in);
		String teclado = input.nextLine();
		
		ArrayList<Mazo> mazos = new ArrayList<>();
		
		while (!(teclado.equalsIgnoreCase("fin"))){
			teclado = teclado.toUpperCase();
			switch(teclado){
				case "REPARTIR":
					mazos.add(new Mazo());
					System.out.print(mazos.get(0));
				default:
					System.out.print("Indique un comando válido\n");

			}
			System.out.print("Blackjack>");
			teclado = input.nextLine();
		}
	}
}
