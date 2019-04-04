package ar.edu.utn.modelo;

public enum TipoGalleta {
	CHOCOLINA(1),
	OREO(2),
	PITUSSA(3),
	TODDY(4);
	
	private int precio;
	
	private TipoGalleta(int p) {
		this.precio = p;
	}
	
	public int precio() {
		return precio;
	}
	
}
