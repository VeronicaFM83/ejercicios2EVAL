package unidad6;

import java.util.ArrayList;

public class Entrenador {
	
	private String nombre;
	private int numInsignias;
	private ArrayList<Pokemon> colPokemon = new ArrayList<>();

	// constructor
	public Entrenador(String nombre) {
		this.nombre = nombre;
		this.numInsignias = 0;
	}

	// getters y setters
	public String getInsignias() {
		return (this.nombre + " " + this.numInsignias);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumInsignias() {
		return numInsignias;
	}

	public void sumaInsignia(int num) {
		this.numInsignias += num;
	}

	public ArrayList<Pokemon> getColPokemon() {
		return colPokemon;
	}

	public void setColPokemon(ArrayList<Pokemon> colPokemon) {
		this.colPokemon = colPokemon;
	}

	public int cuentaPokemons() {
		return this.colPokemon.size();
	}

	public void setPokemon(Pokemon pokemon) {
		this.colPokemon.add(pokemon);
	}
	
	// search
	public boolean searchElemento(String elemento) {
		int contador = 0;
		for (int i=0; i<this.colPokemon.size() ; i++) {
			if (colPokemon.get(i).getElemento().equals(elemento)){
				contador++;
			}
		}
		if (contador>0) {
			this.numInsignias++;
			return true;
		} else { 
			return false;
		}
	}
	
	// -10 puntos todos los pokemon
	public void pierdeRonda() {
		int puntos;
		for (int i=0; i<this.colPokemon.size() ; i++) {
			puntos = colPokemon.get(i).setSalud();
			//System.out.println(colPokemon.get(i) +" Salud: " + colPokemon.get(i).getSalud());
			if (puntos < 1){
				System.out.println("Muere pokemon: " + colPokemon.get(i));
				colPokemon.remove(i);
			}
		}
	}
	
	// toString
	public String toString() {
		return "Nombre: " + this.nombre + ", nº insignias: " + 
				this.numInsignias + ", pokemons: " + this.colPokemon; 
	}

}
