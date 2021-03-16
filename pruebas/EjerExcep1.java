package pruebas;

public class EjerExcep1 {
	
	public static boolean isInt(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isDouble(String n) {
		try {
			Double.parseDouble(n);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isInt("2"));
		System.out.println(isInt("a"));

	}

}
