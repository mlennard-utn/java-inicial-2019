package ar.edu.utn.vista;

import java.util.Scanner;

import ar.edu.utn.modelo.TipoGalleta;

public class VistaMain {

	public static void main(String[] args) {
		
		System.out.println(TipoGalleta.CHOCOLINA.toString());
		
		Scanner scan = new Scanner(System.in);
		//Tomo el dato que el usuario ingresa:
		System.out.println("Ingrese un valor entre 1 y 4 (99 para terminar):");
		int operacion = scan.nextInt();
		int precio;
		while(operacion != 99) {
			//Verifico que el valor sea correcto/valido
			if(operacion >= 1 && operacion <= 4) {
				//Solicito el ingreso del tipo de precio
				System.out.println("Ingrese un valor entre 100 y 103");
				precio = scan.nextInt();
				if (precio >= 100 && precio <= 103) {
					
				} else {
					System.out.println("Precio fuera de rango (indicar valor entre 100 y 103");
				}
			} else {
				System.out.println("Se esperaba un valor entre 1 y 4");
			}
		}
		
	}

}
