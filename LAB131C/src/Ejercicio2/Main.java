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
		//c. Mostrar aquellos clientes que realizaron alguna compra en la fecha X
		SolucionC("3/9/2021",pc,pv);
	}
	private static void SolucionA(PilaClientes pc, PilaVentas pv) {
		int mayor = MayorCantidadZapatos(pc,pv);
		PilaClientes auxpc=new PilaClientes();
		while(!pc.esvacia()) {
			Cliente x=pc.eliminar();
			if(ContarCalzadosCliente(x.getCi(),pv)==mayor)
				System.out.println("Cliente con mayor compra: "
			+x.getNombre()+ " - "+mayor+" zapatos");
			auxpc.adicionar(x);
		}
		pc.vaciar(auxpc);
	}
	private static int MayorCantidadZapatos(PilaClientes pc, PilaVentas pv) {
		int mayor = 0;
		PilaClientes auxpc=new PilaClientes();
		while(!pc.esvacia()) {
			Cliente x=pc.eliminar();
			if(ContarCalzadosCliente(x.getCi(),pv)>mayor)
				mayor=ContarCalzadosCliente(x.getCi(),pv);
			auxpc.adicionar(x);
		}
		pc.vaciar(auxpc);
		return mayor;
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
	private static void SolucionC(String fecha,PilaClientes pc, PilaVentas pv) {
		// TODO Auto-generated method stub
		System.out.println("Clientes en fecha : "+fecha);
		PilaVentas auxpv=new PilaVentas();
		while(!pv.esvacia()) {
			Venta v=pv.eliminar();
			if(v.getFecha().equals(fecha))
				ClientesenFecha(v.getCi(),pc);
				auxpv.adicionar(v);
		}
		pv.vaciar(auxpv);
	}
	private static void ClientesenFecha(int ci, PilaClientes pc) {
		// TODO Auto-generated method stub
		PilaClientes auxpc=new PilaClientes();
		while(!pc.esvacia()) {
			Cliente c=pc.eliminar();
			if(c.getCi()==ci)
				c.mostrar();
				auxpc.adicionar(c);
		}
		pc.vaciar(auxpc);
	}
}
