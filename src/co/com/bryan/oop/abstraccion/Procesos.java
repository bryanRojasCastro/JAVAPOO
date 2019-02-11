package co.com.bryan.oop.abstraccion;

public class Procesos {

	public void iniciar() {
		//init guitar
		
		Guitarra electrica = new Guitarra();
		electrica.setNombre("Guitarra hard-core");
		System.out.println(electrica.getNombre());
		electrica.setTipo("Electrica");
		System.out.println(electrica.getTipo());
		electrica.tocar();
		
		System.out.println();
		//init violin
		
		Violin violin = new Violin();
		violin.setNombre("Violin");
		System.out.println(violin.getNombre());
		violin.setTipo("casual");
		System.out.println(violin.getTipo());
		violin.tocar();
		
		System.out.println();
		//init sax
		
		Saxofon sxf = new Saxofon();
		sxf.setPrecio(45.000);
		sxf.setTipo("pro-playing");
		System.out.println("precio:"+sxf.getPrecio()+" tipo:"+sxf.getTipo());
		sxf.tocar();
		
	}

}
