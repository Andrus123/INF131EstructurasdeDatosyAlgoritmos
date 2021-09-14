package Multiplespilas2;

public class ColaSimpleZona {
	private int ini,fin,max=50;
	private Zona[] v=new Zona[max+1];
	ColaSimpleZona() {
		ini=fin=0;
	}
	boolean esvacia() {
		return (ini==0 && fin==0);
	}
	boolean esllena() {
		return fin==max;
	}
	void adicionar(Zona x) {
		if(!esllena()) {
			fin++;
			v[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	Zona eliminar() {
		Zona elem=null;
		if(!esvacia()) {
			ini++;
			elem=v[ini];
			if(ini==fin)
				ini=fin=0;
		}
		else
			System.out.println("Cola llena");
		return elem;
	}
	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			Zona x=new Zona();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		ColaSimpleZona aux=new ColaSimpleZona();
		while(!esvacia()) {
			Zona x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(ColaSimpleZona z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
	public void llenar() {
		adicionar(new Zona("MiraFlores", "z01"));
		adicionar(new Zona("Villa Copacabana", "z02"));
		adicionar(new Zona("Sopocachi", "z03"));
	}
}
