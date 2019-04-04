package ar.edu.utn.modelo;

public class FabricaGalletita {

	// La galletita se crea a partir de una matriz de precios
	// compuesta por: el tipo y por el otro lado el rango al cual 
	// pertenecen (basicamente el producto de ambas componentes).
	
	// El nombre de la galletita esta dado por:
	// 1. Chocolina
	// 2. Oreo
	// 3. Pitussa
	// 4. Toddy
	
	// El Rango precio 
	
	// La descripcion sera el nombre mas un adjetivo dado por 
	// el rango de precios: 
	// por ej.: Chocolina barata o Pitussa carisima
	
	//Construir la logica para crear las galletitas
	public Galletita crearGalletita(int tipo, int rangoPrecio) {
		
		Galletita g = new Galletita();

		switch (tipo) {
		case 1: //CHOCOLINA
			g.setNombre(TipoGalleta.CHOCOLINA.toString());
			Double precio = new Double(TipoGalleta.CHOCOLINA.precio() * rangoPrecio);
			g.setPrecio(precio);
			break;
		case 2: //OREO
			g.setNombre(TipoGalleta.OREO.toString());
			g.setPrecio(new Double(TipoGalleta.OREO.precio()*rangoPrecio));
			break;
		case 3: //PITUSSA
			g.setNombre(TipoGalleta.PITUSSA.toString());
			g.setPrecio(new Double(TipoGalleta.PITUSSA.precio()*rangoPrecio));
			break;
		case 4: //TODDY
			g.setNombre(TipoGalleta.TODDY.toString());
			g.setPrecio(new Double(TipoGalleta.TODDY.precio()*rangoPrecio));
			break;	
		default:
			break;
		}
			
		return g;
	}
	
}
