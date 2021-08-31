package EjStack;

public class Mueble {
	private int codigo;
	private String nombre,material,color;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void leer() {
		codigo=Leer.datoInt();
		nombre=Leer.dato();
		material=Leer.dato();
		color=Leer.dato();
	}
	public void mostrar() {
		System.out.println(codigo+" "+nombre+" "+material+", "+color);
	}
	
}
