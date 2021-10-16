package ListaSimple;

public class LSimpleM {
	private NodoM p;
	LSimpleM(){
		p=null;
	}
	public NodoM getP() {
		return p;
	}
	public void setP(NodoM p) {
		this.p = p;
	}
	public void adifinal(String a, String b, String c, String d) {
		NodoM nue = new NodoM();
		nue.setIdMuseo(a);
		nue.setNombre(b);
		nue.setZona(c);
		nue.setDireccion(d);
		
		if(getP()==null)
			setP(nue);
		else {
			NodoM h=getP();
			while(h.getSig()!=null)
				h=h.getSig();
			h.setSig(nue);
		}
	}
	public void mostrar() {
		NodoM n=getP();
		while(n!=null) 
		{
			System.out.println("<"+n.getIdMuseo()+" "+n.getNombre()+" "+n.getZona()+" "+n.getDireccion()+">");
			n=n.getSig();
		}
	}
}
