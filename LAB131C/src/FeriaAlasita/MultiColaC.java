package FeriaAlasita;

public class MultiColaC {
	private int nc;
	private CCircularPuesto c[] = new CCircularPuesto[50];
	
	public MultiColaC() {
		// TODO Auto-generated constructor stub
		int i;
		for (i=1; i<50;i++)
			c[i] = new CCircularPuesto();
	}

	public int getNc() {
		return nc;
	}

	public void setNc(int nc) {
		this.nc = nc;
	}

	public CCircularPuesto[] getC() {
		return c;
	}

	public void setC(CCircularPuesto[] c) {
		this.c = c;
	}
}
