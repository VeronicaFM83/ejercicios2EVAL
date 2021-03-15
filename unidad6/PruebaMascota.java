package unidad6;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaMascota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa: MASCOTA");
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
	}
	
	
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

}
