package pruebas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Animal {
	// atributos
	String nombre;
	LocalDate fecha;
	int edad;
	
	// metodos

	public Animal(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.edad = getEdad();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
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
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fecha = LocalDate.parse(fecha, fmt);
	}

	@Override
	public String toString() {
		return "Nombre: " + this.nombre + " - Fecha: " + this.fecha; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
