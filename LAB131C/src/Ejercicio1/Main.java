package Ejercicio1;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Sea una Pila de Estudiantes nom, pat, mat, ci> y una Pila de evaluaciones de
		//  los estudiantes <tema Evaluación, nota, ci>
		PilaEvaluaciones ev=new PilaEvaluaciones();
		ev.llenar();
		ev.mostrar();
		
		PilaEstudiante es=new PilaEstudiante();
		es.llenar();
		es.mostrar();
		//a. Agrupar las evaluaciones de la pila de evaluaciones de acuerdo al orden de
		//   los estudiantes en la Pila de Estudiantes.
		System.out.println("Evaluaciones Agrupadas:");
		SolucionA(ev,es);
		ev.mostrar();
		//b. Ordenar las evaluaciones de cada estudiante, de manera que se
		//   mantengan agrupadas.
		System.out.println("Evaluaciones Agrupadas");
		
	}
	private static void SolucionA(PilaEvaluaciones pe, PilaEstudiante pes) {
		PilaEvaluaciones auxv=new PilaEvaluaciones(), res=new PilaEvaluaciones();
		PilaEstudiante auxe=new PilaEstudiante();
		while(!pes.esvacia()) {
			Estudiante x=pes.eliminar();
			while(!pe.esvacia()) {
				Evaluacion y=pe.eliminar();
				if(y.getCi()==x.getCi())
					res.adicionar(y);
				else
					auxv.adicionar(y);
			}
			pe.vaciar(auxv);
			auxe.adicionar(x);
		}
		pes.vaciar(auxe);
		pe.vaciar(res);
	}
}
