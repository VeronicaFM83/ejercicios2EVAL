package pruebas;

import java.util.ArrayList;
import java.util.Iterator;



public class pruebaArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<>();
		lista1.add("Hola");
		lista1.add("Adios");
		ArrayList<Integer> lista2 = new ArrayList<>(20);
		
		
		lista1.add(1,"eh!");
		ArrayList<String> lista3 = new ArrayList<>(lista1);
		lista1.set(0,"prueba");
		lista1.remove(1);
		
		System.out.println(lista1);
		System.out.println(lista2);
		System.out.println(lista3);
		lista3.removeAll(lista1);
		System.out.println(lista3);
		lista3.remove("Hola");
		System.out.println(lista3);
		System.out.println(lista1.get(0));
		lista1.add("Adios");
		System.out.println(lista1.indexOf("Adios"));
		System.out.println(lista1.lastIndexOf("Adios"));
		
		// iterar un arraylist
		// modo 1
		/*
		Iterator<String> i = lista1.iterator();
		while (i.hasNext()){
		 System.out.println(i.next());
		}
		*/
		// modo 2
		//lista1.forEach(elemento -> System.out.println(elemento));
		
		// modo 3: bucle for (String x: lista1) 
		
		System.out.println(lista1);
		// modificar un arraylist mientras se itera
		Iterator<String> x = lista1.iterator();
		while(x.hasNext()) {
			String str = x.next();
			//if (str.toLowerCase().charAt(0) == 'p') {
			str = str.substring(0,3);
			if (str.equalsIgnoreCase("pru")) {
				x.remove();
			} else {
				System.out.println(str);
			}
		}
		System.out.println(lista1);
	}
}
