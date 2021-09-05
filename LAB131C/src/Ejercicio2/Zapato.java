package Ejercicio2;

public class Zapato {
	private String codzapat,marca;
	private int precio, stock;
	public Zapato() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Zapato(String codzapat, String marca, int precio, int stock) {
		super();
		this.codzapat = codzapat;
		this.marca = marca;
		this.precio = precio;
		this.stock = stock;
	}
	public String getCodzapat() {
		return codzapat;
	}
	public void setCodzapat(String codzapat) {
		this.codzapat = codzapat;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Zapato [codzapat=" + codzapat + ", marca=" + marca + ", precio=" + precio + ", stock=" + stock + "]";
	}
	void mostrar() {
		System.out.println(toString());
	}
	void leer() {
		codzapat=Leer.dato();
		marca=Leer.dato();
		precio=Leer.datoInt();
		stock=Leer.datoInt();
	}
	
}
