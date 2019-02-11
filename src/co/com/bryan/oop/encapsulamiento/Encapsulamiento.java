package co.com.bryan.oop.encapsulamiento;

public class Encapsulamiento {
	
	/*
	 * la encapsulacion es la manera de proteger los datos 
	 * dentro del sistema estableciendo basicamente los 
	 * permisos o niveles de visibilidad de acceso a nuestros datos.
	 * 
	 * con la encapsulacion mantenemos nuestros datos seguros, ya que 
	 * podemos evitar que por ejemplo se hagan modificaciones al estado o
	 * comportamiento de un objeto de una clase externa.
	 * 
	 * Consiste en controlar visibilidad de nuestros atributos y metodos de una clase
	 *
	 * modificadores de acceso a, atributos y metodos
	 * existen 3 modificaderosde acceso public private protected.
	 * 
	 * public: pueden ser utilizados en cualquier clase o metodo del proyecto
	 * private: se utiliza solo en la misma clase que lo contiene
	 * protected:se puede acceder a, atributos-metodos que 
	 * pueden ser visibles para las subclases (arbol de herencia)
	 * 
	 * Adicionalmente, sino se marca ningun modificador de acceso se toma como default
	 * que permite su visualizacion desde cualquier clase o en el mismo paquete
	 * 
	 * metodos getter y setter para acceder a nuestro atributos que tienen su modificador definido
	 * 
	 * +public  -private #protected
	 *  
	 *  con la tecnica de los sets y gets se busca que todos los atributos de la clase sean privados
	 *  y que por cada atributos se tenga un metodo get set.
	 *  get no recibe paarametros  set si recibe parametro
	 *  
	 *  No se pueden acceder a atributos que tienen modificador default desde otro paquete
	 *  default es visible solo a nivel de package
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapLogicaBasica bsEnc = new EncapLogicaBasica();
		bsEnc.setDocumento(123456);
		bsEnc.setEdad(18);
		bsEnc.setNombre("brayan");
		System.out.println("Id"+bsEnc.getDocumento()+" edad"+bsEnc.getEdad()+" Nombre"+bsEnc.getNombre());
	}

}
