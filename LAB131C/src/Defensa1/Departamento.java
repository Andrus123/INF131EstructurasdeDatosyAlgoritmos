package Defensa1;

public class Departamento {
	private String nombre;
	private PilaTipoVehiculo idTipo= new PilaTipoVehiculo();
	private PilaRangoModelo idRango=new PilaRangoModelo();
	private int nroVehiculos;
	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departamento(String nombre, PilaTipoVehiculo idTipo, PilaRangoModelo idRango, int nroVehiculos) {
		super();
		this.nombre = nombre;
		this.idTipo = idTipo;
		this.idRango = idRango;
		this.nroVehiculos = nroVehiculos;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public PilaTipoVehiculo getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(PilaTipoVehiculo idTipo) {
		this.idTipo = idTipo;
	}

	public PilaRangoModelo getIdRango() {
		return idRango;
	}

	public void setIdRango(PilaRangoModelo idRango) {
		this.idRango = idRango;
	}

	public int getNroVehiculos() {
		return nroVehiculos;
	}

	public void setNroVehiculos(int nroVehiculos) {
		this.nroVehiculos = nroVehiculos;
	}
	
	public void leer() {
		nombre=Leer.dato();
		idTipo.llenar(Leer.datoInt());
		idRango.llenar(Leer.datoInt());
		nroVehiculos=Leer.datoInt();
	}
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", nroVehiculos=" + nroVehiculos + "]";
	}
	public void mostrar() {
		System.out.println(toString());
		idTipo.mostrar();
		idRango.mostrar();
	}
}
