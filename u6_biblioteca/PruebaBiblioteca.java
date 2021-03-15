package u6_biblioteca;

import java.util.ArrayList;

public class PruebaBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Publicacion> publicaciones = new ArrayList<>();
		
		publicaciones.add(new Publicacion("TítuloPublicacion", 1983));
		publicaciones.add(new Revista("TítuloRevista", 1995, 7457, 11, 06));
		String autores[] = {"Nombre1 Apellido1", "Nombre2 Apellido2"};
		publicaciones.add(new Libro("TítuloLibro", 2015, autores));
		publicaciones.add(new Revista("TítuloRevista2", 2020, 6554, 9, 12));
		
		for (Publicacion x: publicaciones) {
			System.out.println(x.toString());
		}
		
		Libro tmpLibro = (Libro) publicaciones.get(2);
		tmpLibro.setEn_prestamo(true);
		System.out.println(tmpLibro.isEn_prestamo());

	}
}
