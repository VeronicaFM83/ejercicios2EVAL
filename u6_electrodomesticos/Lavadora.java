package u6_electrodomesticos;

public class Lavadora extends Electrodomestico {
	//atributos de clase
	static final int[] cargaValores = {4, 5, 6, 7, 8, 10, 11, 13};
	
	//atributos
	private int carga = 5;
	
	//constructores
	public Lavadora(int carga) {
		super();
		this.precio_final = Math.round((precio_final*coefCarga(carga))*100.0)/100.0;
		this.carga = carga;
	}
	
	public Lavadora(double precio_base, colores color, double peso, String eficiencia, double precio_final, int carga) {
		super(precio_base, color, peso, eficiencia, precio_final);
		this.precio_final = Math.round((precio_final*coefCarga(carga))*100.0)/100.0;
		this.carga = carga;
	}

	//toString
		@Override
		public String toString() {
			return "Lavadora: precio_base=" + precio_base + ", color=" + color + ", eficiencia=" + eficiencia + ", precio_final=" + precio_final + ", carga= " + carga + "Kg";
		}
		
	//metodo
	private double coefCarga(int carga) {
		if (carga > 8)
			return 1.1;
		else 
			return 1;
	}
	
}
