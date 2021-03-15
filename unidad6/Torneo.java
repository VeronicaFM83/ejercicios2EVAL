package unidad6;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;


public class Torneo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Entrenador> arTrainer = new ArrayList<>();
		Scanner input = new Scanner (System.in);
		String teclado = input.nextLine();
		
		while (!(teclado.equalsIgnoreCase("torneo"))){
			String [] tmpArray = teclado.split(" ");
			try {
				Entrenador trainer = new Entrenador(tmpArray[0]);
				Pokemon pokem = new Pokemon(tmpArray[1],tmpArray[2],Integer.parseInt(tmpArray[3]));
				//System.out.println(tmpArray[0]);
				//System.out.println(tmpArray[1] + ", " + tmpArray[2] + ", " + Integer.parseInt(tmpArray[3]));
				if (arTrainer.size() == 0) {
					trainer.setPokemon(pokem);
					arTrainer.add(trainer);	
					System.out.println("Se añade nuevo entrenador");
				} else {
					boolean existe = false;
					for (int i=0; i<arTrainer.size();i++) {
						if ( (arTrainer.get(i).getNombre()).equals(trainer.getNombre()) ) {
							arTrainer.get(i).setPokemon(pokem);
							System.out.println("Entrenador existente, se añade pokemon");
							existe = true;
							break;
						}
					}
					if (!existe) {
						trainer.setPokemon(pokem);
						arTrainer.add(trainer);	
						System.out.println("Se añade nuevo entrenador");
					}
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Fuera de array");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			teclado = input.nextLine();
		}
		teclado = input.nextLine();
		while (!(teclado.equalsIgnoreCase("fin"))){
			
			if (Arrays.asList(Pokemon.getListaElementos()).contains(teclado)) {
				for (Entrenador a: arTrainer) {
					//System.out.println("Busca elemento en: " + a);
					if (a.searchElemento(teclado)) {
						a.sumaInsignia(1);
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