package Repasocp1;

public class Verdura {
	 private String nombre, tipo, color;

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

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }
	    public void leer()
	    {
	        nombre=Leer.dato();
	        tipo=Leer.dato();
	        color=Leer.dato();
	    }
	    public void mostrar()
	    {
	        System.out.print("["+nombre+", "+tipo+", "+color+"]");
	    }
}
