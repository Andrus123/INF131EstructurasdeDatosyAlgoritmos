package Ejercicio2;

public class PilaVentas {
	private int max=10, tope;
	private Venta[] v=new Venta[max+1];
	public PilaVentas() {
		// TODO Auto-generated constructor stub
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	void adicionar(Venta l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("Pila llena");
	}
	Venta eliminar() {
		Venta elem=null;
		if(!esvacia()) {
			elem=v[tope];
			tope--;
		}
		else
			System.out.println("Pila vacia");
		return elem;
	}
	void llenar(int n) {
		for(int i=0;i<n;i++) {
			Venta x=new Venta();
			x.leer();
			adicionar(x);
		}
	}
	void llenar() {
		adicionar(new Venta("700T","31/8/2021",1122,1));
		adicionar(new Venta("500T","1/9/2021",5566,2));
		adicionar(new Venta("720","3/9/2021",3344,3));
		adicionar(new Venta("720","3/9/2021",7788,2));
	}
	void mostrar() {
		PilaVentas aux=new PilaVentas();
		while(!esvacia()) {
			Venta num=eliminar();
			num.mostrar();
			aux.adicionar(num);
		}
		vaciar(aux);
	}
	void vaciar(PilaVentas z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
}
