package Estudiante;

public class MultipilaE {
	private int n;
	PilaE c[] = new PilaE[100];
	public MultipilaE() {
		// TODO Auto-generated constructor stub
	}
	public int nroElem(int i) {
		return c[i].nroElem();
	}
	boolean esVacia(int i) {
		return c[i].esVacia();
	}
	boolean esLlena(int i) {
		return c[i].esLlena();
	}
	public void adicionar(int i,Estudiante e) {
		c[i].adicionar(e);
	}
	public Estudiante eliminar(int i) {
		return c[i].eliminar();
	}
	
	//llenar la pila i-enesima con n elementos
	public void llenar(int i, int n) {
		c[i].llenar(n);
	}
	
	//llenar de n pilar el objeto multiples pilas
	public void llenar(int n)
	{
		this.n=n;
		int ne;
		for(int i=0; i<this.n-1;i++) {
			ne = Leer.datoInt();
			llenar(i,ne);
		}
	}
	public void mostrar() {
		for(int i=0; i<this.n-1;i++) {
			c[i].mostrar();
		}
	}
	public void mostrar(int i) {
		c[i].mostrar();
	}
	public void vaciar(int i, PilaE z) {
		c[i].vaciar(z);
	}
	public void vaciar(int i, int j) {
		c[i].vaciar(c[j]);
	}
	public int getN() {
		return n;
	}

}
