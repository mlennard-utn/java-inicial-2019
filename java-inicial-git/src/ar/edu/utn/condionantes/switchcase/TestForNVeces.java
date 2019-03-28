package ar.edu.utn.condionantes.switchcase;

public class TestForNVeces {
	
	public static void main(String[] args) {
		for(int i = 1; i < 35; i ++) {
			
			//Operador trinario:
			// condicion ? accion por verdadero : accion por falso
			
			// Operador modulo %
			// el resultado de la operacion modulo
			// devuelve el valor del resto de la division
			// por ej.: 5 % 2 resultado es 1
			// por ej.: 16 % 2 resultado es 0
			
			
			//int solo_pares = i%2==0? i: -1;
			if ( i%2 == 0 ) {
				System.out.println("Hola mundo " + i + ((i>1)?" veces":" vez"));	
			}
			
		
		}
	}
	
}
