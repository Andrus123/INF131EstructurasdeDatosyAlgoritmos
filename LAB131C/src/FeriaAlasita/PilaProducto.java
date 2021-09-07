package FeriaAlasita;

public class PilaProducto {

	private int max=50;
	private Producto v[] = new Producto[max+1];
	private int tope;

	public PilaProducto() {
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
	void adicionar (Producto elem)
	{
		if (!esllena ())
		{
			tope++;
			v[tope] = elem;
		}
		else
			System.out.println ("Pila llena");
	}
	Producto eliminar ()
	{
		Producto elem = new Producto();
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
		Producto elem;
		if (esvacia())
			System.out.println("Pila vacia");
		else
		{
			System.out.println("\n Productos de la Pila");
			PilaProducto aux = new PilaProducto();
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
			Producto p=new Producto();
			p.leer();
			adicionar(p);
		}
	}
	void vaciar (PilaProducto a)
	{
		while (!a.esvacia())
			adicionar (a.eliminar());
	}

}
