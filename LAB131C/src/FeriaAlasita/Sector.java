package FeriaAlasita;

import Repaso.Leer;

public class Sector {
	private int idSector;
	private String nomSector;
	
	public Sector() {
		// TODO Auto-generated constructor stub
	}

	public int getIdSector() {
		return idSector;
	}

	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}

	public String getNomSector() {
		return nomSector;
	}

	public void setNomSector(String nomSector) {
		this.nomSector = nomSector;
	}
	public void leer() {
		idSector = Leer.datoInt();
		nomSector = Leer.dato();
	}

	@Override
	public String toString() {
		return "Sector [idSector=" + idSector + ", nomSector=" + nomSector + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}

}
