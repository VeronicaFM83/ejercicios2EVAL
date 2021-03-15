package unidad6;

public class Animal {
	//atributos
	private String nombre;
	private int edad;
		
	//constructor
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
		
	//metodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String nace() {
		return "Hola mundo, he nacido";
	}
	
	

}
