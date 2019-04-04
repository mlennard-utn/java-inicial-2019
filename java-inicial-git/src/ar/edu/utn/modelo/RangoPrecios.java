package ar.edu.utn.modelo;

public enum RangoPrecios {
	BARATA(100),
	MEDIA(101),
	CARA(102),
	CARIIISIMA(103);
	
	private Integer factor;
	
	private RangoPrecios(int factor) {
		this.factor = factor;
	}
	
	public int factor() {
		return factor;
	}
	
}
