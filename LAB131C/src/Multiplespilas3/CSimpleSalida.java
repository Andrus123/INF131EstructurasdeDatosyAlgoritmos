package Multiplespilas3;

public class CSimpleSalida {
	private int ini,fin,max=50;
	private Salida[] v=new Salida[max+1];
	CSimpleSalida() {
		ini=fin=0;
	}
	boolean esvacia() {
		return (ini==0 && fin==0);
	}
	boolean esllena() {
		return fin==max;
	}
	void adicionar(Salida x) {
		if(!esllena()) {
			fin++;
			v[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	Salida eliminar() {
		Salida elem=null;
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
			Salida x=new Salida();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		CSimpleSalida aux=new CSimpleSalida();
		while(!esvacia()) {
			Salida x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CSimpleSalida z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
}
