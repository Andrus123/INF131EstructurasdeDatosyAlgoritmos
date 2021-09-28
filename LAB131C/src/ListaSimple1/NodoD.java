package ListaSimple1;

public class NodoD {
	private String nom;
	private int nroMascotas;
	private NodoD sig;
	
	NodoD(){
		sig=null;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNroMascotas() {
		return nroMascotas;
	}

	public void setNroMascotas(int nroMascotas) {
		this.nroMascotas = nroMascotas;
	}

	public NodoD getSig() {
		return sig;
	}

	public void setSig(NodoD sig) {
		this.sig = sig;
	}
	
}
