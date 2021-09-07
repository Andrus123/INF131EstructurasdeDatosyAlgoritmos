package FeriaAlasita;

public class PilaId {

	private int max=50;
	private int v[] = new int[max+1];
	private int tope;

	public PilaId() {
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
	void adicionar (int elem)
	{
		if (!esllena ())
		{
			tope++;
			v[tope] = elem;
		}
		else
			System.out.println ("Pila llena");
	}
	int eliminar ()
	{
		int elem = 0;
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
		int elem;
		if (esvacia())
			System.out.println("Pila vacia");
		else
		{
			System.out.println("\n Id's de la Pila");
			PilaId aux = new PilaId();
			while (!esvacia ())
			{
			elem = eliminar();
			aux.adicionar (elem);
			System.out.println(elem);
			}
			vaciar(aux);
		}
	}
	void llenar (int n) {
		int i;
		for(i = 1; i <= n; i++)
		{
			adicionar(Leer.datoInt());
		}
	}
	void vaciar (PilaId a)
	{
		while (!a.esvacia())
			adicionar (a.eliminar());
	}

}
