package unidad6;

import java.util.ArrayList;
import java.util.Scanner;

public class Mascota {
	
	//atributos
	private String nombre;
	private Integer energia = 40;
	private boolean vivo = true;
	private boolean enferma = false;
	
	//constructor
	public Mascota(String nombre) {
		this.nombre = nombre;
	}
	
	//metodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws Exception {
		this.isVivo();
		this.nombre = nombre;
	}

	public Integer getEnergia() throws Exception {
		try {
			this.isVivo();
		} catch (Exception e) {
			System.err.println("getEnergia: " + e.getMessage());
		}
		return this.energia;
	}

	private boolean isVivo() throws Exception {
		if (this.vivo)
			return vivo;
		else
			throw new Exception("isVivo: La mascota no existe");	
	}

	private void setVivo(boolean vivo) throws Exception {
		this.isVivo();
		this.vivo = vivo;
	}

	public void setEnergia(int energia) throws Exception {
		this.isVivo();
		this.energia = energia;
	}
	
	private boolean isEnferma() {
		return enferma;
	}

	private void setEnferma(boolean enferma) {
		this.enferma = enferma;
	}

	public void comprueba() throws Exception {
		this.isVivo();
		if (this.energia > 55 || this.energia < 0) {
			this.setVivo(false);
			this.energia = null;
			this.nombre = null;
			throw new Exception("La mascota muere");
		}
		if (this.energia > 50 || (this.energia < 5 && this.energia > 0)) {
			this.setEnferma(true);
			throw new Exception("La mascota está enferma");
		}	
	}
	
	private void aleatorio() {
		int n = (int) Math.round(Math.random()*10);
		if (n < 4)
			this.energia -= 10;
	}
	
	public void come(){	
		try {
			this.isVivo();
			this.energia += 5;
			aleatorio();
			comprueba();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void duerme() {
		try {
			this.isVivo();
			this.energia += 2;
			comprueba();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void ejercita() {
		try {
			this.isVivo();
			this.energia -= 3;
			comprueba();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void cura(){	
		try {
			this.isVivo();
			if (this.enferma)
				this.energia = 20;
				this.enferma = false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	public String feedback() {
		if (this.enferma) {
			return "Buu... snif =Y.Y=";
		} else if (this.energia>8 && this.energia < 47) {
			return "Rrrrrr =^.^=";
		} else {
			return "Ñee =>.<=";
		}
	}
	
	@Override
	public String toString() {
		return this.nombre + " tiene " + this.energia + " puntos de energía. Enferma: " + this.enferma;
	}
	
	/* ---- ESTO LO PASO A LA CLASE PruebaMascota ----
	public static void comando(String cmd, String nombre, ArrayList<Mascota> mascotas) {
		try {
			cmd = cmd.toLowerCase();
			switch (cmd) {
				case "crear":
					Mascota nuevaMascota = new Mascota(nombre);
					mascotas.add(nuevaMascota);
					System.out.println("Creada mascota: " + mascotas.get(mascotas.size()-1).getNombre());
					break;
				case "comer":
					encuentra(nombre,mascotas).come();
					//System.out.println(encuentra(nombre,mascotas));
					System.out.println(encuentra(nombre,mascotas).feedback());
					break;
				case "ejercicio":
					encuentra(nombre,mascotas).ejercita();
					//System.out.println(encuentra(nombre,mascotas));
					System.out.println(encuentra(nombre,mascotas).feedback());
					break;
				case "dormir":
					encuentra(nombre,mascotas).duerme();
					//System.out.println(encuentra(nombre,mascotas));
					System.out.println(encuentra(nombre,mascotas).feedback());
					break;
				case "curar":
					encuentra(nombre,mascotas).cura();
					//System.out.println(encuentra(nombre,mascotas));
					System.out.println(encuentra(nombre,mascotas).feedback());
					break;
				case "salir":
					break;
				default:
					throw new Exception("Comando no válido");	
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static Mascota encuentra(String nombre, ArrayList<Mascota> mascotas) throws Exception {
		Mascota localizada = null;
		for(Mascota x: mascotas) {
			if (x.getNombre() != null)
				if (x.getNombre().equalsIgnoreCase(nombre))
					localizada = x;
		}
		if (localizada == null)
			throw new Exception("No existe la mascota");	
		return localizada;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
		Scanner in = new Scanner(System.in);	
		String teclado = in.nextLine();
		
		while (!teclado.equalsIgnoreCase("salir")) {
			String palabras[] = teclado.split(" "); 
			try {
				comando(palabras[0], palabras[1], mascotas);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Comando incorrecto");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			teclado = in.nextLine();
		}
		for(Mascota x: mascotas) {
			System.out.println(x);
		}
		in.close();
	} */
}
