package co.com.bryan.oop.sobreescriturametodos;

public class Perro extends Animal {

	@Override
	public void comer() {
		System.out.println("El perro esta tragando");
		
	}
	
	@Override
	public void desplazarse() {
		System.out.println("****************Override changing logic method super");
	}

}
