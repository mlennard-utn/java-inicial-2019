package ar.edu.utn.condionantes.switchcase;

public class TestSwitchCase {

	public static void main(String[] args) {
		int color = 22;
		
		switch (color) {
		case 'R': case 'r': case 22:
			System.out.println("Color ROJO");
			break;
		case 'B':
			System.out.println("Color AZUL");
			break;
		case 'Y':
			System.out.println("Color AMARILLO");
			break;	
		default:
			System.out.println("No reconozco el color");
			break;
		}
	}

}
