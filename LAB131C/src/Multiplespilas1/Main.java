package Multiplespilas1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplePilaNumeros A= new MultiplePilaNumeros();
		A.llenar();
		A.mostrar();
		// Mostrar las pilas cuyos elementos conforman un número capicúa
		Capicua(A);
		// Ordenar cada pila en forma ascendente e impar en forma descendente
		Ordenar(A);
		A.mostrar();
	}

	private static void Ordenar(MultiplePilaNumeros a) {
		// TODO Auto-generated method stub
		PilaNumeros aux1=new PilaNumeros(),aux2=new PilaNumeros();
		for(int i=1;i<=a.getNp();i++) {
			if(i%2==0) {
				int x=a.eliminar(i);
				aux1.adicionar(x);
				aux1.ascendente();
			}else {
				int y=a.eliminar(i);
				aux2.adicionar(y);
				aux2.descendente();
			}
			a.vaciar(i, aux2);
		}
	}

	private static void Capicua(MultiplePilaNumeros a) {
		// TODO Auto-generated method stub
		System.out.println("Pilas Capicuas");
		PilaNumeros aux1=new PilaNumeros(),aux2=new PilaNumeros();
		for(int i=1; i<= a.getNp();i++) {
			while(!a.esvacia(i)) {
				int x=a.eliminar(i);
				aux1.adicionar(x);
				aux2.adicionar(x);
			}
			a.vaciar(i, aux1);
			if(VerificarCapicua(aux2,aux1)) {
				System.out.println("PilaNumero :"+i);
				a.mostrar(i);
			}
		}
	}

	private static boolean VerificarCapicua(PilaNumeros aux2,PilaNumeros aux1) {
		PilaNumeros aux=new PilaNumeros();
		aux.vaciar(aux2);
		if(aux.equals(aux1)) {
			System.out.println("Capicua");
			return true;
		}
		return false;
	}
}
