package ListaSimple1;

public class LSimpleD {
	private NodoD p; // variable objecto
	LSimpleD()
	{
		p=null;
	}
	public NodoD getP() {
		return p;
	}
	public void setP(NodoD p) {
		this.p = p;
	}
	public void adifinal(String a, int b) {
		NodoD nue = new NodoD();
		nue.setNom(a);
		nue.setNroMascotas(b);
		
		if(getP()==null)
			setP(nue);
		else {
			NodoD r=getP();
			while(r.getSig()!=null)
				r=r.getSig();
			r.setSig(nue);
		}
	}
	public void mostrar() {
		NodoD u=getP();
		while(u!=null) {
			System.out.println(" ["+u.getNom()+" "+u.getNroMascotas()+ "]");
			u=u.getSig();
		}
	}
	
}
