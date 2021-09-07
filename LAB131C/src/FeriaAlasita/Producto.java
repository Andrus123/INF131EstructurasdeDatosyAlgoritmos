package FeriaAlasita;

public class Producto {
	private String nombre;
	private int precio;
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void leer()
	{
		nombre=Leer.dato();
		precio=Leer.datoInt();
	}
	public void mostrar()
	{
		System.out.println(nombre+" "+precio);
	}

}
