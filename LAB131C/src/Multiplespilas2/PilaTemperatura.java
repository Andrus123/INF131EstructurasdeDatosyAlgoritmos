package Multiplespilas2;

public class PilaTemperatura {
	private int max=50,tope;
	private Temperatura[] v=new Temperatura[max+1];
	PilaTemperatura() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	void adicionar(Temperatura l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	Temperatura eliminar() {
		Temperatura elem=null;
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
			Temperatura x=new Temperatura();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		PilaTemperatura aux=new PilaTemperatura();
		while(!esvacia()) {
			Temperatura x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(PilaTemperatura z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
	public int nroElem() {
		return tope;
	}
}
