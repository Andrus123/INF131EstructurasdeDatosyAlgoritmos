package Estudiante;

public class PilaE {
	private int max=50;
	Estudiante v[] = new Estudiante[max];
	private int tope;

	public PilaE() {
		// TODO Auto-generated constructor stub
		tope=-1;
	}
	boolean esVacia() {
		if(tope==-1) {
			return true;
		}
		else
			return false;
	}
	boolean esLlena() {
		if(tope==max-1) {
			return true;
		}
		else
			return false;
	}
	public void adicionar(Estudiante elem) {
		if(!esLlena()) {
			tope++;
			v[tope]=elem;
		}else {
			System.out.println("Pila Llena");
		}
	}
	public Estudiante eliminar() {
		Estudiante elem = null;
		if(!esVacia()) {
			elem=v[tope];
			tope--;
		}else 
			System.out.println("Pila Vacia");
		return elem;
	}
	public int nroElem() {
		PilaE aux = new PilaE();
		int c=0;
		while(!esVacia()) {
			aux.adicionar(eliminar());
			c++;
		}
		vaciar(aux);
		return c;
	}
	public void vaciar(PilaE p) {
		while(!p.esVacia()) {
			adicionar(p.eliminar());
		}
	}
	public void llenar(int n) {
		for(int i=1; i<n;i++) {
			Estudiante e=new Estudiante();
			e.leer();
			adicionar(e);
		}
	}
	public void mostrar() {
		PilaE aux = new PilaE();
		while(!esVacia()) {
			Estudiante x = eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}

}
