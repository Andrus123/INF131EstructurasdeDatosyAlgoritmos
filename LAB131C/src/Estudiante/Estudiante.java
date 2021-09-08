package Estudiante;

public class Estudiante {
	private String nom, apP, apM, carrera;
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getApM() {
		return apM;
	}
	public void setApM(String apM) {
		this.apM = apM;
	}
	public String getApP() {
		return apP;
	}
	public void setApP(String apP) {
		this.apP = apP;
	}
	
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public void leer() {
		System.out.println("Estudiante:");
		nom=Leer.dato();
		apP=Leer.dato();
		apM=Leer.dato();
	}

	@Override
	public String toString() {
		return "Estudiante [nom=" + nom + ", apP=" + apP + ", apM=" + apM + ", carrera=" + carrera + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}

}
