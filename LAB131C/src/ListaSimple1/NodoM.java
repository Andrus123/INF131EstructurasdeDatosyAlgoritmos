package ListaSimple1;

public class NodoM {
	private Mascota m; //variable objeto
	private NodoM sig;
	
	NodoM(){
		sig=null;
	}

	public Mascota getM() {
		return m;
	}

	public void setM(Mascota m) {
		this.m = m;
	}

	public NodoM getSig() {
		return sig;
	}

	public void setSig(NodoM sig) {
		this.sig = sig;
	}
	
	
}
