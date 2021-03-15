package unidad5;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;


public class Torneo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Entrenador> arTrainer = new ArrayList<>();
		
		//CODIGO PRUEBAS - FUNCIONA OK
		/* 
		Entrenador trainer1 = new Entrenador("Ash");
		Pokemon pokem11 = new Pokemon("Charizard","fuego",100);
		trainer1.setPokemon(pokem11);
		Pokemon pokem12 = new Pokemon("Pikachu","electricidad",10);
		trainer1.setPokemon(pokem12);
		arTrainer.add(trainer1);
		
		Entrenador trainer2 = new Entrenador("Brock");
		Pokemon pokem21 = new Pokemon("Squirtle","agua",38);
		trainer2.setPokemon(pokem21);
		arTrainer.add(trainer2);
		
		for (Entrenador a: arTrainer) {
			System.out.println(a.getInsignias() + " " + a.cuentaPokemons());
		}
		
		String teclado = "agua";
		while (!(teclado.equals("fin"))){
			//List <String> alElementos = Arrays.asList(Pokemon.listaElementos);
			//if (alElementos(Pokemon.listaElementos).contains(teclado)) {
			if (Arrays.asList(Pokemon.listaElementos).contains(teclado)) {
				for (Entrenador a: arTrainer) {
					System.out.println("Busca elemento en: " + a);
					if (a.searchElemento(teclado)) {
						System.out.println("EXITO. Se añade insignia");
					} else {
						System.out.println("ELIMINAR 10 PUNTOS");
						a.pierdeRonda();
					}
				}		
			} else {
				System.out.println("Error al introducir elemento");
			}
			teclado = "fin";
		}
		System.out.println("RESULTADOS");
		for (Entrenador a: arTrainer) {
			System.out.println(a.getInsignias() + " " + a.cuentaPokemons());
		}
		// FIN CODIGO PRUEBAS
		*/
		
		
		Scanner input = new Scanner (System.in);
		
		String teclado = input.nextLine();
		
		while (!(teclado.equals("torneo"))){
			ArrayList<Entrenador> listaCopiada = new ArrayList<Entrenador>(arTrainer);
			String [] tmpArray = teclado.split(" ");
			Entrenador trainer = new Entrenador(tmpArray[0]);
			Pokemon pokem = new Pokemon(tmpArray[1],tmpArray[2],Integer.parseInt(tmpArray[3]));
			//System.out.println(listaCopiada);
			boolean existe = false;
			for (int i=0; i<listaCopiada.size();i++) {
				if (listaCopiada.get(i).nombre.equals(trainer.nombre)) { // si existe en ArrayList se añade solo el pokemon
					//System.out.println("SÍ existe entrenador");
					arTrainer.get(i).setPokemon(pokem);
					existe = true;
					break;
				} else { 
					//System.out.println("NO existe entrenador");
				}
			}
			if (!existe) {
				trainer.setPokemon(pokem);
				arTrainer.add(trainer);		
			}
			
			//System.out.println(arTrainer);
			listaCopiada = arTrainer;
			teclado = input.nextLine();
		}
		teclado = input.nextLine();
		while (!(teclado.equals("fin"))){
			if (Arrays.asList(Pokemon.listaElementos).contains(teclado)) {
				for (Entrenador a: arTrainer) {
					//System.out.println("Busca elemento en: " + a);
					if (a.searchElemento(teclado)) {
						//System.out.println("EXITO. Se añade insignia");
					} else {
						//System.out.println("ELIMINAR 10 PUNTOS");
						a.pierdeRonda();
					}
				}		
			} else {
				System.out.println("Error al introducir elemento");
			}
			teclado = input.nextLine();
		}
		
		System.out.println("RESULTADOS");
		for (Entrenador a: arTrainer) {
			System.out.println(a.getInsignias() + " " + a.cuentaPokemons());
		}
		input.close();
	}
}