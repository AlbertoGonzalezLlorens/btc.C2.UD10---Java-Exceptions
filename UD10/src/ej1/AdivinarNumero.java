package ej1;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class AdivinarNumero {
	private int valor_rand;
	private int contador;
	private int eleccion;
	
	public AdivinarNumero(Random gen_rand) {
		this.valor_rand = gen_rand.nextInt(500)+1;
		this.contador = 0;
	}
	
	public void MayorMenor(Scanner sc) {
		do {
			try {
				System.out.println("Escriba el número (1-500)");
				this.eleccion = sc.nextInt();
			}catch(InputMismatchException e) {
				System.err.println("No es un numero entero");
				sc.nextLine();
			}
			
			this.contador++;
			if (eleccion == valor_rand) {
				System.out.println("Felicidades el número es correcto");
				System.out.println("Lo has logrador en "+contador+" intentos");
			} else if (eleccion >= valor_rand){
				System.out.println("El numero objetivo es menor");
			} else if (eleccion <= valor_rand && eleccion>0) {
				System.out.println("El numero objetivo es mayor");
			}
				
		}while(eleccion != valor_rand);	
	}
	
}

