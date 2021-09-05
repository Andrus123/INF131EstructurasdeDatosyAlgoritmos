package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaClientes pc=new PilaClientes();
		pc.llenar();
		pc.mostrar();
		PilaVentas pv=new PilaVentas();
		pv.llenar();
		pv.mostrar();
		PilaZapatos pz=new PilaZapatos();
		pz.llenar();
		pz.mostrar();
		//a. Mostrar a los clientes que compraron más productos
		SolucionA(pc,pv);
		//b. Mostrar el monto total vendido a cada cliente
		SolucionB(pc,pv,pz);
	}
	private static void SolucionA(PilaClientes pc, PilaVentas pv) {
		PilaClientes auxpc=new PilaClientes();
		while(!pc.esvacia()) {
			Cliente x=pc.eliminar();
			System.out.println("Cliente: "+x.getNombre()+" cantidad: "+ContarCalzadosCliente(x.getCi(),pv));
			auxpc.adicionar(x);
		}
		pc.vaciar(auxpc);
	}
	private static int ContarCalzadosCliente(int ci, PilaVentas pv) {
		int cant = 0;
		PilaVentas auxpv= new PilaVentas();
		while(!pv.esvacia()) {
			Venta x=pv.eliminar();
			if(x.getCi()==ci)
				cant = x.getCantidad();
			auxpv.adicionar(x);
		}
		pv.vaciar(auxpv);
		return cant;
	}
	private static void SolucionB(PilaClientes pc, PilaVentas pv, PilaZapatos pz) {
		PilaClientes auxpc=new PilaClientes();
		while(!pc.esvacia()) {
			Cliente x=pc.eliminar();
			System.out.println("Cliente: "+x.getNombre()+" total comprado:"+Totalvendido(x.getCi(),pv,pz));
			auxpc.adicionar(x);
		}
		pc.vaciar(auxpc);
	}
	private static int Totalvendido(int ci, PilaVentas pv, PilaZapatos pz) {
		int total=0;
		PilaVentas auxpv= new PilaVentas();
		while(!pv.esvacia()) {
			Venta x=pv.eliminar();
			if(x.getCi()==ci)
				total = PrecioxCantidad(x.getCodzapat(),x.getCantidad(),pz);
			auxpv.adicionar(x);
		}
		pv.vaciar(auxpv);
		return total;
	}
	private static int PrecioxCantidad(String cod,int cant, PilaZapatos pz) {
		int total=0;
		PilaZapatos auxpz=new PilaZapatos();
		while(!pz.esvacia()) {
			Zapato x=pz.eliminar();
			if(x.getCodzapat().equals(cod))
				total = x.getPrecio()*cant;
				auxpz.adicionar(x);
		}
		pz.vaciar(auxpz);
		return total;
	}
}
