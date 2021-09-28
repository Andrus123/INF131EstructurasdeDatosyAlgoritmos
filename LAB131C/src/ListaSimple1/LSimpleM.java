package ListaSimple1;

public class LSimpleM {
	private NodoM p;
	LSimpleM()
	{
		p=null;
	}
	public NodoM getP() {
		return p;
	}
	public void setP(NodoM p) {
		this.p = p;
	}
	public void adifinal(Mascota a) {
		NodoM nue = new NodoM();
		nue.setM(a);
		
		if(getP()==null)
			setP(nue);
		else {
			NodoM r=getP();
			while(r.getSig()!=null)
				r=r.getSig();
			r.setSig(nue);
		}
	}
	public void mostrar() {
		NodoM u=getP();
		while(u!=null) {
			u.getM().mostrar();
			u=u.getSig();
		}
	}
}
