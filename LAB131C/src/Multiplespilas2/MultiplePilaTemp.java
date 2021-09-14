package Multiplespilas2;

public class MultiplePilaTemp {
	private int n;
	private PilaTemperatura[] v=new PilaTemperatura[13];
	
	public MultiplePilaTemp() {
		n=0;
		for (int i = 1; i <= 12; i++) {
			v[i]=new PilaTemperatura();
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
    void adicionar (int i, Temperatura elem){
		v[i].adicionar(elem);
    }
    Temperatura eliminar (int i){
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
			Temperatura x=new Temperatura();
			x.leer();
			v[j].adicionar(x);
		}
    }
    void mostrar (){
    	System.out.println("\nMutipleColaSimpleTemperatura:");
		for (int i = 1; i <= getN(); i++) {
			System.out.println("PilaTemperaturarendas "+i);
			v[i].mostrar();
		}
	}
	int nroElem (int i){
		return v[i].nroElem ();
    }
	public void mostrar(int i) {
		v[i].mostrar();
	}
	public void vaciar(int i, PilaTemperatura aux) {
		v[i].vaciar(aux);
	}
	public void vaciar(int i, int j) {
		v[i].vaciar(v[j]);
	}
	public void llenar() {
		v[1].adicionar(new Temperatura("z02", 23, -1, 251));
		v[1].adicionar(new Temperatura("z01", 24, 10, 100));
		v[1].adicionar(new Temperatura("z03", 23, 27, 200));
		v[1].adicionar(new Temperatura("z02", 24, 9, 50));
		
		v[2].adicionar(new Temperatura("z02", 15, -1, 30));
		v[2].adicionar(new Temperatura("z03", 14, -10, 25));
		v[2].adicionar(new Temperatura("z03", 15, -12, 21));
		
		v[3].adicionar(new Temperatura("z01", 25, 21, 251));
		
		v[4].adicionar(new Temperatura("z02", 16, -15, 250));
		v[4].adicionar(new Temperatura("z03", 16, 15, 250));
		v[4].adicionar(new Temperatura("z01", 16, -1, 232));
		v[4].adicionar(new Temperatura("z01", 17, 8, 100));
		this.n=4;
	}
	
}
