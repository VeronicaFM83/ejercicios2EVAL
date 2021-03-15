package unidad6;

enum TipoCoche {SIN_CARNET,UTILITARIO,FAMILIAR,DEPORTIVO};
enum TipoSeguro {A_TERCEROS, A_TODO_RIESGO}

public class Coche {
	//atributos
	private String marca, modelo, color, matricula;
	private boolean pintura_metalizada;
	private int anyo_fabricacion;
	private TipoCoche tipo_coche;
	private TipoSeguro tipo_seguro;

	
	// constructor
	public Coche(String matricula) {
		this.matricula = matricula;
	}
	
	public Coche(String marca, String modelo, String color, String matricula, TipoSeguro seguro) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
		this.tipo_seguro = seguro;
	}
	
	public Coche (String marca, String modelo, String color, String matricula, TipoSeguro seguro, TipoCoche tipo) {
		this(marca, modelo, color, matricula, seguro);
		this.setTipo_coche(tipo);
	}
	
	// metodos
	public void setTipo_coche(TipoCoche tipo) {
		this.tipo_coche = tipo;
	}
	
	public void setTipo_seguro(TipoSeguro seguro) {
		this.tipo_seguro = seguro;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPintura_metalizada() {
		return pintura_metalizada;
	}
	public void setPintura_metalizada(boolean pintura_metalizada) {
		this.pintura_metalizada = pintura_metalizada;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getAnyo_fabricacion() {
		return anyo_fabricacion;
	}
	public void setAnyo_fabricacion(int anyo_fabricacion) {
		this.anyo_fabricacion = anyo_fabricacion;
	}
	
	public String imprimeCoche() {
		return "Tiene un corche marca " + this.marca + ", modelo " + this.modelo + " de color " + this.color + ".";
	}

	
	
	
	
}
