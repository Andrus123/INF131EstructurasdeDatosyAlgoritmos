package Multiplespilas2;

public class Temperatura {
	private String idzona;
	private int dia, temperatura, precipitación;
	public Temperatura() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Temperatura(String idzona, int dia, int temperatura, int precipitación) {
		super();
		this.idzona = idzona;
		this.dia = dia;
		this.temperatura = temperatura;
		this.precipitación = precipitación;
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
	public int getPrecipitación() {
		return precipitación;
	}
	public void setPrecipitación(int precipitación) {
		this.precipitación = precipitación;
	}
	@Override
	public String toString() {
		return "Temperatura [idzona=" + idzona + ", dia=" + dia + ", temperatura=" + temperatura + ", precipitación="
				+ precipitación + "]";
	}
	public void leer() {
		idzona=Leer.dato();
		dia=Leer.datoInt();
		temperatura=Leer.datoInt();
		precipitación=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
