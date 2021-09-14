package Multiplespilas3;

public class Salida {
	private String codDes;
	private CCircularPasajero p=new CCircularPasajero();
	private Conductor c1=new Conductor(),c2=new Conductor();
	public Salida() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salida(String codDes, CCircularPasajero p, Conductor c1, Conductor c2) {
		super();
		this.codDes = codDes;
		this.p = p;
		this.c1 = c1;
		this.c2 = c2;
	}
	public String getCodDes() {
		return codDes;
	}
	public void setCodDes(String codDes) {
		this.codDes = codDes;
	}
	public CCircularPasajero getP() {
		return p;
	}
	public void setP(CCircularPasajero p) {
		this.p = p;
	}
	public Conductor getC1() {
		return c1;
	}
	public void setC1(Conductor c1) {
		this.c1 = c1;
	}
	public Conductor getC2() {
		return c2;
	}
	public void setC2(Conductor c2) {
		this.c2 = c2;
	}
	@Override
	public String toString() {
		return "Salida [codDes=" + codDes + "]";
	}
	public void leer() {
		codDes=Leer.dato();
		p.llenar(Leer.datoInt());
		c1.leer();
		c2.leer();
	}
	public void mostrar() {
		System.out.println(toString());
		p.mostrar();
		c1.mostrar();
		c2.mostrar();
	}
}
