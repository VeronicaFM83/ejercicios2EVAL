package u6_biblioteca;

public class Publicacion {
	//atributos superclase
	protected static int id = 1;
	protected int codigo;
	protected String titulo;
	protected Integer anio;
	
	
	//constructor superclase
	public Publicacion(String titulo, Integer anio) {
		this.codigo = Publicacion.id++;
		this.titulo = titulo;
		this.anio = anio;
	}
	
	//getters y setters
	int getCodigo() {
		return codigo;
	}

	void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	String getTitulo() {
		return titulo;
	}

	void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	Integer getAnio() {
		return anio;
	}

	void setAnio(Integer anio) {
		this.anio = anio;
	}

	//toString
	@Override
	public String toString() {
		return "Publicacion [código=" + this.codigo + ", título=" + this.titulo + ", año=" + this.anio;
	}
}
