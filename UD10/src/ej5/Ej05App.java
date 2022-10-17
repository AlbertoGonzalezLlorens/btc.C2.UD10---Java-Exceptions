package ej5;

import java.util.Scanner;

public class Ej05App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int contador =0;
		int numero_contraseñas = 0;
		do {
			try {
				System.out.println("Introduzca el número de contraseñas");
				numero_contraseñas = sc.nextInt();
				contador++;
			}catch(Exception ej) {
				System.out.println("No ha introducido un valor correcto");
				sc.nextLine();
			}
		}while(contador<1);
		
		Password contraseña[] = new Password[numero_contraseñas];
		boolean[] es_fuerte = new boolean [numero_contraseñas];
		
		for (int i=0;i<numero_contraseñas;i++) {
			int contador_for =0;
			int longitud_contraseña = 0;
			do {
				try {
					System.out.println("Introduzca la longitud de la contraseña");
					longitud_contraseña = sc.nextInt();
					contador_for++;
				}catch(Exception ej) {
					System.out.println("No ha introducido un valor correcto");
					sc.nextLine();
				}
			}while(contador_for<1);
			
			contraseña[i]=new Password(longitud_contraseña);
			contraseña[i].generarPassword();
			es_fuerte[i]=contraseña[i].esFuerte();
		}
		
		sc.close();
		
		for (int i=0;i<numero_contraseñas;i++) {
			System.out.println(contraseña[i].getContraseña()+" "+ es_fuerte[i]);
		}
	}

}
