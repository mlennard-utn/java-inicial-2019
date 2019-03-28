package ar.edu.utn.condionantes.switchcase;

import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) {
		
		// la estructura de repeticion while 
		// nos permite ejecutar un conjuntos de sentencias
		// de manera repetitiva mientras se cumpla cierta
		// condicion
		/*
			while(condicion){
				sentencias que se van a ejecutar 
				mientras condicion sea verdadero
			}
		
		*/
		System.out.print("Ingrese un numero: ");
		Scanner scan = new Scanner(System.in);
		int ingresoUsuario = scan.nextInt();
		System.out.println("El numero que ingreso es: " + ingresoUsuario);
		
		int contador = 0;
		while(ingresoUsuario != 0) {
			System.out.println("Hola mundo " + contador);
			contador++;
			System.out.print("Ingrese un numero: ");
			ingresoUsuario = scan.nextInt();
		}
		
		System.out.println("Cantidad de hola mundos: " + contador);
		
	}

}
