package u6_electrodomesticos;

import java.util.ArrayList;

public class Electrodomestico {
	//atributos de clase
	static final String tabla_consumo[][] = {{"A","30"},{"B","25"},{"C","20"},{"D","15"},{"E","10"},{"F","5"}};
	static final double tabla_peso[][] = {{0,19,5},{20,46,10},{50,79,15},{80,999,20}};
	static enum colores {BLANCO, NEGRO, ROJO, AZUL, GRIS};
	
	// atributos
	
	protected double precio_base = 100;
	protected colores color = colores.BLANCO;
	protected double peso = tabla_peso[0][2];
	protected String eficiencia = tabla_consumo[5][0];
	protected double precio_final = Math.round((precio_base+(precio_base*coefConsumo(eficiencia)/100)+(precio_base*coefPeso(peso)/100))*100.0)/100.0;
	

	//constructores
	
	public Electrodomestico() {	}

	public Electrodomestico(double precio_base, double peso) {
		this.precio_base = precio_base;
		this.peso = peso;
	}
	
	public Electrodomestico(double precio_base, colores color, double peso, String eficiencia, double precio_final) {
		this.precio_base = precio_base;
		this.color = color;
		this.peso = peso;
		this.eficiencia = eficiencia;
		this.precio_final = precio_final;
	}

	public Electrodomestico(double precio, colores color) {
		this.precio_base = precio;
		this.color = color;
	}
	
	//getters y setters
	
	protected double getPrecio_base() {
		return precio_base;
	}

	protected void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}

	protected colores getColor() {
		return color;
	}

	protected void setColor(colores color) {
		this.color = color;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	protected String getEficiencia() {
		return eficiencia;
	}

	protected void setEficiencia(String eficiencia) {
		this.eficiencia = eficiencia;
	}

	protected double getPrecio_final() {
		return precio_final;
	}

	protected void setPrecio_final(double precio_final) {
		this.precio_final = precio_final;
	}

	//toString
	@Override
	public String toString() {
		return "Electrodomestico: precio_base=" + precio_base + ", color=" + color + ", eficiencia=" + eficiencia + ", precio_final=" + precio_final;
	}

	//metodos
	
	protected int coefConsumo(String valor) {
		int porcentaje;
		try {
			for (String[] x: tabla_consumo) {
				if (x[0].equalsIgnoreCase(valor)) {
					porcentaje = Integer.parseInt(x[1]);
					return porcentaje;
				}
				
			}
		} catch (Exception e) {
			System.err.println("Error al aplicar porcentaje consumo" + e.toString());
		}
		porcentaje = -1;
		return porcentaje;
	}

	protected double coefPeso(double valor) {
		double porcentaje;
		try {
			for (double[] x: tabla_peso) {
				if (valor > x[0] && valor < x[1]) {
					porcentaje = x[2];
					return porcentaje;
				}
			}
		} catch (Exception e) {
			System.err.println("Error al aplicar porcentaje peso" + e.toString());
		}
		porcentaje = -1;
		return porcentaje;
	}
}
