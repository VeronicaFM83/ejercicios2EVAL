package pruebas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Animal {
	// atributos
	String nombre;
	LocalDate fecha;
	int edad;
	
	static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	// metodos
	
	public Animal(String nombre) {
		this.nombre = nombre;
		this.fecha = LocalDate.now();
		this.edad = getEdad();
	}
	public Animal(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.edad = getEdad();
	}
	
	public Animal(String nombre, String fecha) {
		this.nombre = nombre;
		this.fecha = LocalDate.parse(fecha, fmt);
		this.edad = getEdad();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return this.fecha.format(fmt);
	}
	
	public int getEdad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(this.fecha, hoy);
		this.edad = periodo.getYears();
		return this.edad;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = LocalDate.parse(fecha, fmt);
	}

	@Override
	public String toString() {
		return "Nombre: " + this.nombre + " - Fecha nac.: " + this.fecha.format(fmt) + " - Edad: " + this.edad; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal anim1 = new Animal("Bichin");
		System.out.println(anim1);
		Animal anim2 = new Animal("Tukon","06-02-2016");
		System.out.println(anim2);
		anim1.setFecha("01-01-2018");
		System.out.println(anim1.getFecha());
		System.out.println(anim1);
	}
}
