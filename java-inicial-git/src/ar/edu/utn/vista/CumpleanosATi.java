package ar.edu.utn.vista;

import java.util.Scanner;

import ar.edu.utn.modelo.Persona;

public class CumpleanosATi {

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Vector que en cada posicion(i) guarda la 
		//cantidad maxima de dias para ese mes(i+1)
		//Atencion!!! el indice para los vectores 
		//comienza en 0
		int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};
		Persona personas[] = new Persona[3]; 
		
		for(int i=0; i < 3; i++) {
			Persona per = new Persona();
			int mes = ingresoDato(scan, "mes", 1, 12);
			per.setMes(mes);
			// El usuario ingreso un valor entre
			// 1 y 12 pero accedo a la posicion mes -1 
			// porque el vector comienza en 0
			int dia = ingresoDato(scan,"dia", 1, dias[mes-1]);
			per.setDia(dia);
			int anio = ingresoDato(scan, "año", 2000, 2018);
			per.setAnio(anio);
			System.out.println("Ingrese su nombre:");
			String nombre = scan.next();
			per.setNombre(nombre);
			personas[i] = per;	
			System.out.println(nombre + ":" + dia + "/" + mes + "/" + anio);
		}
		System.out.println("---------------");
		for (Persona persona : personas) {
			persona.identificarse();
		}
		System.out.println("--- Busco el mas joven ---");
		int menor = Integer.MAX_VALUE;
		Persona masJoven = null;
		for (Persona x : personas) {
			if(x.getEdad() < menor) {
				menor = x.getEdad();
				masJoven = x;
			}
		}
		System.out.println("El mas joven es: ");
		masJoven.identificarse();
		System.out.println("Hay alguien de 13 años en la sala?" +
						existeElemento(13, personas));
	}

	private static boolean existeElemento(int edad, Persona[] xxxxs) {
		for (Persona persona : xxxxs) {
			if (persona.getEdad() == edad) {
				return true;
			}
		}
		return false;
	}
	
	private static int ingresoDato(Scanner scan, 
									String momento,
									int valorMinimo,
									int valorMaximo) {
		String mensaje = "Ingrese %s de su cumple (valor minimo %d valor maximo %d)";
		System.out.println("Ingrese " + momento +" de su cumple");
		int valor = scan.nextInt();
		while(!estaEnRango(valor, valorMinimo, valorMaximo)) {
			System.out.println(String.format(mensaje, momento, valorMinimo, valorMaximo));
				valor = scan.nextInt();
		}
		
		return valor;
	}
	
	private static boolean estaEnRango(int valor, int minimo, int maximo) {
		if (valor >= minimo && valor <= maximo) {
			return true;
		}
		return false;
	}

}
