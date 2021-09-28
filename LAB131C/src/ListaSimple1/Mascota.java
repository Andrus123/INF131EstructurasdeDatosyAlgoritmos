package ListaSimple1;

public class Mascota {
	private String nombre,tipo;
	private int edad;
	
	Mascota(){
	}
	Mascota(String a, String b, int c){
		nombre=a;
		tipo=b;
		edad=c;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrar() {
		System.out.println("<"+nombre+" "+tipo+" "+edad+">");
	}
}
