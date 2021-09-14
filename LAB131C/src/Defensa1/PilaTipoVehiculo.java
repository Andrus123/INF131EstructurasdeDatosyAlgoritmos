package Defensa1;


public class PilaTipoVehiculo {
	private int max=50,tope;
	private TipoVehiculo[] v=new TipoVehiculo[max+1];
	
	PilaTipoVehiculo() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	void adicionar(TipoVehiculo l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("pila llena");
	}
	TipoVehiculo eliminar() {
		TipoVehiculo elem=null;
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
			TipoVehiculo x=new TipoVehiculo();
			x.leer();
			adicionar(x);
		}
	}
	void llenar() {
		adicionar(new TipoVehiculo(1, "Automovil"));
		adicionar(new TipoVehiculo(2, "Bus"));
		adicionar(new TipoVehiculo(3, "Camion"));
		adicionar(new TipoVehiculo(4, "Camioneta"));
	}
	void mostrar() {
		PilaTipoVehiculo aux=new PilaTipoVehiculo();
		while(!esvacia()) {
			TipoVehiculo x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(PilaTipoVehiculo z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
	public int nroElem() {
		return tope;
	}
}
