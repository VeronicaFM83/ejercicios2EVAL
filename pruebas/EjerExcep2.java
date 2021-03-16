package pruebas;

import java.util.Scanner;

public class EjerExcep2 {

	
	// metodo
	public static void calcula(double a, double b, double c) {
		if (a==0) { //coeficiente de mayor grado es 0
			throw new IllegalArgumentException();
		}
		
		double resultadoMas, resultadoMenos, discriminante;
		
		discriminante = Math.pow(b, 2)-(4*a*c);
		
		if (discriminante < 0) {
			throw new ArithmeticException();
		}

		resultadoMas = ((-b)+(Math.sqrt(discriminante)))/(2*a);

		resultadoMenos = ((-b)-(Math.sqrt(discriminante)))/(2*a);
		
		System.out.println(resultadoMas + ", " + resultadoMenos);

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		double[] valores = new double[3];
		
		Scanner input = new Scanner(System.in);
		
		for (int i=0;i<valores.length;i++) {
			try{
				valores[i]=Double.parseDouble(input.nextLine());
			} catch (Exception e){
				System.err.println(e + " - Introduzca un número");
				valores[i]=Double.parseDouble(input.nextLine());
			}
		}
		calcula(valores[0],valores[1],valores[2]);
		input.close();
	}

}
