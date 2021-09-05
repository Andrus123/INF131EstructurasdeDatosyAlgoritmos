package Ejercicio1;

public class Estudiante {
	private String nom,pat,mat;
	private int ci;
	public Estudiante() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Estudiante(int ci, String nom, String pat, String mat) {
		super();
		this.ci = ci;
		this.nom = nom;
		this.pat = pat;
		this.mat = mat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPat() {
		return pat;
	}
	public void setPat(String pat) {
		this.pat = pat;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	@Override
	public String toString() {
		return "Estudiante [nom=" + nom + ", pat=" + pat + ", mat=" + mat + ", ci=" + ci + "]";
	}
	void mostrar() {
		System.out.println(toString());
	}
	void leer() {
		nom=Leer.dato();
		pat=Leer.dato();
		mat=Leer.dato();
		ci=Leer.datoInt();
	}

}
