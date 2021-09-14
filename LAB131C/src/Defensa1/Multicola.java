package Defensa1;


public class Multicola {
	private int n;
	private ColaDepartamento[] v=new ColaDepartamento[10];
	
	public Multicola() {
		n=0;
		for (int i = 1; i < 10; i++) {
			v[i]=new ColaDepartamento();
		}
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	boolean esvacia (int i){
    	return v[i].esvacia();
    }
    boolean esllena (int i){
    	return v[i].esllena();
    }
    void adicionar (int i, Departamento elem){
		v[i].adicionar(elem);
    }
    Departamento eliminar (int i){
    	return v[i].eliminar();
    }
    void llenar (int n){
		this.n = n;
		for (int i = 0; i < n; i++) {
			llenar(i, Leer.datoInt());
		}
    }
    void llenar (int j, int n){
		for (int i = 0; i < n; i++) {
			Departamento x=new Departamento();
			x.leer();
			v[j].adicionar(x);
		}
    }
    void mostrar (){
    	System.out.println("\nMultiCola de Departamentos:");
		for (int i = 1; i <= getN(); i++) {
			System.out.println("ColaDepartamento "+i);
			v[i].mostrar();
		}
	}
	int nroElem (int i){
		return v[i].nroElem ();
    }
	public void mostrar(int i) {
		v[i].mostrar();
	}
	public void vaciar(int i, ColaDepartamento aux) {
		v[i].vaciar(aux);
	}
	public void vaciar(int i, int j) {
		v[i].vaciar(v[j]);
	}
	public void llenar() {
		PilaTipoVehiculo t1 = new PilaTipoVehiculo();
		t1.adicionar(new TipoVehiculo(1,"Automovil"));
		t1.adicionar(new TipoVehiculo(2,"Bus"));
		t1.adicionar(new TipoVehiculo(3,"Camion"));
		t1.adicionar(new TipoVehiculo(4,"Camioneta"));
		//t1.mostrar();
		PilaRangoModelo r1 = new PilaRangoModelo();
		r1.adicionar(new RangoModelo(1, "1970-1975"));
		r1.adicionar(new RangoModelo(2, "1976-1980"));
		r1.adicionar(new RangoModelo(3, "1981-1985"));
		r1.adicionar(new RangoModelo(4, "1986-1990"));
		//r1.mostrar();
		v[1].adicionar(new Departamento("La Paz", t1, r1, 11000));
		v[2].adicionar(new Departamento("Cochabamba", t1, r1, 12000));
	}
}
