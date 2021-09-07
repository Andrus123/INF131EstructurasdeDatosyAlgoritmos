package FeriaAlasita;


public class PilaSector {
	private int max=50;
	private Sector v[] = new Sector[max+1];
	private int tope;

	public PilaSector() {
		// TODO Auto-generated constructor stub
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
	void adicionar (Sector elem)
	{
		if (!esllena ())
		{
			tope++;
			v[tope] = elem;
		}
		else
			System.out.println ("Pila llena");
	}
	Sector eliminar ()
	{
		Sector elem = new Sector();
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
		Sector elem;
		if (esvacia())
			System.out.println("Pila vacia");
		else
		{
			System.out.println("\n Sectores de la Pila");
			PilaSector aux = new PilaSector ();
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
			Sector m=new Sector();
			m.leer();
			adicionar(m);
		}
	}
	void vaciar (PilaSector a)
	{
		while (!a.esvacia())
			adicionar (a.eliminar());
	}

}
