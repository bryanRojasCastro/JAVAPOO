package co.com.bryan.oop.abstraccion;

public abstract class Instrumento {
	
	private String tipo;
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public abstract void tocar();
	
	/*
	 * puede contener metodos concretos method(){...logic}
	 * */
}
