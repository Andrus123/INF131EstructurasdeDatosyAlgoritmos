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
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
