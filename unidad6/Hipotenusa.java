package unidad6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hipotenusa {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int catetoA = 0;
		int catetoB = 0;
		double hipotenusa;
		String teclado = "";
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (!(teclado.equals("F"))) {
			System.out.println("> ");
			teclado = in.readLine().toUpperCase();
			String letra = teclado.substring(0,1);
			//System.out.println(letra);
			switch (letra) {
				case "A":
					try {
						catetoA = Integer.parseInt(teclado.substring(1).trim());
						if (catetoA<=0)
							throw new IllegalArgumentException();
						//System.out.println(catetoA);
					} catch (NumberFormatException e) {
						System.err.println("Por favor, indique un número válido");
					} catch (IllegalArgumentException e){
						System.err.println("Debe ser un número mayor que 0");
					}
					break;
				case "B":
					try {
						catetoB = Integer.parseInt(teclado.substring(1).trim());
						if (catetoB<=0)
							throw new IllegalArgumentException();
						//System.out.println(catetoB);
					} catch (NumberFormatException e) {
						System.err.println("Por favor, indique un número válido");
					} catch (IllegalArgumentException e){
						System.err.println("Debe ser un número mayor que 0");
					}
					break;
				case "C":
					try {
						if (catetoA <= 0 || catetoB <= 0)
							throw new Exception();
						hipotenusa = Math.sqrt(Math.pow(catetoA, 2)+Math.pow(catetoB, 2));
						hipotenusa = Math.round(hipotenusa*100);
						hipotenusa /= 100;
						System.out.println("Hipotenusa: " + hipotenusa);
						catetoA = 0;
						catetoB = 0;
					} catch (Exception e) {
						System.err.println("Por favor, indique el valor de los catetos");
					}
					break;
				default:
					System.err.println("Por favor, introduzca un comando válido");
			}
		}
	}
}
