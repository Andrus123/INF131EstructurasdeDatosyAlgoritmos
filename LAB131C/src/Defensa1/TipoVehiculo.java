package Defensa1;

public class TipoVehiculo {
	private int idTipo;
	private String nomTipo;
	public TipoVehiculo(int idTipo, String nomTipo) {
		super();
		this.idTipo = idTipo;
		this.nomTipo = nomTipo;
	}
	public TipoVehiculo()
	{
		super();
	}
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	public String getNomTipo() {
		return nomTipo;
	}
	public void setNomTipo(String nomTipo) {
		this.nomTipo = nomTipo;
	}
	@Override
	public String toString() {
		return "TipoVehiculo [idTipo=" + idTipo + ", nomTipo=" + nomTipo + "]";
	}
	public void leer() {
		idTipo=Leer.datoInt();
		nomTipo=Leer.dato();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
