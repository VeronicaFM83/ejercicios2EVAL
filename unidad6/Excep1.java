package unidad6;

public class Excep1 {
	
	public static boolean isInt(String n) {
		int numero;
		try {
			numero = Integer.parseInt(n);
		}
		catch (NumberFormatException ex) {
			System.out.println("No es un número entero");
			return false;
		}
		System.out.println("Es un número entero");
		return true;
	}
	public static boolean isDouble(String n) {
		double numero;
		try {
			numero = Double.parseDouble(n);
		}
		catch (NumberFormatException ex) {
			System.out.println(n + " no es un número con decimales");
			return false;
		}
		System.out.println(n + " es un número con decimales");
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ab";
		String b = "3";
		String c = "2.4";
		System.out.println(isInt(a));
		System.out.println(isInt(b));
		System.out.println(isInt(c));
		System.out.println(isDouble(a));
		System.out.println(isDouble(b));
		System.out.println(isDouble(c));
		
	}
}
