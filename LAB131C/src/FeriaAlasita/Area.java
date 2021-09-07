package FeriaAlasita;

public class Area {
	private int idArea;
	private String nomArea;
	private PilaId a = new PilaId();

	public Area() {
		// TODO Auto-generated constructor stub
	}

	public int getIdArea() {
		return idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	public String getNomArea() {
		return nomArea;
	}

	public void setNomArea(String nomArea) {
		this.nomArea = nomArea;
	}

	public PilaId getA() {
		return a;
	}

	public void setA(PilaId a) {
		this.a = a;
	}
	public void leer() {
		idArea=Leer.datoInt();
		nomArea=Leer.dato();
		a.llenar(Leer.datoInt());
	}
	public void mostrar() {
		System.out.println(idArea+" "+nomArea);
		a.mostrar();
	}
}
