package Multiplespilas3;

public class Pasajero {
	private int ci;
	private String nombre,observacion;
	public Pasajero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pasajero(int ci, String nombre, String observacion) {
		super();
		this.ci = ci;
		this.nombre = nombre;
		this.observacion = observacion;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	@Override
	public String toString() {
		return "Pasajero [ci=" + ci + ", nombre=" + nombre + ", observacion=" + observacion + "]";
	}
	public void leer() {
		ci=Leer.datoInt();
		nombre=Leer.dato();
		observacion=Leer.dato();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
