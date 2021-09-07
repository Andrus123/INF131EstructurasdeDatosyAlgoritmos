package FeriaAlasita;

public class CCircularA {
	private int max=50;
	private Area v[]= new Area[max+1];
	private int ini,fin;

	public CCircularA() {
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


    void adicionar (Area elem)
    {
	if (!esllena ())
	{

	    fin = (fin + 1) % max;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola circular llena");
    }


    Area eliminar ()
    {
	Area elem = new Area ();
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
	Area elem;
	if (esvacia ())
	    System.out.println ("Cola vacia xxx");
	else
	{
	    System.out.println ("\n Datos de la Cola ");
	    CCircularA aux = new CCircularA ();
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
	    Area elem = new Area();
	    elem.leer ();
	    adicionar (elem);
	}
    }



    void invertir ()
    {
	CCircularA a = new CCircularA ();
	CCircularA b = new CCircularA ();
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


    void vaciar (CCircularA a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }

}
