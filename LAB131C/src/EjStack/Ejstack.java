package EjStack;
import java.util.*;

public class Ejstack {
	
	public static void llevar(PilaM a, String x)
	{
		PilaM ax=new PilaM();
		PilaM ar=new PilaM();
		while(!a.esvacia())
		{
			Mueble m=a.eliminar();
			if(m.getColor().equals(x))
				ax.adicionar(m);
			else
				ar.adicionar(m);
		}
		a.vaciar(ax);
		a.vaciar(ar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack A=new Stack();
		A.push("uno");
		A.push("dos");
		A.push("tres");
		A.push("cuatro");
		A.push("cinco");
		System.out.println(A);
		Stack<Mueble> B = new Stack<Mueble>();
		llenarM(B,Leer.datoInt());
		mostrarM(B);
		// llevar los muebles de color x al principio
		llevar(B, Leer.dato());
		mostrarM(B);
		PilaM W=new PilaM();
		W.llenar(Leer.datoInt());
		W.mostrar();
		llevar(W,Leer.dato());
		W.mostrar();
	}
	public static void llevar(Stack<Mueble> a, String x)
	{
		Stack<Mueble> ax=new Stack<Mueble>();
		Stack<Mueble> ar=new Stack<Mueble>();
		while(!a.empty())
		{
			Mueble m=a.pop();
			if(m.getColor().equals(x))
				ax.push(m);
			else
				ar.push(m);
		}
		vaciar(ax,a);
		vaciar(ar,a);
	}
	public static void llenarM(Stack<Mueble> a, int n)
	{
		for(int i=1;i<=n;i++)
		{
			Mueble m=new Mueble();
			m.leer();
			a.push(m);
		}
	}
	public static void mostrarM(Stack<Mueble> a)
	{
		Stack<Mueble> aux=new Stack<Mueble>();
		while(!a.isEmpty()) {
			Mueble x=a.pop();
			x.mostrar();
			aux.push(x);
		}
		vaciar(aux,a);
	}
	public static void vaciar(Stack<Mueble> a,Stack<Mueble> b)
	{
		while(!a.isEmpty())
			b.push(a.pop());
	}

}
