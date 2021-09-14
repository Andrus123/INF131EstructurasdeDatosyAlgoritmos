package Defensa1;

public class RangoModelo {
	private int idRango;
	private String nomRango;
	public RangoModelo(int idRango, String nomRango) {
		super();
		this.idRango = idRango;
		this.nomRango = nomRango;
	}
	public RangoModelo() {
		super();
	}
	public int getIdRango() {
		return idRango;
	}
	public void setIdRango(int idRango) {
		this.idRango = idRango;
	}
	public String getNomRango() {
		return nomRango;
	}
	public void setNomRango(String nomRango) {
		this.nomRango = nomRango;
	}
	@Override
	public String toString() {
		return "RangoModelo [idRango=" + idRango + ", nomRango=" + nomRango + "]";
	}
	public void leer() {
		idRango=Leer.datoInt();
		nomRango=Leer.dato();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
