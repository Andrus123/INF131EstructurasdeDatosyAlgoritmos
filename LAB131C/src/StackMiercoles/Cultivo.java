package StackMiercoles;

import Repaso.Leer;

public class Cultivo {
	private String nomProducto;
	private int superficie, produccion;
	
	public String getNomProducto() {
		return nomProducto;
	}
	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public int getProduccion() {
		return produccion;
	}
	public void setProduccion(int produccion) {
		this.produccion = produccion;
	}
	public void leer()
	{
		nomProducto=Leer.dato();
		superficie=Leer.datoInt();
		produccion=Leer.datoInt();
	}
	public void mostrar()
	{
		System.out.println("<"+nomProducto+" "+superficie+" "+produccion+">");   
	}
}
