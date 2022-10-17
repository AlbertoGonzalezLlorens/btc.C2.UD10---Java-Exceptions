package ej1;

import java.util.Scanner;
import java.util.Random;


public class Ej1App {

	public static void main(String[] args) {
		Random gen_rand = new Random();
		Scanner sc = new Scanner(System.in);
		AdivinarNumero adivinar_numero= new AdivinarNumero(gen_rand);
		adivinar_numero.MayorMenor(sc);

	}

}
