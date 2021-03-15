package unidad5;

public class Automovil {
	
	/**
	 * Definir una clase Automovil según las especificaciones siguientes:
		• Cada objeto Automovil permitirá llevar el control del combustible que consume en los trayectos
		que realiza.
		• Los atributos con los que se describe el estado de cada objeto Automovil son:
		o Modelo.
		o Capacidad del depósito de combustible en litros.
		o Cantidad de combustible en el depósito en litros.
		o Consumo por kilómetro en litros.
		o Cantidad total de kilómetros recorridos.
		o Cantidad total de combustible consumido.
	 */
	
	// ATRIBUTOS
	public String modelo;
	private int capacidad;
	private float combustible;
	private float consumo;
	private float kmTotales;
	private float consumoTotal;

	// METODOS
	/** Constructores
		o Uno que inicialice mediante sus parámetros los atributos modelo, capacidad del depósito,
		cantidad inicial de litros en el depósito y consumo. El resto de atributos tendrán el valor 0.
		o Uno que inicialice mediante sus parámetros los atributos modelo, capacidad del depósito y
		consumo. La cantidad de combustible en el depósito se inicializará con el valor máximo y el
		resto de atributos con el valor 0
	*/
	
	public Automovil(String modelo, int capacidad, float combustible, float consumo) {
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.consumo = consumo;
		if (combustible>capacidad) {
			this.combustible = capacidad;
		} else {
			this.combustible = combustible;
		}
		this.kmTotales = 0;
		this.consumoTotal = 0;
	}
	
	public Automovil(String modelo, int capacidad, float consumo) {
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.combustible = capacidad;
		this.consumo = consumo;
		this.kmTotales = 0;
		this.consumoTotal = 0;
	}
	
	/**
	 * Método llenarDeposito. Este método estará sobrecargado:
		o Una versión que llene el depósito hasta el límite.
		o Otra que llene el depósito con una cantidad de litros específica. Si se excede la capacidad del
		depósito, se llenará el depósito retornando la cantidad de combustible sobrante.
	*/
	
	public String llenarDeposito() {
		this.combustible = this.capacidad;
		return "Combustible llenado al máximo: " + this.combustible;
	}
	
	public String llenarDeposito(int litros) {
		String msg = "";
		if ((this.combustible + litros)>this.capacidad) {
			msg = "Combustible llenado al máximo. Sobran " + (this.combustible + litros - this.capacidad)  + " litros.";
			this.combustible = this.capacidad;		
		} else {
			msg = "Combustible llenado hasta " + (this.combustible + litros) + " litros.";
		}
		this.combustible =+ litros; 
		return msg;
	}
	
	/**
	 Método desplazar que reciba la cantidad de kilómetros que ha de recorrer el automóvil. Este
	método comprobará si es posible el desplazamiento con el combustible que hay en el depósito. Si
	es posible, descontará del depósito el combustible que corresponda y retornará dicha cantidad. Si
	no es posible tendrá que ponerlo de manifiesto de alguna forma.
	*/
	
	public String desplazar(int km) {
		String msg = "";
		float litrosDesp = km * this.consumo / 100; // Calculo el gasto en litros del desplazamiento. P.e.: 20 km * 6 L/100 km = 1,20 L
		if (this.combustible >= litrosDesp) { // Si el consumo es igual o inferior al combustible en deposito
			this.kmTotales += km; // Actualizo Km recorridos
			this.consumoTotal += litrosDesp; // Actualizo consumo
			this.combustible -= litrosDesp; // Actualizo deposito
			msg = "Desplazamiento de " + km + " Kms. Total Km: " + this.kmTotales +". Combustible: " + this.combustible;
		} else {
			float maxKm = this.combustible / this.consumo * 100;
			msg = "Vehículo sin combustible suficiente. Máximo: " + maxKm;
		}
		return msg;
	}
	
	// Get
	
	public float getKm() {
		return this.kmTotales;
	}
	
	// Set
	
	public void setConsumo(int litros) {
		this.consumo = litros;
	}
	
	// toString
	@Override
	public String toString() {
		return "Vehículo modelo " + this.modelo + ". Características:\n- Capacidad deposito: " + this.capacidad + "\n- Consumo: " 
				+ this.consumo + "L a los 100Km\n- Combustible actual: " + this.combustible + "L\n- Total Km: " + this.kmTotales + 
				"Km\n- Total litros consumidos: " + this.consumoTotal + "\n";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil coche= new Automovil("Ford Ka",40,7);
		System.out.println(coche);
		System.out.println(coche.desplazar(25));
		System.out.println(coche.desplazar(33));
		System.out.println(coche.desplazar(100));
		System.out.println(coche.llenarDeposito(10));
		System.out.println("Distancia recorrida: " + coche.getKm() + "Km");
	}
}
