package pruebasHucha;

public class Hucha {
	
	private boolean abierta = true;
	private String clave;
	private int[][] contenido = {{50,0},{20,0},{10,0},{5,0},{2,0},{1,0}};
	private int total;
	
	public Hucha() {
		this.total = 0;
	}

	public Hucha(int importe) {
		this.total = importe;
		reparte(importe);
	}
	
	public void setImporte(int importe) {
		this.total = importe;
		reparte(importe);
	}
	
	@Override
	public String toString() {
		String msg = "Hucha con " + total + " euros.\n";
		for (int[] a: contenido) {
			if (a[1] != 0) {
				msg += a[1];
				if (a[0]==2 || a[0]==1) {
				msg += " monedas de ";
				} else {
					msg += " billetes de ";
				}
				msg += a[0] + " euros\n";
			}
		}
		return msg;
	}
	
	public String reparte(int importe) {
		String msg = "";
		for (int[] a: contenido) {
			int uds = (int) importe / a[0];
			if (uds >= 1 ) {
				a[1] = uds;
				importe = importe % a[0];
				msg += uds + " unidades de " + a[0] + " euros\n";
			}
		}
		msg += "Saldo: " + this.total;
		return msg;
	}
	
	public void retira(int importe) {
		if (importe > this.total) {
			System.out.println("No tiene suficiente saldo");
		} else {
			System.out.println("Saldo: " + this.total + ". A retirar: " + importe);
			this.total -= importe;
			System.out.println(reparte(this.total));
		}
	}
}
