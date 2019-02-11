package co.com.bryan.oop.encapsulamiento;

public class EncapLogicaBasica {
	
	/*
	 * la idea es evitar que me accedan a los atributos de mi clase desde otra clase u/o package
	 * 
	 */
	
	private String nombre;
	private int edad;
	private int documento;
	
	public void setNombre(String nom){
		
		this.nombre = nom;
	}
	
	public String getNombre(){
		
		return this.nombre;
	}
	
	public void setEdad(int edad){
		
		this.edad = edad;
	}
	
	public int getEdad(){
		
		return this.edad;
	}
	
	public void setDocumento(int doc){
		
		this.documento = doc;
	}
	
	public int getDocumento(){
		
		return this.documento;
	}
	
	
}
