package unidad5;

import java.util.Arrays;

public class Pokemon {
	
	private String nombre;
	private String elemento;
	private int puntosSalud;
	public static String [] listaElementos = {"fuego","agua","electricidad","psíquico"};
	
	// constructor
	public Pokemon(String nombre, String elemento, int puntosSalud) {
		if (Arrays.asList(listaElementos).contains(elemento)) {
			this.elemento = elemento;
			this.nombre = nombre;
			this.puntosSalud = puntosSalud;
		} else {
			System.out.println("El elemento no existe");
		}
	}

	// get
	public int getSalud() {
		return this.puntosSalud;
	}
	
	public String getElemento() {
		return this.elemento;
	}
	
	// set
	public int setSalud() {
		this.puntosSalud -= 10;
		return this.puntosSalud;
	}
	
	// toString
	public String toString() {
		return "Nombre: " + this.nombre + ", elemento: " + 
				this.elemento + ", puntos de salud: " + this.puntosSalud; 
	}

}
