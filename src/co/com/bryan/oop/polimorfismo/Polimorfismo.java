package co.com.bryan.oop.polimorfismo;

public class Polimorfismo  {

	/*
	 *  dadas las clase Animal, Perro ext Aniaml, Gato ext Animal
	 *  
	 * polimorfismo: objeto de un tipo que se pueda comportar como otro tipo
	 * 
	 * ejeplo
	 * 
	 * Animal miAnimal = new Perro();
	 * animal se comportara con otro tipo
	 * 
	 * */
	public static void main(String[] args){
		AnimalPolimorfismo firulais =new PerroPolimorfismo();
		firulais.comunicarse();
		//ahora se comportara como un gato
		firulais =new GatoPolimorfismo();
		imprimir(firulais);
		
	}

	private static void imprimir(AnimalPolimorfismo an) {
		an.comunicarse();
	}
}
