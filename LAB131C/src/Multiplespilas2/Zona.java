package Multiplespilas2;

public class Zona {
	private String nomzon, idzona;
	public Zona() {
		super();
	}
	public Zona(String nomzon, String idzona) {
		super();
		this.nomzon = nomzon;
		this.idzona = idzona;
	}
	public String getNomzon() {
		return nomzon;
	}
	public void setNomzon(String nomzon) {
		this.nomzon = nomzon;
	}
	public String getIdzona() {
		return idzona;
	}
	public void setIdzona(String idzona) {
		this.idzona = idzona;
	}
	@Override
	public String toString() {
		return "Zona [nomzon=" + nomzon + ", idzona=" + idzona + "]";
	}
	public void leer() {
		nomzon=Leer.dato();
		idzona=Leer.dato();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
