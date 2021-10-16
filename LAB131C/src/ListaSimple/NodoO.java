package ListaSimple;

public class NodoO {
	private String idMuseo,nomObra,tipo,estilo,autor;
	private int anio;
	private NodoO sig;
	
	public NodoO() {
		sig=null;
	}

	public String getIdMuseo() {
		return idMuseo;
	}

	public void setIdMuseo(String idMuseo) {
		this.idMuseo = idMuseo;
	}

	public String getNomObra() {
		return nomObra;
	}

	public void setNomObra(String nomObra) {
		this.nomObra = nomObra;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public NodoO getSig() {
		return sig;
	}

	public void setSig(NodoO sig) {
		this.sig = sig;
	}
	
}
