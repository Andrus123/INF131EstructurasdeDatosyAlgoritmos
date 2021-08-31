package Clase1Martes;
import java.util.*;

public class Clase1Martes {
	 /** Probando Git en Eclipse
     * @param args the command line arguments
     */
	public static void llenar(Vector<String> v, int n)
	{
		for (int i = 1; i <= n; i++)
			v.add(Leer.dato());
	}
	public static void main(String[] args) {
		//TODO code application logic here
		Vector<String> v1=new Vector<String>();
		
		llenar(v1,Leer.datoInt());
		System.out.println(v1+" Nro. Elementos "+v1.size()+" Primero : "+v1.firstElement()+" ultimo: "+v1.lastElement());
		if(v1.contains(Leer.dato()))
			System.out.println("SIIIII");
		else
			System.out.println("noooo");
		// insertar un nuevo elemento antes del ultimo
		// eliminar el primer elemento
		
		Vector<Persona> v2=new Vector<Persona>();
		llenarP(v2,Leer.datoInt());
		for(int i=0; i<v2.size(); i++)
			v2.get(i).mostrar();
	}
	public static void llenarP(Vector<Persona> v, int n)
	{
		for(int i=1;i<=n; i++)
		{
			Persona a=new Persona();
			a.leer();
			v.add(a);
		}
	}
}
