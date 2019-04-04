package ar.edu.utn.vista;

import ar.edu.utn.modelo.FabricaGalletita;
import ar.edu.utn.modelo.Galletita;

public class TestFabricaGalletitas {
	
	public static void main(String[] args) {
		FabricaGalletita fab = new FabricaGalletita();
		
		Galletita g = fab.crearGalletita(2, 100);
		System.out.println(g.getNombre() + ":" + g.getPrecio());
		
		g = fab.crearGalletita(1, 103);
		System.out.println(g.getNombre() + ":" + g.getPrecio());
		
		g = fab.crearGalletita(3, 100);
		System.out.println(g.getNombre() + ":" + g.getPrecio());
		
		g = fab.crearGalletita(4, 101);
		System.out.println(g.getNombre() + ":" + g.getPrecio());
		
	}
	
}
