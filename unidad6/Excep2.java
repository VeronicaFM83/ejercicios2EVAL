package unidad6;

public class Excep2 {
	
	// 𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0
	
	private double n1, n2, n3;
	
	public static void ecuacion(double a, double b, double c) {
		double resultado, discriminante;
		try {
			mayor(a,b);
		}				
		catch (Exception e) {
			e.printStackTrace();
			System.err.println("Illegal argument exception");
		} 
		
		try {
			discriminante = (Math.pow(b, 2)-(4*a*c));
			discriminante(discriminante); 
		} 
		catch (ArithmeticException e) {
			System.err.println("No tiene solución");
		}
		resultado = (-b+(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/(2*a);
		System.out.println(resultado);
	}

	public static void mayor(double a, double b) throws Exception{
		if ((a>b && a==0) || (b>a && b==0))
			throw new IllegalArgumentException("Coeficiente de mayor grado es igual a 0");
	}
	
	public static void discriminante(double n) {
		if (n<0)
			throw new ArithmeticException("El discriminante es negativo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		a=3;
		b=-17;
		c=20;
		ecuacion(a,b,c);
	}

}
