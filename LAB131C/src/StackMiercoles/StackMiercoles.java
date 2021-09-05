/**
 * 
 */
package StackMiercoles;
import java.util.*;

/**
 * @author Andrés Aquin
 *
 */
public class StackMiercoles {

	/**
	 * 
	 */
	public static void llenar(Stack<Cultivo>a, int n)
	{
		for(int i=1;i<=n;i++)
		{
			Cultivo x=new Cultivo();
			x.leer();
			a.push(x);
		}
	}
	public static void mostrar(Stack<Cultivo>b)
	{
		Stack<Cultivo> bb=new Stack<Cultivo>();
		while(!b.empty())
		{
			Cultivo v=b.pop();
			v.mostrar();
			bb.push(v);
		}
		vaciar(bb,b);
	}
	public static void vaciar(Stack<Cultivo> o, Stack<Cultivo> d)
	{
		while(!o.empty())
			d.push(o.pop());
	}
	public static void mayor(Stack<Cultivo> z)
	{
		Stack<Cultivo> x=new Stack<Cultivo>();
		int may=0;
		while(!z.empty())
		{
			Cultivo cv=z.pop();
			x.push(cv);
			if(cv.getProduccion()>may)
				may=cv.getProduccion();
		}
		while(!x.empty())
		{
			Cultivo v=x.pop();
			z.push(v);
			if(v.getProduccion()==may)
				v.mostrar();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Cultivo> C=new Stack<Cultivo>();
		llenar(C,Leer.datoInt());
		mostrar(C);
		//mostrar los cultivos con mayor produccion
		mayor(C);
		
		PilaC A=new PilaC();
		A.llenar(Leer.datoInt());
		A.mostrar();
		mayor(A);
		//1. Verificar si existe el cultivo "tomate"
		//2. Mostrar los nombres cultivos del Stack que existen en la PilaC
	}
	public static void mayor(PilaC z)
	{
		PilaC x=new PilaC();
		int may=0;
		while(!z.esvacia())
		{
			Cultivo cv=z.eliminar();
			x.adicionar(cv);
			if(cv.getProduccion()>may)
				may=cv.getProduccion();
		}
		while(!x.esvacia())
		{
			Cultivo v=x.eliminar();
			z.adicionar(v);
			if(v.getProduccion()==may)
				v.mostrar();
		}
	}

}
