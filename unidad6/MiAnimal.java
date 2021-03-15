package unidad6;

import java.util.Scanner;

public class MiAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("NUEVO ANIMAL\n¿Nombre?");
		String nombre = input.nextLine();
		System.out.println("\n¿Edad?");
		int edad = Integer.parseInt(input.nextLine());
		Animal nuevoAnimal = new Animal(nombre,edad);
		System.out.println(nuevoAnimal.nace() + "\n");
		System.out.println("Me llamo " + nuevoAnimal.getNombre() + " y tengo " + nuevoAnimal.getEdad() + " años.");
	}

}
