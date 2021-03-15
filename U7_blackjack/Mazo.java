package U7_blackjack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Mazo {

	//COMPROBAR//
	
	

	
	protected int[][] cartasPosibles = {
			{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14},
			{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14},
			{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14},
			{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}};
	
	private ArrayList<Integer> naipes = new ArrayList<>();
	
	// METODOS
	
	// Constructores
	public Mazo() {
		//this.naipes.add(cartasPosibles);
		//naipes = new ArrayList<>(Arrays.asList(cartasPosibles));
		for (int[] palo: cartasPosibles) {// Recorre array
			for (int carta: palo) {// Recorre sub-array
				this.naipes.add(carta); // Añade valor de array a arrayList
			}
		}
	}
	
	public Mazo(int n) {
		for (int[] palo: cartasPosibles) {// Recorre array
			for (int carta: palo) {// Recorre sub-array
				this.naipes.add(carta); // Añade valor de array a arrayList
			}
		}
	}
	
	// get
	public int getNaipe() {
		Random r = new Random();
		int naipePosicion = r.nextInt(this.naipes.size()); // número random entre 0 y tamaño de ArrayList
		return this.naipes.get(naipePosicion); // devuelve valor de la posición dentro del ArrayList
	}
	
	// remove
	public int removeNaipe() {
		Random r = new Random();
		int naipePosicion = r.nextInt(this.naipes.size()); // número random entre 0 y tamaño de ArrayList
		int carta = this.naipes.get(naipePosicion);
		this.naipes.remove(naipePosicion);
		return carta;
	}
	
	// add
	public void addNaipe(int carta) {
		this.naipes.add(carta);
	}
	
	// addAll
	public void addAll(Collection listaCartas) {
		this.naipes.addAll(listaCartas);
	}
	
	//toString
	@Override
	public String toString() {
		return ("Número de cartas de la baraja: " + this.naipes.size() + "\n" + this.naipes + "\n");
	}

}
