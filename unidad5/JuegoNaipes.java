package unidad5;

import java.util.Scanner;

public class JuegoNaipes {
	Scanner in = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Mazo nuevoMazo = new Mazo();
		System.out.println(nuevoMazo);
		int carta1, carta2; 
		String ganador = "";
		int mayor = 0;
		for (int i=1; i<=5; i++) {
			System.out.println("Turno del jugador 1.");
			carta1 = nuevoMazo.removeNaipe();
			System.out.println(carta1);
			System.out.println("Turno del jugador 2.");
			carta2 = nuevoMazo.removeNaipe();
			System.out.println(carta2);
			if (carta1 > mayor || carta2 > mayor) {
				if (carta1>carta2) {
					mayor = carta1;
					ganador = "Jugador 1"; 
				} else if (carta1<carta2){
					mayor = carta2;
					ganador = "Jugador 2"; 
				} else {
					mayor = carta1;
					ganador = "Ambos jugadores";
				}
			} else if (carta1==mayor) {
				if (ganador == "Jugador 2") {
					ganador = "Ambos jugadores";
				}
			} else if (carta2==mayor) {
				if (ganador == "Jugador 1") {
					ganador = "Ambos jugadores";
				}
			}
		}
		System.out.println("El ganador es " + ganador + " con el naipe " + mayor);
		System.out.println(nuevoMazo);
	}
}
