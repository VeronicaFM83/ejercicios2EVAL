package unidad5;

public class Autor {
/*
	Definir una clase llamada Autor según las especificaciones siguientes:
		• Atributos de instancia:
		o nombre, de tipo String
		o email, de tipo String
		o género (para almacenar el género: masculino o femenino), de tipo String
		• Métodos de instancia:
		o constructor que inicialice el estado del objeto con los valores que reciba a través de sus
		parámetros formales.
		o Getters para obtener el nombre, el email y el género de una instancia de la clase.
		o Setter para cambiar el correo electrónico de las instancias de la clase.
		o Redefinir el método toString para que retorne una cadena que contenga una breve
		descripción del estado del objeto que lo invoca con el formato: "nombre_autor
		(género) email". Ejemplo:
		"Alberto Fernández (masculino) afernandez@mail.com"
		Escribir un programa que ponga a prueba la clase Autor utilizando todos sus constructores y métodos.
*/
	
	// ATRIBUTOS
	
	private String nombre, email, genero;
	
	// METODOS
	
	// Constructor
	
	public Autor(String nombre, String email, String genero) {
		this.nombre = nombre;
		this.email = email;
		this.genero = genero;
	}
	
	// Getters
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	// Setters
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return (this.nombre + " (" + this.genero + ") " + this.email);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor autor1 = new Autor("Paco","paco@gmail.com","masculino");
		System.out.println(autor1);
		autor1.setEmail("paco2@gmail.com");
		System.out.println(autor1.getNombre());
		System.out.println(autor1.getGenero());
		System.out.println(autor1.getEmail());
	}
}
