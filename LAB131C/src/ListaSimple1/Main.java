package ListaSimple1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LSimpleD A=new LSimpleD();
		A.adifinal("ANA", 2);
		A.adifinal("LUIS", 1);
		A.adifinal("JUAN", 2);
		A.adifinal("MARIA", 2);
		System.out.println("\nLISTA DE DUEÑOS");
		A.mostrar();
		LSimpleM B=new LSimpleM();
		Mascota m1=new Mascota("toto","perro",2);
		Mascota m2=new Mascota("niki","perro",8);
		Mascota m3=new Mascota("pelusa","gato",5);
		Mascota m4=new Mascota("tito","loro",1);
		Mascota m5=new Mascota("tuto","loro",2);
		Mascota m6=new Mascota("kiti","loro",4);
		Mascota m7=new Mascota("lulu","tortuga",10);
		System.out.println("\nLISTA DE MASCOTAS");
		B.adifinal(m1);
		B.adifinal(m2);
		B.adifinal(m3);
		B.adifinal(m4);
		B.adifinal(m5);
		B.adifinal(m6);
		B.adifinal(m7);
		B.mostrar();
		//mostrar a cada dueño con sus mascotas
		sol1(A,B);
	}

	private static void sol1(LSimpleD a, LSimpleM b) {
		// TODO Auto-generated method stub
		NodoD r1=a.getP();
		NodoM r2=b.getP();
		while(r1!=null)
		{
			System.out.println("\nDUEÑO:  ["+r1.getNom()+" "+r1.getNroMascotas()+"]");
			for(int i=1; i<=r1.getNroMascotas();i++)
			{
				r2.getM().mostrar();
				r2=r2.getSig();
			}
			r1=r1.getSig();
		}
	}

}
