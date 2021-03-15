package unidad6;

public class PruebaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<21;i++) {
			System.out.println("Num: " + i);
			try {
				valido(i);
			}
			catch (Exception e) {
				System.err.println(i + " no es válido. " + e.getMessage());
			}
		}
	}
	
	public static void valido(int n) throws Exception{
		if((247%n)==00)
			throw new Exception();
	}

}
