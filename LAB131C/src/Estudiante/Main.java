package Estudiante;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipilaE w = new MultipilaE();
		w.llenar(4);
		w.mostrar();
		// mostrar los elementos de la pila
		// que cupa la posicion
		w.mostrar(2);
		System.out.println(w.nroElem(1));
		Estudiante x = w.eliminar(2);
		x.mostrar();
		System.out.println(x.getCarrera());
	}

}
