package unidad5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Mazo {
	
	// ATRIBUTOS
	
	private int[][] cartasPosibles = {
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
		return ("Número de cartas de la baraja: " + this.naipes.size() + "\n" + this.naipes);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mazo nuevoMazo = new Mazo(2); // Creo un mazo con dos barajas
		System.out.println(nuevoMazo); // Imprimo contenido mazo
		System.out.println("Se selecciona un naipe: " + nuevoMazo.getNaipe()); // Devuelvo naipe al azar
		System.out.println("Se descarta el naipe " + nuevoMazo.removeNaipe()); // Borro naipe al azar
		System.out.println("Se añade naipe 8"); 
		nuevoMazo.addNaipe(8); // Añado naipe
		Collection listaCartas = new ArrayList<Integer>(); // Creo coleccion de naipes
		listaCartas.add(12); 
		listaCartas.add(6);
		nuevoMazo.addAll(listaCartas); // Añado coleccion al mazo
		System.out.println(nuevoMazo); // Devuelvo contenido del mazo
	}
}
