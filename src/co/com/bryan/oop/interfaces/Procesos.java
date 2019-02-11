package co.com.bryan.oop.interfaces;

public class Procesos {

	public void inicar() {
		Animal oso =new Animal();
		oso.setRaza("Oso ojos negros");
		oso.cazar();
		oso.alimentarse();
		oso.dormir();
		
		System.out.println();
		
		Humano hm =new Humano();
		hm.setCedula("1094");
		hm.alimentarse();
		hm.desplazarse();
		hm.dormir();
		System.out.println();
		Perro dog = new Perro();
		dog.setRaza("Labrador");
		dog.cazar();
		dog.hablar();
		
		
	}

}
