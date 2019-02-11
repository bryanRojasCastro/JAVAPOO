package co.com.bryan.oop.abstraccion;

public class Guitarra extends Instrumento {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void tocar() {
		System.out.println("sonando guitarra........");
		
	}

}
