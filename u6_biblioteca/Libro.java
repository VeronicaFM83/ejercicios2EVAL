package u6_biblioteca;

public class Libro extends Publicacion{
	//atributos subclase
	private String [] autores;
	protected boolean en_prestamo = false;
	
	//constructores
	public Libro(String titulo, Integer anio) {
		super(titulo, anio);	
	}
	
	public Libro(String titulo, Integer anio, String[] autores) {
		super(titulo, anio);
		this.autores = autores;
	}
	
	//getters y setters
	boolean isEn_prestamo() {
		return en_prestamo;
	}

	void setEn_prestamo(boolean en_prestamo) {
		this.en_prestamo = en_prestamo;
	}

	private String[] getAutores() {
		return autores;
	}

	private void setAutores(String[] autores) {
		this.autores = autores;
	}

	//toString
	@Override
	public String toString() {
		String str = super.toString() + " autores=";
		for (String x: autores) {
			str += x + ", ";
		}
		str = str.substring(0, (str.length()-2));
		str += ".";
		return str; 
	}
}
