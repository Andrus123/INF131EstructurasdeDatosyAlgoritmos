package Defensa1;


public class ColaDepartamento {
	private int ini,fin,max=50;
	private Departamento[] v=new Departamento[max+1];
	ColaDepartamento() {
		ini=fin=0;
	}
	boolean esvacia() {
		return (ini==0 && fin==0);
	}
	boolean esllena() {
		return fin==max;
	}
	void adicionar(Departamento x) {
		if(!esllena()) {
			fin++;
			v[fin]=x;
		}
		else
			System.out.println("Cola llena");
	}
	Departamento eliminar() {
		Departamento elem=null;
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
			Departamento x=new Departamento();
			x.leer();
			adicionar(x);
		}
	}
	void mostrar() {
		ColaDepartamento aux=new ColaDepartamento();
		while(!esvacia()) {
			Departamento x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(ColaDepartamento z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
	public int nroElem() {
		return fin-ini;
	}
	public void llenar() {
		
	}
}
