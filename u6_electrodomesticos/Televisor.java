package u6_electrodomesticos;

public class Televisor extends Electrodomestico {
	//atributos clase
	private static final String[] sintonizadores = {"DVB-T", "DVB-T2"}; 
	
	//atributos
	private int pulgadas = 20;
	private String sintonizador = sintonizadores[0];
	
	//constructor
	public Televisor(double precio_base, colores color, double peso, String eficiencia, double precio_final,
			int pulgadas, String sintonizador) {
		super(precio_base, color, peso, eficiencia, precio_final);
		this.pulgadas = pulgadas;
		this.sintonizador = sintonizador;
	}
	
	public Televisor(int pulgadas) {
		super();
		this.pulgadas = pulgadas;
	}
	
	//toString
	@Override
	public String toString() {
		return "TV: precio_base=" + precio_base + ", color=" + color + ", eficiencia=" + eficiencia + ", pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + ", precio_final=" + precio_final;
	}
	
}
