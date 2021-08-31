package Clase1Martes;

public class Persona {
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void leer() {
		nombre=Leer.dato();
		edad=Leer.datoInt();
	}
	public void mostrar()
	{
		System.out.println(nombre+" "+edad);
	}
}
