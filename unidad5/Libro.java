package unidad5;

import java.util.Arrays;

public class Libro {
	/*
	Ejercicio 4: Libro
	Definir una clase llamada Libro según las especificaciones siguientes:
		• Atributos de instancia:
		o título, de tipo String
		o autores, de tipo Collection<Autor>
		o precio, de tipo float
		o stock, de tipo int
		• Métodos de instancia:
		o Constructor que inicialice el estado del objeto con los datos recibidos en los parámetros
		formales siguientes: título de tipo String, autores de tipo Collection<Autor> y
		precio de tipo float. El atributo stock se inicializará con el valor por defecto.
		o Constructor que inicialice todos los atributos con datos recibidos a través de parámetros
		formales.
		o Getters
		o Setters para los atributos precio y stock.
		o Redefinir el método toString para que retorne información con el formato:
		"título_libro (autor1, autor2, …) precio € - stock unidades en stock"
		Escribir un programa que ponga a prueba la clase Libro utilizando todos sus constructores y métodos.
	*/
	
	// ATRIBUTOS
	private String titulo;
	private float precio;
	private int stock;
	private String[] autoresArray;
	
	// METODOS
	// Constructor
	public Libro(String titulo, String[] autoresArray, float precio, int stock) {
		this.titulo = titulo;
		this.autoresArray = autoresArray;
		this.precio = precio;
		this.stock = stock;
	}
	
	// Getters
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutores() {
		return Arrays.toString(this.autoresArray);
	}
	
	
	public float getPrecio() {
		return this.precio;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	// Setters
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	// toString
	@Override
	public String toString() {
		return (this.titulo + " - " + Arrays.toString(this.autoresArray) + " - " + this.precio + "€ - " + stock + " unidades en stock");
	}
	
	// EJECUCIÓN
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String miArray[] = {"Varios autores"};
		Libro libro1 = new Libro("Cuentos de cuna",miArray,(float)10.50,5);
		System.out.println(libro1);
		String miArray2[] = {"Karlos Arguiñano", "Eva Arguiñano"};
		Libro libro2 = new Libro("Recetas de cocina",miArray2,(float)14,8);
		System.out.println(libro2);
		
		libro1.setPrecio((float) 8.50);
		System.out.println(libro1.getPrecio());
		libro2.setStock(7);
		System.out.println(libro2.getStock());
		System.out.println(libro2.getAutores());
		System.out.println(libro1.getTitulo());

	}

}
