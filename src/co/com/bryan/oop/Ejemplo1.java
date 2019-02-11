package co.com.bryan.oop;

public class Ejemplo1 {
	
	// progrmacion oreinetada a objeto para operaciones basica
	
	private int numeroA = 2;
	private int numberoB = 2;
	
	
	
	private int returnSumaAB(){
		return this.numeroA + this.numberoB ;
	}
	

	public static void main(String[] args) {
		
		Ejemplo1 insOB = new Ejemplo1();
		System.out.println(insOB.returnSumaAB());

	}

}
