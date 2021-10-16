package ListaSimple;

public class LSimpleO {
	private NodoO p;
	LSimpleO(){
		p=null;
	}
	public NodoO getP() {
		return p;
	}
	public void setP(NodoO p) {
		this.p = p;
	}
	public void adifinal(String a, String b, String c, String d,String e, int f) {
		NodoO nue = new NodoO();
		nue.setIdMuseo(a);
		nue.setNomObra(b);
		nue.setTipo(c);
		nue.setEstilo(d);
		nue.setAutor(e);
		nue.setAnio(f);
		
		if(getP()==null)
			setP(nue);
		else {
			NodoO h=getP();
			while(h.getSig()!=null)
				h=h.getSig();
			h.setSig(nue);
		}
	}
	public void mostrar() {
		NodoO n=getP();
		while(n!=null) 
		{
			System.out.println("<"+n.getIdMuseo()+" "+n.getNomObra()+" "+n.getTipo()+" "+n.getEstilo()+
					n.getAutor()+" "+n.getAnio()+">");
			n=n.getSig();
		}
	}
}
