package u6_electrodomesticos;

import java.util.ArrayList;

public class pruebaElec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
		
		Electrodomestico nuevoElec = new Electrodomestico();
		System.out.println(nuevoElec.toString());
		Lavadora nuevoLava = new Lavadora(9);
		System.out.println(nuevoLava.toString());
		Frigorifico nuevoFrigo = new Frigorifico(true);
		System.out.println(nuevoFrigo.toString());
		Televisor nuevoTv = new Televisor(32);
		System.out.println(nuevoTv.toString());
		electrodomesticos.add(nuevoElec);
		electrodomesticos.add(nuevoTv);
		electrodomesticos.remove(nuevoElec);
	}
}
