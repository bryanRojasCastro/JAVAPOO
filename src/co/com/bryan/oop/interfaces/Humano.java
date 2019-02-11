package co.com.bryan.oop.interfaces;

public class Humano implements AccionesGenerales,AccionesHumano {
	
	private String cedula;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public void razonar(){
		System.out.println(" El humano esta razonando, desde la clase: "+getClass().getName()+"cedula"+cedula);
	}

	@Override
	public void estudiar() {
		System.out.println("Las personas les gusta leer"+" cedula"+cedula);
		
	}

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Las personas trabajan programando en JAVA"+" cedula"+cedula);
		
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Las personas pordemos hablar diferentes lenguajes"+" cedula"+cedula);
		
	}

	@Override
	public void desplazarse() {
		// TODO Auto-generated method stub
		System.out.println("la persona se desplaza caminando"+" cedula"+cedula);
		
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println(" juego solo jogo bonito do brasilia"+" cedula"+cedula);
		
	}

	@Override
	public void alimentarse() {
		// TODO Auto-generated method stub
		System.out.println("Las personas nos alimenataos fitness"+" cedula"+cedula);
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("voy a dormirles unas  6hrs mas bien"+" cedula"+cedula);
		
	}
	
	

}
