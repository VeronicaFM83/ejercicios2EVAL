package unidad6;

public class EjemploExcepcion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String array[]= {"a","b","c","d"};
		int x=0;
		while (x<5) {
			System.out.println(array[x]);
			x++;
		}
		System.out.println("OK");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Te saliste del array");
		}
		System.out.println("Continuo fuera del array");
	}

}
