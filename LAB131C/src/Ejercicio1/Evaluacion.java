package Ejercicio1;

public class Evaluacion {
	private String tema;
	private int nota,ci;
	
	public Evaluacion() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Evaluacion(String tema, int nota, int ci) {
		super();
		this.tema = tema;
		this.nota = nota;
		this.ci = ci;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	@Override
	public String toString() {
		return "Evaluacion [tema=" + tema + ", nota=" + nota + ", ci=" + ci + "]";
	}
	void mostrar() {
		System.out.println(toString());
	}
	void leer() {
		tema=Leer.dato();
		nota=Leer.datoInt();
		ci=Leer.datoInt();
	}

}
