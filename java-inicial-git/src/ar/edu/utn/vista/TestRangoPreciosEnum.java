package ar.edu.utn.vista;

import ar.edu.utn.modelo.RangoPrecios;
import ar.edu.utn.modelo.TipoGalleta;

public class TestRangoPreciosEnum {

	public static void main(String[] args) {
		System.out.println(RangoPrecios.CARIIISIMA.toString());
		System.out.println(RangoPrecios.BARATA.factor());
		
		System.out.println(TipoGalleta.CHOCOLINA.toString());
		System.out.println(TipoGalleta.OREO.precio());

	}

}
