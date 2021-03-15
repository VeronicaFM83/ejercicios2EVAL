package u6_biblioteca;

public class Revista extends Publicacion {
	//atributos subclase
	private Integer numero, mes, dia;
	private final boolean en_prestamo = false;
	
	//constructores
	public Revista(String titulo, Integer anio) {
		super(titulo, anio);	
	}
	
	public Revista(String titulo, Integer anio, Integer numero, Integer mes, Integer dia) {
		super(titulo, anio);
		this.numero = numero;
		this.mes = mes;
		this.dia = dia;
	}
	
	//getters y setters
	private Integer getNumero() {
		return numero;
	}

	private void setNumero(Integer numero) {
		this.numero = numero;
	}

	private Integer getMes() {
		return mes;
	}

	private void setMes(Integer mes) {
		this.mes = mes;
	}

	private Integer getDia() {
		return dia;
	}

	private void setDia(Integer dia) {
		this.dia = dia;
	}

	//toString
	@Override
	public String toString() {
		return super.toString() + " - Nº : " + this.numero + " - Fecha publicación: " + this.dia + "/" + this.mes + "/" + this.anio; 
	}
}
