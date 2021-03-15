package u6_electrodomesticos;

public class Frigorifico extends Electrodomestico {
	//atributos
	private boolean noFrost = false;
	
	//constructor
	public Frigorifico(boolean noFrost) {
		super();
		this.noFrost = noFrost;
	}

	public Frigorifico(double precio_base, colores color, double peso, String eficiencia, double precio_final,
			boolean noFrost) {
		super(precio_base, color, peso, eficiencia, precio_final);
		this.noFrost = noFrost;
	}

	protected boolean isNoFrost() {
		return noFrost;
	}

	protected void setNoFrost(boolean noFrost) {
		this.noFrost = noFrost;
	}
	
	//toString
	@Override
	public String toString() {
		return "Frigorifico: precio_base=" + precio_base + ", color=" + color + ", eficiencia=" + eficiencia + ", no frost=" + noFrost + ", precio_final=" + precio_final;
	}
		
}
