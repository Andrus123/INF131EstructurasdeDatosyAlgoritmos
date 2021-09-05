package Ejercicio1;

public class PilaEvaluaciones {
	private int tope, max=10;
	private Evaluacion[] v=new Evaluacion[max+1];
	
	public PilaEvaluaciones() {
		// TODO Auto-generated constructor stub
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	void adicionar(Evaluacion num) {
		if(!esllena()) {
			tope++;
			v[tope]=num;
		}
		else
			System.out.println("Pila llena");
	}
	Evaluacion eliminar() {
		Evaluacion elem=null;
		if(!esvacia()) {
			elem=v[tope];
			tope--;
		}
		else
			System.out.println("Pila vacia");
		return elem;
	}
	void llenar(int n) {
		for (int i=0; i<n;i++) {
			Evaluacion x=new Evaluacion();
			x.leer();
			adicionar(x);
		}
	}
	void llenar() {
		adicionar(new Evaluacion("Pilas",30,6896596));
		adicionar(new Evaluacion("Listas",60,7859391));
		adicionar(new Evaluacion("Colas",70,6896596));
		adicionar(new Evaluacion("Pilas",55,9487828));
		adicionar(new Evaluacion("Colas",48,7859391));
	}
	void mostrar() {
		PilaEvaluaciones aux=new PilaEvaluaciones();
		while(!esvacia()) {
			Evaluacion num=eliminar();
			num.mostrar();
			aux.adicionar(num);
		}
		vaciar(aux);
	}
	void vaciar(PilaEvaluaciones z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
}
