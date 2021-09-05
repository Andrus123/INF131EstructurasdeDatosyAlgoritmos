package Ejercicio2;

public class PilaClientes {
	private int max=10, tope;
	private Cliente[] c=new Cliente[max+1];
	public PilaClientes() {
		// TODO Auto-generated constructor stub
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	void adicionar(Cliente l) {
		if(!esllena()) {
			tope++;
			c[tope]=l;
		}
		else
			System.out.println("Pila llena");
	}
	Cliente eliminar() {
		Cliente elem=null;
		if(!esvacia()) {
			elem=c[tope];
			tope--;
		}
		else
			System.out.println("Pila vacia");
		return elem;
	}
	void llenar(int n) {
		for(int i=0;i<n;i++) {
			Cliente x=new Cliente();
			x.leer();
			adicionar(x);
		}
	}
	void llenar() {
		adicionar(new Cliente("Carla",1122,22));
		adicionar(new Cliente("Lore",3344,21));
		adicionar(new Cliente("Juan",5566,22));
	}
	void mostrar() {
		PilaClientes aux=new PilaClientes();
		while(!esvacia()) {
			Cliente num=eliminar();
			num.mostrar();
			aux.adicionar(num);
		}
		vaciar(aux);
	}
	void vaciar(PilaClientes z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}
}
