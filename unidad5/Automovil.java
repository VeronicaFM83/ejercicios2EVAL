package unidad5;

public class Automovil {
	
	/**
	 * Definir una clase Automovil seg�n las especificaciones siguientes:
		� Cada objeto Automovil permitir� llevar el control del combustible que consume en los trayectos
		que realiza.
		� Los atributos con los que se describe el estado de cada objeto Automovil son:
		o Modelo.
		o Capacidad del dep�sito de combustible en litros.
		o Cantidad de combustible en el dep�sito en litros.
		o Consumo por kil�metro en litros.
		o Cantidad total de kil�metros recorridos.
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
		o Uno que inicialice mediante sus par�metros los atributos modelo, capacidad del dep�sito,
		cantidad inicial de litros en el dep�sito y consumo. El resto de atributos tendr�n el valor 0.
		o Uno que inicialice mediante sus par�metros los atributos modelo, capacidad del dep�sito y
		consumo. La cantidad de combustible en el dep�sito se inicializar� con el valor m�ximo y el
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
	 * M�todo llenarDeposito. Este m�todo estar� sobrecargado:
		o Una versi�n que llene el dep�sito hasta el l�mite.
		o Otra que llene el dep�sito con una cantidad de litros espec�fica. Si se excede la capacidad del
		dep�sito, se llenar� el dep�sito retornando la cantidad de combustible sobrante.
	*/
	
	public String llenarDeposito() {
		this.combustible = this.capacidad;
		return "Combustible llenado al m�ximo: " + this.combustible;
	}
	
	public String llenarDeposito(int litros) {
		String msg = "";
		if ((this.combustible + litros)>this.capacidad) {
			msg = "Combustible llenado al m�ximo. Sobran " + (this.combustible + litros - this.capacidad)  + " litros.";
			this.combustible = this.capacidad;		
		} else {
			msg = "Combustible llenado hasta " + (this.combustible + litros) + " litros.";
		}
		this.combustible =+ litros; 
		return msg;
	}
	
	/**
	 M�todo desplazar que reciba la cantidad de kil�metros que ha de recorrer el autom�vil. Este
	m�todo comprobar� si es posible el desplazamiento con el combustible que hay en el dep�sito. Si
	es posible, descontar� del dep�sito el combustible que corresponda y retornar� dicha cantidad. Si
	no es posible tendr� que ponerlo de manifiesto de alguna forma.
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
			msg = "Veh�culo sin combustible suficiente. M�ximo: " + maxKm;
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
		return "Veh�culo modelo " + this.modelo + ". Caracter�sticas:\n- Capacidad deposito: " + this.capacidad + "\n- Consumo: " 
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
