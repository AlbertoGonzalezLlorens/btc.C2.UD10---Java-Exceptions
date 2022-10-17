package ej3;

import java.util.Random;

public class ValorRandom {
	
	private int num_rand;
	private final int NUM_RAND_DEFAULT=0;
	
	public ValorRandom () {
		this.num_rand=NUM_RAND_DEFAULT;
	}
	
	public int generateRandom() {
		
		Random rad = new Random();
		System.out.println("Generando número aleatorio...");
		this.num_rand=rad.nextInt(1000);
		System.out.println("El número aleatorio generado es: " + num_rand);
		return num_rand;
	}
	
	public void parImpar() {
		
		try {
			if ((num_rand%2)==0) {throw new ExcepcionEj3(1);}
			else {throw new ExcepcionEj3(2);}
		} catch(ExcepcionEj3 ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
