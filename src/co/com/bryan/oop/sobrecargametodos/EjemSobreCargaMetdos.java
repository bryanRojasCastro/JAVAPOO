package co.com.bryan.oop.sobrecargametodos;

public class EjemSobreCargaMetdos {
	//SOBRECARGA METODOS
	public void sumarInts(int a, int b){
		System.out.println("metodo suma ints");
	}
	
	public void sumarDoubles(double a, double b){
		System.out.println("metodo suma Doubles");
	}
	
	public void sumar(){
		System.out.println("metodo suma");
	}
	// sobre carga metodos son: metodos con el mismo nombre pero con diferente cantidad de params
	public void sumar(int a){
		System.out.println("metodo suma sobrecaarg");
	}
	
	
}
