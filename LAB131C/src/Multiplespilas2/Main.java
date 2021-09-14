package Multiplespilas2;

public class Main {
	public static void main(String[] args) {
//		Sea una Cola de Zonas<nombre de zona, idzona> y una Múltiple Pila que
//		almacena las temperaturas <idzona, día, temperatura, precipitación>
//		registradas en un año, se pide:
		ColaSimpleZona z=new ColaSimpleZona();
		//z.llenar(Leer.datoInt());
		z.llenar();
		z.mostrar();
		MultiplePilaTemp t=new MultiplePilaTemp();
		//t.llenar(Leer.datoInt());
		t.llenar();
		t.mostrar();
		//a. Mostrar la fecha (mes y día) en que se presentó lluvia en la Zona de nombre
		//X (se presenta lluvia si es que la precipitación es mayor a 250).
		Solucion1(z,t,Leer.dato());
		//b. Verificar si en el mes de marzo se presentaron temperaturas bajo cero de la
		//Zona de nombre X, si es así se pide eliminar tanto la Zona como las
		//temperaturas de la misma.
		Solucion2(z,t,Leer.dato());
		//c. Mostrar el nombre de las zonas que presentaron lluvias.
		Solucion3(z,t);

	}

	private static void Solucion3(ColaSimpleZona z, MultiplePilaTemp t) {
		ColaSimpleZona aux=new ColaSimpleZona();
		while(!z.esvacia()) {
			Zona x=z.eliminar();
			if(VerificarLluvia(x.getIdzona(),t))
				System.out.println(x.getNomzon());
			aux.adicionar(x);
		}
		z.vaciar(aux);
	}

	private static boolean VerificarLluvia(String idzona, MultiplePilaTemp t) {
		boolean sw=false;
		PilaTemperatura aux=new PilaTemperatura();
		for (int i = 1; i <= t.getN(); i++) {
			while(!t.esvacia(i)) {
				Temperatura x=t.eliminar(i);
				if(x.getIdzona().equals(idzona) && x.getPrecipitación()>250)
					sw=true;
				aux.adicionar(x);
			}
			t.vaciar(i, aux);
		}
		return sw;
	}

	private static void Solucion2(ColaSimpleZona z, MultiplePilaTemp t, String nomzx) {
		String idZona=ObtenerId(z,nomzx);
		ColaSimpleZona aux=new ColaSimpleZona();
		if(VerificarTemperaturasBajoCeroZonaX(idZona,t,3)) {
			while(!z.esvacia()) {
				Zona x=z.eliminar();
				if(!x.getIdzona().equals(idZona))
					aux.adicionar(x);
			}
			z.vaciar(aux);
			EliminarTempetarutasZonaX(idZona,t);
		}
	}

	private static void EliminarTempetarutasZonaX(String idZona, MultiplePilaTemp t) {
		PilaTemperatura aux=new PilaTemperatura();
		for (int i =1; i <= t.getN(); i++) {
			while(!t.esvacia(i)) {
				Temperatura x=t.eliminar(i);
				if(!x.getIdzona().equals(idZona))
					aux.adicionar(x);
			}
			t.vaciar(i, aux);
		}
	}

	private static boolean VerificarTemperaturasBajoCeroZonaX(String idZona, MultiplePilaTemp t, int i) {
		boolean sw=false;
		PilaTemperatura aux=new PilaTemperatura();
		while(!t.esvacia(i)) {
			Temperatura x=t.eliminar(i);
			if(x.getIdzona().equals(idZona) && x.getTemperatura()<0)
				sw=true;
			aux.adicionar(x);
		}
		t.vaciar(i, aux);
		return sw;
	}

	private static void Solucion1(ColaSimpleZona z, MultiplePilaTemp t,String nomzx) {
		String idZona=ObtenerId(z,nomzx);
		PilaTemperatura aux=new PilaTemperatura();
		for (int i = 1; i <= t.getN(); i++) {
			while(!t.esvacia(i)) {
				Temperatura x=t.eliminar(i);
				if(x.getIdzona().equals(idZona) && x.getPrecipitación()>250)
					System.out.println(ObtenerMes(i)+", "+x.getDia());
				aux.adicionar(x);
			}
			t.vaciar(i, aux);
		}
	}

	private static String ObtenerId(ColaSimpleZona z, String nomzx) {
		String idZona=null;
		ColaSimpleZona aux=new ColaSimpleZona();
		while(!z.esvacia()) {
			Zona x=z.eliminar();
			if(x.getNomzon().equals(nomzx))
				idZona=x.getIdzona();
			aux.adicionar(x);
		}
		z.vaciar(aux);
		return idZona;
	}
	private static String ObtenerMes(int i) {
		if(i==1)
			return "Enero";
		if(i==2)
			return "Febrero";
		if(i==3)
			return "marzo";
		if(i==4)
			return "abril";
		if(i==5)
			return "mayo";
		if(i==6)
			return "junio";
		if(i==7)
			return "julio";
		if(i==8)
			return "agosto";
		if(i==9)
			return "septiembre";
		if(i==10)
			return "octubre";
		if(i==11)
			return "noviembre";
		if(i==12)
			return "diciembre";
		return null;
	}
}
