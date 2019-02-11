package co.com.bryan.oop.interfaces;

public class Animal implements AccionesGenerales {
	
	private String raza;

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public void cazar(){
		System.out.println("el animal de raza: "+raza+" esta cazando, desde la clase:"+getClass().getName());
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("los animales no hablan"+raza);
	}

	@Override
	public void desplazarse() {
		// TODO Auto-generated method stub
		System.out.println("los animales tienes diferentes formas de desplazarse"+raza);
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("Algunos animales son jugetones "+raza);
		
	}

	@Override
	public void alimentarse() {
		// TODO Auto-generated method stub
		System.out.println("los animales tambien se alimentan segun su habitat "+raza);
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("los animales tambien deben descansar "+raza);
		
	}
}
