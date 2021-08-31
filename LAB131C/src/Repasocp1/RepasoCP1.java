package Repasocp1;
import java.util.*;

public class RepasoCP1 {
	//PROCEDIMIENTO FUNCIONES
    public static void llenado(Vector<String> a, int n)
    {
        for(int i=1;i<=n;i++)
            a.add(Leer.dato());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //VECTOR DE ELEMENTOS SIMPLES
        /*Vector v1=new Vector();
        Vector v2=new Vector();
        //llenar el vector con n elementos 
        int n=Leer.datoInt();
        llenado(v1,n);
        System.out.println(v1);
        llenado(v2,n/2);
        System.out.println(v2);*/
        //Mostrar los k primeros elementos de v1, si existe en un procedimiento
        //crear la clase Verdura (nombre, tipo, color) con metodos
               // getters, setters, leer y mostrar
        
        //int x=(int)v1.get(0);
        //System.out.print(v1.indexOf("hola")+" "+v1.isEmpty()+" "+v1.size()+" "+v1.lastElement());
        //VECTOR DE OBJETOS
        Vector<Verdura> ob=new Vector<Verdura>();
        int n=Leer.datoInt();
        llenar(ob,n);
        mostrar(ob);
        //Pares   1 insertar un nueva verdura en la i-esima posicion, si existe
        inserta(ob,Leer.datoInt());
        mostrar(ob);
        //Impares 2 eliminar la verdua de la i-esima posicion, si existe
       elimina(ob,Leer.datoInt());
        mostrar(ob);
        
    }
    //PROCEDIMIENTO FUNCIONES
    public static void llenar(Vector<Verdura> a,int n)
    {
        for(int i=1;i<=n;i++)
        {
            Verdura vx=new Verdura();
            vx.leer();
            a.add(vx);
        }
    }
    public static void mostrar(Vector<Verdura> a)
    {
        for(int i=0;i<a.size();i++)
            a.get(i).mostrar();
    }
    public static void inserta(Vector<Verdura> a, int i)
    {
        if(i<=a.size())
        {
            Verdura nue=new Verdura();
            nue.leer();
            a.insertElementAt(nue, i-1);
        }
        else System.out.print("no existe posicion");
    }
    public static void elimina(Vector<Verdura>a, int i)
    {
        if(i<=a.size())
             a.remove(i-1);
        else System.out.print("no existe posicion");
    }
}
