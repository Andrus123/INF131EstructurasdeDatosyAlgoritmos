package Multiplespilas1;

public class MultiplePilaNumeros {
	private int np;
	private PilaNumeros p[]=new PilaNumeros[10];
	
	public MultiplePilaNumeros() {
		for(int i=1; i<10; i++)
			p[i]=new PilaNumeros();
		np=0;
	}
	
	public int getNp() {
		return np;
	}
	public void setNp(int np) {
		this.np=np;
	}
	boolean esvacia(int i) {
		return p[i].esvacia();
	}
	boolean esllena(int i) {
		return p[i].esllena();
	}
	int nroElem(int i){
		return p[i].nroelem();
	}
	void adicionar(int i, int n)
	{
		p[i].adicionar(n);
	}
	
	int eliminar(int i)
	{
		return p[i].eliminar();
	}
	void llenar (int n){
		this.np = n;
		for (int i = 1; i <= n; i++) {
			llenar(i, Leer.datoInt());
		}
    }
	void llenar (int j, int n){
		for (int i = 0; i < n; i++) {
			p[j].adicionar(Leer.datoInt());
		}
    }
	void mostrar() {
		int i;
		System.out.println("-------------------------");
		System.out.println("DATOS DE LA MULTIPLE PILA");
		System.out.println("-------------------------");
		for(i=1;i<=np;i++)
		{
			System.out.println("\nDatos Pila "+i+" ");
			p[i].mostrar();
		}
	}
	void mostrar(int i) {
		p[i].mostrar();
	}
	public void vaciar(int i, PilaNumeros x)
	{
		p[i].vaciar(x);
	}
	public void vaciar(int i, int j)
	{
		p[i].vaciar(p[j]);
	}
	public void llenar() {
			p[1].adicionar(1);
			p[1].adicionar(8);
			p[1].adicionar(2);
			p[1].adicionar(3);
			
			p[2].adicionar(8);
			p[2].adicionar(9);
			p[2].adicionar(5);
			p[2].adicionar(9);
			p[2].adicionar(8);
			
			p[3].adicionar(1);
			p[3].adicionar(9);
			p[3].adicionar(5);
			p[3].adicionar(4);
			p[3].adicionar(2);
			p[3].adicionar(1);
			
			p[4].adicionar(8);
			p[4].adicionar(9);
			p[4].adicionar(5);
			p[4].adicionar(9);
			p[4].adicionar(8);
			np=4;
		}
}
