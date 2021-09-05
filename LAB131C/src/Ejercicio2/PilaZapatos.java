package Ejercicio2;

public class PilaZapatos {
	private int max=10, tope;
	private Zapato[] z=new Zapato[max+1];
	public PilaZapatos() {
		// TODO Auto-generated constructor stub
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	void adicionar(Zapato l) {
		if(!esllena()) {
			tope++;
			z[tope]=l;
		}
		else
			System.out.println("Pila llena");
	}
	Zapato eliminar() {
		Zapato elem=null;
		if(!esvacia()) {
			elem=z[tope];
			tope--;
		}
		else
			System.out.println("Pila vacia");
		return elem;
	}
	void llenar(int n) {
		for(int i=0;i<n;i++) {
			Zapato x=new Zapato();
			x.leer();
			adicionar(x);
		}
	}
	void llenar() {
		adicionar(new Zapato("500T","yeezy",450,3));
		adicionar(new Zapato("700T","yeezy",550,2));
		adicionar(new Zapato("250","yeezy",650,1));
		adicionar(new Zapato("720","yeezy",750,3));
	}
	void mostrar() {
		PilaZapatos aux=new PilaZapatos();
		while(!esvacia()) {
			Zapato num=eliminar();
			num.mostrar();
			aux.adicionar(num);
		}
		vaciar(aux);
	}
	void vaciar(PilaZapatos z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
}
