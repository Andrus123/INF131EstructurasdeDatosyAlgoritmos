package Multiplespilas3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Para administrar la información de una empresa de buses, se establecen el
//		manejo de estructuras, las cuales son:
//		-Una Pila de Destinos, que almacena los diferentes destinos programados
//		en el año, cada destino tendrá un código de destino, un origen, un destino,
//		la hora de viaje, el costo, la fecha de partida y la hora de salida.
//		-Una Múltiple Cola Simple de Salidas, donde cada cola simple almacena
//		la información de las salidas de los buses, siendo los datos de cada salida
//		el código de destino, una Cola Circular de Pasajeros, los datos del
//		conductor 1 y los datos del conductor 2.
//		-Cola circular de pasajeros: Almacena el ci, nombre y una
//		observación de los pasajeros.
//		-Datos de los conductores: ci, nombre.
		PilaDestino d=new PilaDestino();
//		d.llenar(Leer.datoInt());
		d.llenar();
		d.mostrar();
		MultiCSimpleSalida s=new MultiCSimpleSalida();
//		s.llenar(Leer.datoInt());
		s.llenar();
		s.mostrar();
		
		//b. Mostrar las fechas en las cuales el conductor con ci X efectuó salidas.
		Solucion1(d,s,Leer.datoInt());
		//c. Colocar en la primera cola de la múltiple cola, todas las salidas al
		//destino X, distribuyendo el resto de las salidas de la primera cola al
		//resto de las colas.
		Solucion2(s,d,Leer.dato());
		s.mostrar();

	}

	private static void Solucion2(MultiCSimpleSalida s,PilaDestino d, String desx) {
		String codDest=ObtenerCodDestino(d,desx);
		CSimpleSalida aux1=new CSimpleSalida(),aux2=new CSimpleSalida(),aux3=new CSimpleSalida();
		while(!s.esvacia(1)) {
			Salida x=s.eliminar(1);
			if(x.getCodDes().equals(codDest))
				aux1.adicionar(x);
			else
				aux2.adicionar(x);
		}
		for (int i =2; i <= s.getN(); i++) {
			while(!s.esllena(i)) {
				Salida x=s.eliminar(i);
				if(x.getCodDes().equals(codDest))
					aux1.adicionar(x);
				else
					aux3.adicionar(x);
			}
			s.vaciar(i, aux3);
		}
		s.vaciar(1, aux1);
		int k=2;
		while(!aux2.esvacia()) {
			Salida x=aux2.eliminar();
			s.adicionar(k,x);
			k++;
			if(k==s.getN()+1)
				k=2;
		}
	}

	private static String ObtenerCodDestino(PilaDestino d, String desx) {
		String codDes=null;
		PilaDestino aux=new PilaDestino();
		while(!d.esvacia()) {
			Destino x=d.eliminar();
			if(x.getDestino().equals(desx))
				codDes=x.getCodDes();
			aux.adicionar(x);
		}
		d.vaciar(aux);
		return codDes;
	}

	private static void Solucion1(PilaDestino d, MultiCSimpleSalida s, int cix) {
		CSimpleSalida auxs=new CSimpleSalida();
		for (int i = 1; i <= s.getN(); i++) {
			while(!s.esvacia(i)) {
				Salida x=s.eliminar(i);
				if(x.getC1().getCi()==cix || x.getC2().getCi()==cix)
					BuscarFechaSalidaDestino(x.getCodDes(),d);
				auxs.adicionar(x);
			}
			s.vaciar(i, auxs);
		}
	}

	private static void BuscarFechaSalidaDestino(String codDes, PilaDestino d) {
		PilaDestino aux=new PilaDestino();
		while(!d.esvacia()) {
			Destino x=d.eliminar();
			if(x.getCodDes().equals(codDes))
				System.out.println(x.getFechaPartida());
			aux.adicionar(x);
		}
		d.vaciar(aux);
	}

}
