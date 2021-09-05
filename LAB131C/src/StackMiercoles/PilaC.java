package StackMiercoles;

public class PilaC {
	private int max=50;
	private Cultivo v[]=new Cultivo[max+1];
	private int tope;

	public PilaC() {
		// TODO Auto-generated constructor stub
		tope=0;
	}
	boolean esvacia ()
	{
		if(tope==0)
			return (true);
		return (false);
	}
	boolean esllena()
	{
		if(tope == max)
			return (true);
		return (false);
	}
	int nroelem() //size
	{
		return (tope);
	}
	void adicionar (Cultivo elem) //push
	{
		if(!esllena ())
		{
			tope++;
			v[tope] = elem;
		}
		else
			System.out.println("Pila llena");
	}
	Cultivo eliminar () //pop
	{
		Cultivo elem = new Cultivo();
		if(!esvacia())
		{
			elem = v[tope];
			tope--;
		}
		else
			System.out.println("Pila vacia");
		return (elem);
	}
	void mostrar()
	{
		Cultivo elem;
		if (esvacia())
			System.out.println("Pila vacia");
		else
		{
			System.out.println("\n Datos de la Pila");
			PilaC aux = new PilaC ();
			while (!esvacia ())
			{
				elem = eliminar();
				aux.adicionar(elem);
				elem.mostrar();
			}
			vaciar(aux);
		}
	}
	void llenar(int n)
	{
		int i;
		for (i=1; i<=n;i++)
		{
			Cultivo l = new Cultivo();
			l.leer();
			adicionar(l);
		}
	}
	void vaciar (PilaC a)
	{
		while(!a.esvacia())
			adicionar (a.eliminar());
	}

}
