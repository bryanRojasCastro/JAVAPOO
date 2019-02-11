package co.com.bryan.oop.abstraccion;

public class Saxofon extends Instrumento  {
	
	private double precio;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public void tocar() {
		System.out.println("Sonando saxo......");
		
	}
	
	

}
