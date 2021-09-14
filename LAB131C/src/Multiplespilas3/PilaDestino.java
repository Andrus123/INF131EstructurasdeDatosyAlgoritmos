package Multiplespilas3;

public class PilaDestino {
	private int max=50,tope;
	private Destino[] v=new Destino[max+1];
	PilaDestino() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	void adicionar(Destino l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	Destino eliminar() {
		Destino elem=null;
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
			Destino x=new Destino();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		PilaDestino aux=new PilaDestino();
		while(!esvacia()) {
			Destino x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(PilaDestino z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
	public int nroElem() {
		return tope;
	}
	public void llenar() {
		adicionar(new Destino("d01", "La Paz", "Cochabamba", "03/09/2021", "19:00", 8, 70));
		adicionar(new Destino("d02", "La Paz", "Santa Cruz", "20/10/2021", "12:00", 12, 140));
		adicionar(new Destino("d03", "Oruro", "Potosi", "04/09/2021", "09:30", 5, 30));
	}
}
