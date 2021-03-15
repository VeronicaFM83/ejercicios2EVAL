package unidad5;

import java.time.LocalDate;
import java.util.Scanner;

public class Animal {
	// atributos 
	private String nombre;
	private LocalDate fecha;
	
	// métodos 
	
	// constructor
	// opc1: se pasan los dos parámetros
	public Animal(String nombre, LocalDate fecha) { // LocalDate se declara con LocalDate.parse("aaaa-mm-dd") o LocalDate.of(aaaa,mm,dd)
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	// opc2: solo se pasa nombre
	public Animal(String nombre) {
		this.nombre = nombre;
		fecha = LocalDate.now();
	}
	
	// getter
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	// setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = LocalDate.parse(fecha);
	}
	
	// toString
	@Override
	public String toString() {
		return "Animal: Nombre=" + nombre + " - Fecha=" + fecha; 
	}
	
	/**
	 * EJECUCIÓN
	 * @param args
	 */
	
	public static void main(String[] args) {
		Animal animal1 = new Animal("Tuko",LocalDate.parse("2016-02-06")); // Crea obj con constructor. LocalDate se declara con LocalDate.parse("aaaa-mm-dd") o LocalDate.of(aaaa,mm,dd)
		Animal animal2 = new Animal("Tikaa"); // Crea obj con constructor solo con nombre
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("Dar de alta animal:\n¿Nombre?");
		Animal animal3 = new Animal(input.nextLine()); // Se crea obj con constructor solo con nombre
		System.out.println("¿Fecha nacimiento? (aaaa-mm-dd)");
		animal3.setFecha(input.nextLine()); // Setea fecha
		
		System.out.println("Lista de animales:");
		System.out.println(animal1);
		System.out.println(animal2);
		System.out.println(animal3);
		
		System.out.println("Corregir nombre de "+ animal2.nombre); // Modifica nombre
		animal2.setNombre(input.nextLine());
		System.out.println("Nombre modificado: "+ animal2.getNombre()); // Devuelve nombre
		System.out.println("¿Fecha nacimiento "+ animal2.nombre + "? (aaaa-mm-dd)"); // Setea fecha
		animal2.setFecha(input.nextLine());
		System.out.println("Fecha establecida: "+ animal2.getFecha()); // Devuelve fecha
		
		System.out.println(animal2); // Devuelve toString
		
		input.close();
	}
}


