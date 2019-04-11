package ar.edu.utn.vista;

import ar.edu.utn.modelo.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p = new Persona();
		
		p.setNombre("Pedro");
		p.setAnio(2006);
		
		p.identificarse();
		System.out.println(p.getEdad());

	}

}
