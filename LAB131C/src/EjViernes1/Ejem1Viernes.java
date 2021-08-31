package EjViernes1;

import java.util.*;

public class Ejem1Viernes {
	/**
     * @param args the command line arguments
     */
    //PROCEDIMIENTOS/FUNCIONES
	public static void llenar(Vector<String> z, int n)
	{
		for(int i=1;i<=n;i++)
			z.add(Leer.dato());
	}
	public static void main(String[] args) {
		//TODO code application logic here
		Vector v=new Vector();
		
		llenar(v,Leer.datoInt());
		System.out.println(v);
		System.out.println(v.lastElement()+" "+v.size()+" "+v.elementAt(Leer.datoInt()));
		//1. insertar un nuevo elemento en la posicion i
		//2. verificar si existe el elemento x
		Vector<fraccion> w=new Vector<fraccion>();
		llenarF(w,Leer.datoInt());
		mostrarF(w);
	}
	//PROCEDIMIENTOS/FUNCIONES
	public static void llenarF(Vector<fraccion> a,int m)
	{
		for(int i=1;i<=m;i++)
		{
			fraccion f1=new fraccion();
			f1.leer();
			a.add(f1);
		}
	}
	public static void mostrarF(Vector<fraccion> b)
	{
		for(int i=0;i<b.size();i++)
			b.get(i).mostrar();
	}
}
