package Multiplespilas3;

public class MultiCSimpleSalida {
	private int n;
	private CSimpleSalida[] v=new CSimpleSalida[10];
	
	public MultiCSimpleSalida() {
		n=0;
		for (int i = 1; i < 10; i++) {
			v[i]=new CSimpleSalida();
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
    void adicionar (int i, Salida elem){
		v[i].adicionar(elem);
    }
    Salida eliminar (int i){
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
			Salida x=new Salida();
			x.leer();
			v[j].adicionar(x);
		}
    }
    void mostrar (){
    	System.out.println("\nMutipleColaSimpleSalida:");
		for (int i = 1; i <= getN(); i++) {
			System.out.println("CSimpleSalidarendas "+i);
			v[i].mostrar();
		}
	}
	int nroElem (int i){
		return v[i].nroElem ();
    }
	public void mostrar(int i) {
		v[i].mostrar();
	}
	public void vaciar(int i, CSimpleSalida aux) {
		v[i].vaciar(aux);
	}
	public void vaciar(int i, int j) {
		v[i].vaciar(v[j]);
	}
	public void llenar() {
		CCircularPasajero cp1=new CCircularPasajero();
		cp1.adicionar(new Pasajero(111, "David Meneces", "ninguna"));
		cp1.adicionar(new Pasajero(222, "Rodrigo Yujra", "obs 1"));
		cp1.adicionar(new Pasajero(333, "Erick Rodriguez", "ninguna"));
		CCircularPasajero cp2=new CCircularPasajero();
		cp2.adicionar(new Pasajero(444, "Ruth Mulluni", "obs 2"));
		CCircularPasajero cp3=new CCircularPasajero();
		cp3.adicionar(new Pasajero(5555, "Adriel Chambi", "ninguna"));
		cp3.adicionar(new Pasajero(555, "Joel Mendieta", "ninguna"));
		CCircularPasajero cp4=new CCircularPasajero();
		cp4.adicionar(new Pasajero(111, "David Meneces", "obs 1"));
		cp4.adicionar(new Pasajero(555, "Joel Mendieta", "ninguna"));
		CCircularPasajero cp5=new CCircularPasajero();
		cp5.adicionar(new Pasajero(444, "Ruth Mulluni", "ninguna"));
		cp5.adicionar(new Pasajero(222, "Rodrigo Yujra", "obs 1"));
		cp5.adicionar(new Pasajero(333, "Erick Rodriguez", "ninguna"));
		v[1].adicionar(new Salida("d01",cp1,new Conductor("Rodrigo Perez",777),new Conductor("Alan Brito",888)));
		v[1].adicionar(new Salida("d03",cp2,new Conductor("Carlos Alvarez",999),new Conductor("Rafael Chambi",1111)));
		
		v[2].adicionar(new Salida("d01",cp3,new Conductor("Rodrigo Contreras",2222),new Conductor("Daniel Apaza",3333)));
		
		v[3].adicionar(new Salida("d02",cp4,new Conductor("Rodrigo Perez",777),new Conductor("Rafael Chambi",1111)));
		v[3].adicionar(new Salida("d03",cp5,new Conductor("Carlos Alvarez",999),new Conductor("Alan Brito",888)));
		this.n=3;
	}
}
