package EjStack;

public class PilaM {
	private int max=20;
	private Mueble v[]=new Mueble[max+1];
	private int tope;
	PilaM()
	{
		tope=0;
	}
	boolean esvacia ()
	{
		if(tope == 0)
			return (true);
		return (false);
	}
	boolean esllena ()
	{
		if (tope == max)
			return(true);
		return (false);
	}
	int nroelem ()
	{
		return (tope);
	}
	void adicionar (Mueble elem)
	{
		if (!esllena ())
		{
			tope++;
			v[tope] = elem;
		}
		else
			System.out.println ("Pila llena");
	}
	Mueble eliminar ()
	{
		Mueble elem = new Mueble();
		if (!esvacia ())
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
		Mueble elem;
		if (esvacia())
			System.out.println("Pila vacia");
		else
		{
			System.out.println("\n Muebles de la Pila");
			PilaM aux = new PilaM ();
			while (!esvacia ())
			{
			elem = eliminar();
			aux.adicionar (elem);
			elem.mostrar();
			}
			vaciar(aux);
		}
	}
	void llenar (int n) {
		int i;
		for(i = 1; i <= n; i++)
		{
			Mueble m=new Mueble();
			m.leer();
			adicionar(m);
		}
	}
	void vaciar (PilaM a)
	{
		while (!a.esvacia())
			adicionar (a.eliminar());
	}
}
