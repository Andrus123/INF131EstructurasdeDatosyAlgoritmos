package LinkedList;

public class Dueno {
	private String nombre;
	private int nroMascotas;
	Dueno(){
		
	}
	Dueno(String a, int b){
		nombre=a;
		nroMascotas=b;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNroMascotas() {
		return nroMascotas;
	}
	public void setNroMascotas(int nroMascotas) {
		this.nroMascotas = nroMascotas;
	}
	
	public void mostrar() {
		System.out.println("<"+nombre+" "+nroMascotas+">");
	}
}
