package unidad5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaAutomovil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numAutos = 0;
		Scanner texto = new Scanner (System.in);
		Scanner num = new Scanner (System.in);
		String altaAuto, accion = "";
		String [] arAltaAuto = new String[4];
		//int indice1, indice2;
	
		System.out.println("Introduzca nº de automoviles");
		numAutos = num.nextInt();
		ArrayList<Automovil> arrayAutos = new ArrayList<>();
		for (int i=0 ; i<numAutos ; i++) {
			boolean repe = false;
			System.out.println("Introduzca <modelo> <capacidad del depósito> <litros en el depósito> <consumo>");
			altaAuto = texto.nextLine(); 
			// Analizo el texto introducido
			arAltaAuto = altaAuto.split(" ");
				
			/* ESTA SOLUCION ES VÁLIDA PERO MÁS COMPLEJA
			indice1 = altaAuto.indexOf(" ",0); // Busco el primer espacio
			arAltaAuto[0] = altaAuto.substring(0,indice1); // Guardo el modelo
			indice2 = altaAuto.indexOf(" ", indice1+1); // Busco el siguiente espacio
			arAltaAuto[1] = Integer.parseInt(altaAuto.substring(indice1+1,indice2)); // Guardo capacidad pasando a int
			indice1 = altaAuto.indexOf(" ", indice2+1); // Busco el siguiente espacio
			arAltaAuto[2] = Float.parseFloat(altaAuto.substring(indice2+1,indice1));
			arAltaAuto[3] = Float.parseFloat(altaAuto.substring(indice1+1,altaAuto.length()));
			*/
			for (Automovil auto: arrayAutos) {
				if (auto.modelo.equals(arAltaAuto[0])) {
					repe = true;
					System.out.println("¡Ese modelo ya existe!\n");
					continue;
				}
			}
			if (!repe) {
				// Creo el auto
				Automovil tmpAuto = new Automovil(arAltaAuto[0],Integer.parseInt(arAltaAuto[1]),Float.parseFloat(arAltaAuto[2]),Float.parseFloat(arAltaAuto[3]));
				arrayAutos.add(tmpAuto);
			}
		}
		// Desplazar
		accion = texto.nextLine();
		while (!(accion.equals("fin"))) {
			/*int coincide = accion.indexOf("desplazar");
			if (coincide!=-1) {*/
			try {
				String [] arAccion = accion.split(" ");
				for (Automovil auto: arrayAutos) {
					if (auto.modelo.equals(arAccion[1]) && arAccion[0].equalsIgnoreCase("desplazar")) {
						System.out.println(auto.desplazar(Integer.parseInt(arAccion[2])));
						continue;
					}
				}
			} catch(Exception e) {
			    System.out.println("ERROR");
			}
			accion = texto.nextLine();
		}
		for (Automovil auto: arrayAutos) {
			System.out.println("RESUMEN:\n" + auto);
		}
		num.close();
		texto.close();
	}
}
