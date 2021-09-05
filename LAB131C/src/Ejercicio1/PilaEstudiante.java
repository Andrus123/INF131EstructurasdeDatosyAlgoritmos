package Ejercicio1;

public class PilaEstudiante {
	private int max=10,tope;
	private Estudiante[] v=new Estudiante[max+1];
	public PilaEstudiante() {
		// TODO Auto-generated constructor stub
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}
	boolean esllena() {
		return tope==max;
	}
	void adicionar(Estudiante l) {
		if(!esllena()) {
			tope++;
			v[tope]=l;
		}
		else
			System.out.println("Pila llena");
	}
	Estudiante eliminar() {
		Estudiante elem=null;
		if(!esvacia()) {
			elem=v[tope];
			tope--;
		}
		else
			System.out.println("Pila vacia");
		return elem;
	}
	void llenar(int n) {
		for(int i=0; i<n;i++) {
			Estudiante x=new Estudiante();
			x.leer();
			adicionar(x);
		}
	}
	void llenar() {
		adicionar(new Estudiante(6896596,"Flores","Aquin","Andres"));
		adicionar(new Estudiante(7859391,"Gutiere","Quiroga","Mauren"));
		adicionar(new Estudiante(9487828,"Gabriela","Valdivia","Kelly"));
	}
	void mostrar() {
		PilaEstudiante aux=new PilaEstudiante();
		while(!esvacia()) {
			Estudiante num=eliminar();
			num.mostrar();
			aux.adicionar(num);
		}
		vaciar(aux);
	}
	void vaciar(PilaEstudiante z) {
		while(!z.esvacia())
			adicionar(z.eliminar());
	}

}
