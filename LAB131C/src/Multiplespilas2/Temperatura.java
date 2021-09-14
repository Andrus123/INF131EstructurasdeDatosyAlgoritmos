package Multiplespilas2;

public class Temperatura {
	private String idzona;
	private int dia, temperatura, precipitaci�n;
	public Temperatura() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Temperatura(String idzona, int dia, int temperatura, int precipitaci�n) {
		super();
		this.idzona = idzona;
		this.dia = dia;
		this.temperatura = temperatura;
		this.precipitaci�n = precipitaci�n;
	}
	public String getIdzona() {
		return idzona;
	}
	public void setIdzona(String idzona) {
		this.idzona = idzona;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public int getPrecipitaci�n() {
		return precipitaci�n;
	}
	public void setPrecipitaci�n(int precipitaci�n) {
		this.precipitaci�n = precipitaci�n;
	}
	@Override
	public String toString() {
		return "Temperatura [idzona=" + idzona + ", dia=" + dia + ", temperatura=" + temperatura + ", precipitaci�n="
				+ precipitaci�n + "]";
	}
	public void leer() {
		idzona=Leer.dato();
		dia=Leer.datoInt();
		temperatura=Leer.datoInt();
		precipitaci�n=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
