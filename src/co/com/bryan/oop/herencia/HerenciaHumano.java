package co.com.bryan.oop.herencia;

public class HerenciaHumano {
	
	private String nombre;
	
	public void setNombre(String nom){
		this.nombre = nom;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void comer(String nombre) {
		System.out.println(getNombre()+" Estoy comiendo desde la clase padre Humano, ummmm!!");
	}
	
	public void dormir(String nombre) {
		System.out.println(getNombre()+" Estoy dormido desde la clase padre Humano");
	}
}
