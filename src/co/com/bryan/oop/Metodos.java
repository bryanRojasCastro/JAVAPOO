package co.com.bryan.oop;

public class Metodos {
	
	/*
	 * metodos en java
	 * 
	 * modificador de alcance  modificadores de uso tipoRetorno nombreMetodo (params)....{code}
	 * 
	 * 
	 * modificador de alcance: public,private,protected,default
	 * 
	 * modificador de uso: abstract - final - static 
	 * 
	 * tipo de retorno: int double String void  
	 * 
	 * 
	 */
	
	public void sinRetorno(){
		System.out.println("este es un metodo sin retorno y sin parametros");
	}
	
	public String conRetorno(String cadena){
		//devovlviendo una cadena
		return "metodo con retorno y parametros "+cadena;
	}
	
	public static void main(String[] args) {
		Metodos mt = new Metodos();
		mt.sinRetorno();
		System.out.println(mt.conRetorno(" hello"));

	}
	
	/*
	 *el metodo es el que contiene la informacion como tal. 
	 * no hay necesidad de guardarla en una variable
	 * 
	 */

}
