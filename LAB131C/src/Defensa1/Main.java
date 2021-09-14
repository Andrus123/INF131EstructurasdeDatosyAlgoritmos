package Defensa1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a.- Crear, leer datos, y mostrar
		Multicola c1 = new Multicola();
		c1.llenar();
		c1.mostrar(1);
		c1.mostrar(2);
		//b.- Del Departamento X, mostrar cada nomRango y número de vehiculos
		// del año 1 y del tipo Vehiculo con nomTipo z
		System.out.println("A)");
		SolucionA(c1);
	}

	private static void SolucionA(Multicola c1) {
		// TODO Auto-generated method stub
		Multicola aux= new Multicola();
			Departamento x=c1.eliminar(1);
			PilaRangoModelo r=new PilaRangoModelo();
			r=x.getIdRango();
			System.out.println("Vehiculos de año 1:"+x.getNroVehiculos());
			r.mostrar();
	}
}
