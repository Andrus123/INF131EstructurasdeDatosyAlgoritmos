package Defensa1;

public class PilaRangoModelo {
	private int max=50,tope;
	private RangoModelo[] v=new RangoModelo[max+1];
	
	PilaRangoModelo() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	void adicionar(RangoModelo l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	RangoModelo eliminar() {
		RangoModelo elem=null;
		if(!esvacia()) {
			elem=v[tope];
			tope--;
		}
		else
			System.out.println("pila vacia");
		return elem;
	}
	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			RangoModelo x=new RangoModelo();
			x.leer();
			adicionar(x);
		}
	}
	void llenar() {
		adicionar(new RangoModelo(1, "<=1969"));
		adicionar(new RangoModelo(2, "1970-1975"));
		adicionar(new RangoModelo(3, "1976-1980"));
		adicionar(new RangoModelo(4, "1981-1985"));
		adicionar(new RangoModelo(5, "1986-1990"));
		adicionar(new RangoModelo(8, "2001-2005"));
	}
	void mostrar() {
		PilaRangoModelo aux=new PilaRangoModelo();
		while(!esvacia()) {
			RangoModelo x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(PilaRangoModelo z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
	public int nroElem() {
		return tope;
	}
}
