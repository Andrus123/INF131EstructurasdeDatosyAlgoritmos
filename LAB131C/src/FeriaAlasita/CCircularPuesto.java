package FeriaAlasita;

public class CCircularPuesto {

	private int max=50;
	private Puesto v[]= new Puesto[max+1];
	private int ini,fin;

	public CCircularPuesto() {
		// TODO Auto-generated constructor stub
		ini=fin=0;
	}


    int nroelem ()
    {
	return ((max + fin - ini) % max);
    }


    boolean esvacia ()
    {
	if (nroelem () == 0)
	    return (true);
	return (false);
    }


    boolean esllena ()
    {
	if (nroelem () == max - 1)
	    return (true);
	return (false);
    }


    void adicionar (Puesto elem)
    {
	if (!esllena ())
	{

	    fin = (fin + 1) % max;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola circular llena");
    }


    Puesto eliminar ()
    {
	Puesto elem = new Puesto ();
	if (!esvacia ())
	{
	    ini = (ini + 1) % max;
	    elem = v [ini];
	    if (nroelem () == 0)
		ini = fin = 0;
	}
	else
	    System.out.println ("Cola circular vacia");
	return (elem);
    }


    void mostrar ()
    {
	Puesto elem;
	if (esvacia ())
	    System.out.println ("Cola vacia xxx");
	else
	{
	    System.out.println ("\n Datos de la Cola ");
	    CCircularPuesto aux = new CCircularPuesto ();
	    while (!esvacia ())
	    {
		elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    while (!aux.esvacia ())
	    {
		elem = aux.eliminar ();

		adicionar (elem);
	    }
	}
    }


    void llenar (int n)
    {
	int i;
	for (i = 1 ; i <= n ; i++)
	{
	    Puesto elem = new Puesto();
	    elem.leer ();
	    adicionar (elem);
	}
    }



    void invertir ()
    {
	CCircularPuesto a = new CCircularPuesto ();
	CCircularPuesto b = new CCircularPuesto ();
	while (!esvacia ())
	{
	    while (nroelem () != 1)
		a.adicionar (eliminar ());
	    b.adicionar (eliminar ());
	    while (!a.esvacia ())
		adicionar (a.eliminar ());
	}
	while (!b.esvacia ())
	    adicionar (b.eliminar ());

    }


    void vaciar (CCircularPuesto a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }


}
