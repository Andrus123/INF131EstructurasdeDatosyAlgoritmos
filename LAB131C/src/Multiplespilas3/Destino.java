package Multiplespilas3;

public class Destino {
	private String codDes,origen,destino, fechaPartida, hraSalida;
	private int hora,costo;
	public Destino() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Destino(String codDes, String origen, String destino, String fechaPartida, String hraSalida, int hora,
			int costo) {
		super();
		this.codDes = codDes;
		this.origen = origen;
		this.destino = destino;
		this.fechaPartida = fechaPartida;
		this.hraSalida = hraSalida;
		this.hora = hora;
		this.costo = costo;
	}
	public String getCodDes() {
		return codDes;
	}
	public void setCodDes(String codDes) {
		this.codDes = codDes;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getFechaPartida() {
		return fechaPartida;
	}
	public void setFechaPartida(String fechaPartida) {
		this.fechaPartida = fechaPartida;
	}
	public String getHraSalida() {
		return hraSalida;
	}
	public void setHraSalida(String hraSalida) {
		this.hraSalida = hraSalida;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	@Override
	public String toString() {
		return "Destino [codDes=" + codDes + ", origen=" + origen + ", destino=" + destino + ", fechaPartida="
				+ fechaPartida + ", hraSalida=" + hraSalida + ", hora=" + hora + ", costo=" + costo + "]";
	}
	public void leer() {
		codDes=Leer.dato();
		origen=Leer.dato();
		destino=Leer.dato();
		hora=Leer.datoInt();
		costo=Leer.datoInt();
		fechaPartida=Leer.dato();
		hraSalida=Leer.dato();
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
