package ListaSimple;

public class ListaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LSimpleM A = new LSimpleM();
		System.out.println("LISTA DE MUSEOS:");
		A.adifinal("M2", "AAAA", "SOPOCACHI", "AV. SANCHEZ LIMA");
		A.adifinal("M7", "BBBB", "SAN PEDRO", "PLAZA SAN PEDRO");
		A.adifinal("M4", "CCCC", "SOPOCACHI", "ROSENDIO GUTIERREZ");
		A.mostrar();
		LSimpleO B=new LSimpleO();
		System.out.println("\nLISTA DE OBRAS:");
		B.adifinal("M2", "titl1", "pintura", "est1", "autor1", 1990);
		B.adifinal("M2", "titl3", "escultura", "est1", "autor4", 1995);
		B.adifinal("M7", "titl2", "escultura", "est2", "autor1", 1996);
		B.adifinal("M4", "titl7", "pintura", "est5", "autor2", 1999);
		B.adifinal("M4", "titl9", "pintura", "est3", "autor4", 1991);
		B.adifinal("M7", "titl1", "pintura", "est1", "autor1", 1996);
		B.adifinal("M2", "titl1", "pintura", "est1", "autor1", 1987);
		B.mostrar();
		//c) En que museos se expone la obra con nomObra X del autor Y
		busca(A,B,"titl7","autor2");
		ordena(B);
		B.mostrar();
	}

	private static void ordena(LSimpleO b) {
		// TODO Auto-generated method stub
		LSimpleO Laux=new LSimpleO();
		while(b.getP()!=null)
		{
			NodoO w=b.getP();
			b.setP(w.getSig());
			w.setSig(null);
			
			if(Laux.getP()==null)
				Laux.setP(w);
			else {
				NodoO r=Laux.getP();
				NodoO q=r;
				while(w.getAnio()>r.getAnio() && r.getSig()!=null)
				{
					q=r;
					r=r.getSig();
				}
				if(r==Laux.getP())
				{
					w.setSig(Laux.getP());
					Laux.setP(w);
				}
				else {
					if(w.getAnio()>r.getAnio() && r.getSig()!=null)
						r.setSig(w);
					else {
						q.setSig(w);
						w.setSig(r);
					}
				}
			}
		}
		b.setP(Laux.getP());
	}

	private static void busca(LSimpleM a, LSimpleO b, String x, String y) {
		// TODO Auto-generated method stub
		NodoO w=b.getP();
		boolean sw=false;
		while(w!=null) {
			if(w.getNomObra().equals(x) && w.getAutor().equals(y))
			{
				String id=w.getIdMuseo();
				NodoM r=a.getP();
				while(r!=null) 
				{
					if(r.getIdMuseo().equals(id))
					{
						System.out.println("DATOS MUSEO:"+r.getNombre()+" "+r.getZona()+
								" "+r.getDireccion());
						sw=true;
					}
					r=r.getSig();
				}
				
			}
			w=w.getSig();
		}
		if(!sw)
			System.out.println("No existe ");
	}

}
