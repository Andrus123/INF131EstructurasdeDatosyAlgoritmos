package Repaso;
import java.util.*;


public class Ejercicio1 {
	
	/**
	 * @param args the command line arguments
	 */
	//procedimiento funciones
	public static void llenar(Vector<String> v, int n)
	{
		for (int i = 1; i <= n; i++) {
			v.add(Leer.dato());
		}
	}
	public static void main(String[] args) {
		// TODO code application logic here
		Vector<String> v1=new Vector<String>();
		
		int n= Leer.datoInt();
		llenar(v1,n);
		System.out.println(v1);
		System.out.println(v1.firstElement()+ " "+v1.lastElement()+" "+v1.elementAt(3));
		if(v1.contains("pelusa"))
            System.out.print("existe");
        else
            System.out.print("noooo existe");
        
        Vector<String> v2=new Vector<String>();
        llenar(v2,Leer.datoInt());
        System.out.println(v2);
        
        Vector<Mascota> v3=new Vector<Mascota>();
        llenado(v3,Leer.datoInt());
        mostrar(v3);
	}
	//procedimiento funciones
	public static void llenado(Vector<Mascota>v, int n)
	{
		for(int i=1;i<=n;i++)
        {
            Mascota m=new Mascota();
            m.leer();
            v.addElement(m);
        }
	}
	public static void mostrar(Vector<Mascota> v)
	{
		for(int i=0;i<v.size();i++)
            v.get(i).mostrar();
	}
}
