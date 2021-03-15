package unidad5;

import java.util.Arrays;
import java.util.Random;

public class Naipe {
	
	/*
	 * Definir la clase Naipe para poder representar naipes de la baraja inglesa según las especificaciones
	siguientes:
		• Cada naipe pertenece a un palo: tréboles, diamantes, corazones o picas. 
		• Cada naipe tiene un rango que se corresponde con un número del 2 al 10 o con una de las figuras
		Ace (A), Jack (J), Queen (Q) o King (K).
		• Cada naipe podrá tener un valor numérico asociado a cada rango que podrá variar en función de
		los diferentes juegos de naipes.
	*/
	
	// ATRIBUTOS
	
	private String palo, rango;
	private int valor;
	private String [] palosArray = {"TREBOLES","DIAMANTES","CORAZONES","PICAS"};
	private String [] rangosArray = {"2","3","4","5","6","7","8","9","10","A","J","Q","K"};
	private int [] valoresArray = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	
	// METODOS
	// Constructor
	
	public Naipe() {
		Random r = new Random();
		int posPalo = r.nextInt(4); // número random entre 0 y 3
		int posRango = r.nextInt(13); // número random entre 0 y 12
		this.palo = this.palosArray[posPalo];
		this.rango = this.rangosArray[posRango];
		this.valor = this.valoresArray[posRango];
	}

	// toString
	@Override
	public String toString() {
		return "Naipe: " + this.rango + " de " + this.palo +". Valor: " + this.valor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Comienza el juego. Se reparten cartas.");
		System.out.println("\nLas cartas del jugador uno son:");
		Naipe [] jugador1 = juego();
		int mayorJugador1 = evaluarCartas(jugador1);
		System.out.println("Carta mayor: " + mayorJugador1);
		System.out.println("\nLas cartas del jugador dos son:");
		Naipe [] jugador2 = juego();
		int mayorJugador2 = evaluarCartas(jugador2);
		System.out.println("Carta mayor: " + mayorJugador2);
		System.out.println("\nLa mayor puntuación es " + Math.max(mayorJugador1,mayorJugador2));
	}
		
		// PROBANDO COSAS
		
		public static int evaluarCartas(Naipe[] jugador) {
			int valorMayor = 0;
			for (int i=0; i<5; i++) {
				if (jugador[i].valor>valorMayor) {
					valorMayor=jugador[i].valor;
				}
			}
			return valorMayor;
			
			/**
			 * Intenté evaluar las cartas en función de las reglas de poker: pareja, trio, doble pareja, porker, escalera....
			 * -- INCOMPLETO --
			 **/
			/*
			int valorJuego = new int[5]; // Array con los valores de las cartas 
			
			String [] tmpJugada = new String[5]; // Array que describe la jugada
			int [] cartasEvaluadas = new int[5]; // Array que guarda las cartas evaluadas
			//int [] testBuscar = {14,10,7,11,3}; 
			
			
			for (int i=0; i<5; i++) {
				//System.out.println("BUCLE " + jugador[i].valor);
				//int prueba = jugador[i].valor;
						//System.out.println("BUSCAR " + buscar(testBuscar,prueba));
				boolean comprueba = true;
				do {	
					if (i>0 && (buscar(cartasEvaluadas,jugador[i].valor))){
					System.out.println("SI " + jugador[i].valor);
						if ( i<4) {
							i++;
						} else {
							System.out.println("SI, ULTIMO" + jugador[i].valor);
							jugador[i].valor=0;
						}
					} else {
						comprueba = false;
					}
				} while (comprueba);
				Naipe test = jugador[i];
				int contador = 0;
				int tmpValor = 0;
				
				for (int j=1; j<5;j++) {
					if (jugador[i].valor == jugador[j].valor) {
						contador++;
						tmpValor = jugador[i].valor;
						
					} 
				}
				if (contador==2) {
					tmpJugada[i] = "Pareja de " + jugador[i].rango;
					valorJuego[i] = jugador[i].valor*2+1;
				} else if (contador==3) {
					tmpJugada[i] = "Trío de " + jugador[i].rango;
					valorJuego[i] = jugador[i].valor*3+2;
				} else if (contador==4) {
					tmpJugada[i] = "Poker de " + jugador[i].rango;
					valorJuego[i] = jugador[i].valor*4+3;
				} else {
					tmpJugada[i] = "";
					valorJuego[i] = jugador[i].valor;
				}
				cartasEvaluadas[i] = jugador[i].valor;
				System.out.println(Arrays.toString(cartasEvaluadas));
	
			}
			System.out.println(Arrays.toString(tmpJugada));
			System.out.println(Arrays.toString(valorJuego));
			System.out.println(valorJuego.length);
			System.out.println(suma(valorJuego));
			*/
	}
	
	public static Naipe[] juego() {
		Naipe [] juego = new Naipe[5];
		for (int i=0; i<5; i++) {
			Naipe a = new Naipe();
			juego[i] = a;
			System.out.println(a.toString());
		}
		return juego;
	}
	
	public static int suma(int[] valorJuego){
        try{
        int suma=0;
        for (int i = 0; i < valorJuego.length; i++) {
            suma+=valorJuego[i];
        }
        return suma;
        }catch(ArrayIndexOutOfBoundsException ex){
        return 0;
        }
    }
	
	public static boolean buscar(int[] array, int valor) {
		//System.out.println("BUSCAR en Array: " + Arrays.toString(array));
		//System.out.println(" BUSCAR el Valor: " + valor);
		for (int x = 0; x < array.length; x++) {
		    if (array[x] == valor) {
		      return true;
		    }
		  }
		  return false;
		}

}
