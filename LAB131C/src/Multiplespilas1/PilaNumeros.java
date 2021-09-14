package Multiplespilas1;


public class PilaNumeros {
	private int tope;
	private int max=50;
	private int[] v= new int[max+1];
	
	public PilaNumeros() {
		tope=0;
	}
	boolean esvacia() {
		return tope==0;
	}

	boolean esllena() {
		return tope==max;
	}

	int nroelem() {
		return (tope);
	}

	void adicionar(int elem) {
		if (!esllena()) {
			tope++;
			v[tope] = elem;
		}
		else
			System.out.println("Pila llena");
	}
	
	int eliminar()
	{
		int elem=-1;
		if(!esvacia()){
			elem=v[tope];
			tope--;
		}
		else
			System.out.println("Pila vacia");
		return (elem);
	}
	void llenar(int n) {
		int i;
		for(i=0; i<n;i++) {
			int x=Leer.datoInt();
			adicionar(x);
		}
	}
	
	void mostrar()
	{
		System.out.println("Datos de la Pila:");
		PilaNumeros aux=new PilaNumeros();
		while(!esvacia()) {
			int elem= eliminar();
			System.out.println(elem);
			aux.adicionar(elem);
		}
		vaciar(aux);
	}
	void vaciar(PilaNumeros x) {
		while(!x.esvacia())
			adicionar(x.eliminar());
	}
	
	void pares()
	{
		PilaNumeros aux = new PilaNumeros();
		PilaNumeros aux2= new PilaNumeros();
		int par;
		while(!esvacia())
		{
			par=eliminar();
			if(par%2==0)
			aux.adicionar(par);
			else
			aux2.adicionar(par);
		}
		vaciar(aux2);
		vaciar(aux);
	}
	void impares(int x)
	{
		PilaNumeros aux = new PilaNumeros();
		PilaNumeros aux2 = new PilaNumeros();
		int impar;
		int cont=0;
		while(!esvacia())
		{
			impar=eliminar();
			if(cont!=x&&impar%2!=0) {
				cont++;
				aux.adicionar(impar);
			}
			else
				aux2.adicionar(impar);
		}
		vaciar(aux2);
	}

	public void contar() {
		// TODO Auto-generated method stub
		PilaNumeros aux = new PilaNumeros();
		PilaNumeros rst = new PilaNumeros();
		int num1,num2, cont=0;
		while(!esvacia()) {
			num1=eliminar();
			rst.adicionar(num1);
			while(!esvacia()) {
				num2=eliminar();
				if(num2==num1) {
					cont++;
					rst.adicionar(num2);
				}else {
					aux.adicionar(num2);
				}
			}
			vaciar(aux);
		}
		vaciar(rst);
		System.out.println("Numeros repetidos: "+cont);
	}
	void invertir ()
    {
	PilaNumeros a = new PilaNumeros ();
	PilaNumeros b = new PilaNumeros ();
	while (!esvacia ())
	    a.adicionar (a.eliminar ());
	while (!a.esvacia ())
	    b.adicionar (a.eliminar ());
	while (!b.esvacia ())
	    adicionar (b.eliminar ());
    }
	void ascendente() {
		PilaNumeros a = new PilaNumeros ();
		PilaNumeros b = new PilaNumeros ();
		int m, elem;
		while (!esvacia ())
		{
		    m = eliminar ();

		    while (!esvacia ())
		    {
			elem = eliminar ();
			if (m < elem)
			{
			    a.adicionar (m);
			    m = elem;
			}
			else
			    a.adicionar (elem);
		    }
		    b.adicionar (m);
		    while (!a.esvacia ())
			adicionar (a.eliminar ());

		}
		while (!b.esvacia ())
		    adicionar (b.eliminar ());
	}
	void descendente() {
		PilaNumeros a = new PilaNumeros ();
		PilaNumeros b = new PilaNumeros ();
		int m, elem;
		while (!esvacia ())
		{
			m = eliminar ();
			
			while (!esvacia ())
			{
				elem = eliminar ();
				if (m > elem)
				{
					a.adicionar (m);
					m = elem;
				}
				else
					a.adicionar (elem);
			}
			b.adicionar (m);
			while (!a.esvacia ())
				adicionar (a.eliminar ());
			
		}
		while (!b.esvacia ())
			adicionar (b.eliminar ());
	}
}
