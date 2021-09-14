package Multiplespilas3;

public class CCircularPasajero {
	private int ini,fin,max=50;
	private Pasajero[] v=new Pasajero[max+1];
	CCircularPasajero() {
		ini=fin=0;
	}
	int nroelem() {
		return (max+fin-ini)%max;
	}
	boolean esvacia() {
		return nroelem()==0;
	}
	boolean eslleno() {
		return (max-1)==nroelem();
	}
	void adicionar(Pasajero elem) {
		if(!eslleno()) {
			fin=(fin+1)%max;
			v[fin]=elem;
		}
		else
			System.out.println("cola llena");
	}
	Pasajero eliminar() {
		Pasajero elem=null;
		if(!esvacia()) {
			ini=(ini+1)%max;
			elem=v[ini];
			if(ini==fin)
				ini=fin=0;
		}
		else
			System.out.println("cola vacia");
		return elem;
	}
	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			Pasajero p=new Pasajero();
			p.leer();
			adicionar(p);
		}
	}
	void mostrar() {
		CCircularPasajero aux=new CCircularPasajero();
		while(!esvacia()) {
			Pasajero x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CCircularPasajero w) {
		while(!w.esvacia())
			adicionar(w.eliminar());
	}
}
