package FeriaAlasita;

public class Puesto {
	private int idArea,idSector,idPuesto;
	private String nomExpositor;
	private PilaProducto b=new PilaProducto();

	public Puesto() {
		// TODO Auto-generated constructor stub
	}

	public int getIdArea() {
		return idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	public int getIdSector() {
		return idSector;
	}

	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}

	public int getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(int idPuesto) {
		this.idPuesto = idPuesto;
	}

	public String getNomExpositor() {
		return nomExpositor;
	}

	public void setNomExpositor(String nomExpositor) {
		this.nomExpositor = nomExpositor;
	}

	public PilaProducto getB() {
		return b;
	}

	public void setB(PilaProducto b) {
		this.b = b;
	}
	public void leer() {
		idArea=Leer.datoInt();
		idSector=Leer.datoInt();
		idPuesto=Leer.datoInt();
		nomExpositor=Leer.dato();
		b.llenar(Leer.datoInt());
	}
	public void mostrar() {
		System.out.println(idArea+" "+idSector+" "+idPuesto+""+" "+nomExpositor);
		b.mostrar();
	}

}
