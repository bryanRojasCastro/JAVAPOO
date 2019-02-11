package co.com.bryan.oop.herencia;

public class HerenciaProcesos {
	
	public void inciarProcesos(){
		
		//HOMBRE init...
		
		HerenciaHombre insHombre = new HerenciaHombre();
		insHombre.setNombre("JUAN");
		insHombre.afeitarse();
		insHombre.comer(insHombre.getNombre());
		insHombre.dormir(insHombre.getNombre());
		
		HerenciaMujer insMujer =new HerenciaMujer();
		insMujer.setNombre("Sandra");
		insMujer.comer(insMujer.getNombre());
		insMujer.dormir(insMujer.getNombre());
		insMujer.maquillarse();
	}
}
