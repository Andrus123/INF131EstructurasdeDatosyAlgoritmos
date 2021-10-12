package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedMartes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Dueno> A = new LinkedList();
		LinkedList<Mascota> B= new LinkedList();
		ArrayList<Dueno> ArrayA = new ArrayList();
		ArrayList<Mascota> ArrayB = new ArrayList();
		Dueno d1=new Dueno("Ana",2);
		Dueno d2=new Dueno("Luis",1);
		Dueno d3=new Dueno("Juan",1);
		Dueno d4=new Dueno("Maria",2);
		A.add(d1);
		A.add(d2);
		A.add(d3);
		A.add(d4);
		System.out.println("\nLINKED LISTS:");
		mostrar(A);
		Mascota m1=new Mascota("Cokie","Perro",4);
		Mascota m2=new Mascota("Lorenzo","Perro",3);
		Mascota m3=new Mascota("Garfield","Gato",5);
		Mascota m4=new Mascota("Perico","Loro",6);
		Mascota m5=new Mascota("Jhon","Loro",7);
		Mascota m6=new Mascota("Carlos","Tortuga",3);
		B.add(m1);
		B.add(m2);
		B.add(m3);
		B.add(m4);
		B.add(m5);
		B.add(m6);
		mostrar2(B);
		// c. mostrar cada dueño con sus mascotas
		System.out.println("\nDUENOS Y MASCOTAS:");
		dueMas(A, B);
		// e. Mostrar al dueño X y sus mascotas
		System.out.println("\nDUENO ENCONTRADO:");
		dueXMas(A, B, "Juan");
		// Array List
		ArrayA.add(d1);
		ArrayA.add(d2);
		ArrayA.add(d3);
		ArrayA.add(d4);
		ArrayB.add(m1);
		ArrayB.add(m2);
		ArrayB.add(m3);
		ArrayB.add(m4);
		ArrayB.add(m5);		
		ArrayB.add(m6);
		// mostrar ArrayLists
		System.out.println("\nARRAY LISTS: ");
		msotrarDuenos(ArrayA);
		msotrarMascotas(ArrayB);
	}

	private static void msotrarDuenos(ArrayList<Dueno> arrayA) {
		// TODO Auto-generated method stub
		ListIterator<Dueno> r=arrayA.listIterator();
		while(r.hasNext()) {
			Dueno x=r.next();
			x.mostrar();
		}
	}

	private static void msotrarMascotas(ArrayList<Mascota> arrayB) {
		// TODO Auto-generated method stub
		ListIterator<Mascota> m=arrayB.listIterator();
		while(m.hasNext()) {
			Mascota x=m.next();
			x.mostrar();
		}
	}

	private static void dueXMas(LinkedList<Dueno> a, LinkedList<Mascota> b, String nombre) {
		// TODO Auto-generated method stub
		ListIterator<Dueno> r=a.listIterator();
		ListIterator<Mascota> r2=b.listIterator();
		while(r.hasNext()) {
			Dueno x=r.next();
			if(x.getNombre().equals(nombre)) {
			System.out.println(x.getNombre());
			for (int i = 1; i <= x.getNroMascotas(); i++) {
				Mascota mx=r2.next();
				System.out.println("\t"+mx.getNombre()+" "+mx.getTipo());
			}
		  }
		}
	}

	private static void mostrar2(LinkedList<Mascota> b) {
		// TODO Auto-generated method stub
		ListIterator<Mascota> m=b.listIterator();
		while(m.hasNext()) {
			Mascota x=m.next();
			x.mostrar();
		}
	}

	private static void mostrar(LinkedList<Dueno> a) {
		// TODO Auto-generated method stub
		ListIterator<Dueno> r=a.listIterator();
		while(r.hasNext()) {
			Dueno x=r.next();
			x.mostrar();
		}
	}
	public static void dueMas(LinkedList<Dueno> a, LinkedList<Mascota> b) {
		ListIterator<Dueno> r=a.listIterator();
		ListIterator<Mascota> r2=b.listIterator();
		while(r.hasNext()) {
			Dueno x=r.next();
			System.out.println(x.getNombre());
			for (int i = 1; i <= x.getNroMascotas(); i++) {
				Mascota mx=r2.next();
				System.out.println("\t"+mx.getNombre()+" "+mx.getTipo());
			}
		}
	}

}
