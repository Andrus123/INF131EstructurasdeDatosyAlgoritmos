package ListaSimple;

public class NodoM {
	private String idMuseo, nombre,zona,direccion;
	private NodoM sig;
	
	NodoM()
	{
		sig=null;
	}

	public String getIdMuseo() {
		return idMuseo;
	}

	public void setIdMuseo(String idMuseo) {
		this.idMuseo = idMuseo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public NodoM getSig() {
		return sig;
	}

	public void setSig(NodoM sig) {
		this.sig = sig;
	}
	
}
