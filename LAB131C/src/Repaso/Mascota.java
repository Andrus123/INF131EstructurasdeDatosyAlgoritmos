package Repaso;

public class Mascota {
	private String nombre;
    private String tipo;

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
    public void leer()
    {
        nombre=Leer.dato();
        tipo=Leer.dato();
    }
    public void mostrar()
    {
        System.out.print(" ["+nombre+", "+tipo+"]");
    }
}
