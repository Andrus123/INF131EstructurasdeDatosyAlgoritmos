package Ejercicio2;

public class Cliente {
	private String nombre;
	private int ci, edad;
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre, int ci, int edad) {
		super();
		this.nombre = nombre;
		this.ci = ci;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", ci=" + ci + ", edad=" + edad + "]";
	}
	void mostrar() {
		System.out.println(toString());
	}
	void leer() {
		nombre=Leer.dato();
		ci=Leer.datoInt();
		edad=Leer.datoInt();
	}
}
