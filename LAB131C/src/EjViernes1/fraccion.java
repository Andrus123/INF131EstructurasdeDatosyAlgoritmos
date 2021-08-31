package EjViernes1;

public class fraccion {
	private int num,den;
	//getters setters
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getDen() {
		return den;
	}
	
	public void setDen(int den) {
		this.den = den;
	}
	
	public void leer() {
		num=Leer.datoInt();
		den=Leer.datoInt();
	}
	public void mostrar() {
		System.out.println(num+"/"+den+" ");
	}
}
