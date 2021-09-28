package ListaSimple1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LSimpleD A=new LSimpleD();
		A.adifinal("ANA", 2);
		A.adifinal("LUIS", 1);
		A.adifinal("JUAN", 1);
		A.adifinal("MARIA", 2);
		System.out.println("\nLISTA DE DUEÑOS");
		A.mostrar();
		LSimpleM B=new LSimpleM();
		Mascota m1=new Mascota("toto","perro",2);
		Mascota m2=new Mascota("niki","perro",8);
		Mascota m3=new Mascota("pelusa","gato",5);
		Mascota m4=new Mascota("tito","loro",1);
		Mascota m5=new Mascota("kiti","loro",4);
		Mascota m6=new Mascota("lulu","tortuga",10);
		System.out.println("\nLISTA DE MASCOTAS");
		B.adifinal(m1);
		B.adifinal(m2);
		B.adifinal(m3);
		B.adifinal(m4);
		B.adifinal(m5);
		B.adifinal(m6);
		B.mostrar();
		
	}

}
