package Ejercicio2;

public class Venta {
	private String codzapat,fecha;
	private int ci, cantidad;
	public Venta() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Venta(String codzapat, String fecha, int ci, int cantidad) {
		super();
		this.codzapat = codzapat;
		this.fecha = fecha;
		this.ci = ci;
		this.cantidad = cantidad;
	}
	public String getCodzapat() {
		return codzapat;
	}
	public void setCodzapat(String codzapat) {
		this.codzapat = codzapat;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Venta [codzapat=" + codzapat + ", fecha=" + fecha + ", ci=" + ci + ", cantidad=" + cantidad + "]";
	}
	void mostrar() {
		System.out.println(toString());
	}
	void leer() {
		codzapat=Leer.dato();
		fecha=Leer.dato();
		ci=Leer.datoInt();
		cantidad=Leer.datoInt();
	}
}
