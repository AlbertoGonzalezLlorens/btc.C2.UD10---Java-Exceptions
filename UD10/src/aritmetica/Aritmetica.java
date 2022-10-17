package aritmetica;

import java.util.Scanner;
import miexception.ExcepcionEj04;
import java.util.InputMismatchException;

public class Aritmetica{
	private double a;
	private double b;
	private double resultado;
	private final double A_DEFAULT = 0;
	private final double B_DEFAULT = 0;

	public Aritmetica() {
		this.a = A_DEFAULT;
		this.b = B_DEFAULT;
	}

	public void suma(Scanner sc) {
		System.out.println("a+b");
		int contador_a = 0;
		do {
			try {
				System.out.println("Valor a");
				this.a = sc.nextDouble();
				contador_a++;
			} catch (Exception ex) {
				System.out.println("No es un valor correcto");
				sc.nextLine();
			}
		} while (contador_a == 0);

		int contador_b = 0;
		do {
			try {
				System.out.println("Valor b");
				this.b = sc.nextDouble();
				contador_b++;
			} catch (Exception ex) {
				System.out.println("No es un valor correcto");
				sc.nextLine();
			}
		} while (contador_b == 0);

		this.resultado = a + b;

		System.out.println("El valor de la suma es: " + resultado);

	}

	public void resta(Scanner sc) {
		System.out.println("a-b");
		int contador_a = 0;
		do {
			try {
				System.out.println("Valor a");
				this.a = sc.nextDouble();
				contador_a++;
			} catch (Exception ex) {
				System.out.println("No es un valor correcto");
				sc.nextLine();
			}
		} while (contador_a == 0);

		int contador_b = 0;
		do {
			try {
				System.out.println("Valor b");
				this.b = sc.nextDouble();
				contador_b++;
			} catch (Exception ex) {
				System.out.println("No es un valor correcto");
				sc.nextLine();
			}
		} while (contador_b == 0);

		this.resultado = a - b;

		System.out.println("El valor de la resta es: " + resultado);

	}

	public void multiplicacion(Scanner sc) {
		System.out.println("a*b");
		int contador_a = 0;
		do {
			try {
				System.out.println("Valor a");
				this.a = sc.nextDouble();
				contador_a++;
			} catch (Exception ex) {
				System.out.println("No es un valor correcto");
				sc.nextLine();
			}
		} while (contador_a == 0);

		int contador_b = 0;
		do {
			try {
				System.out.println("Valor b");
				this.b = sc.nextDouble();
				contador_b++;
			} catch (Exception ex) {
				System.out.println("No es un valor correcto");
				sc.nextLine();
			}
		} while (contador_b == 0);

		this.resultado = a * b;

		System.out.println("El valor de la multiplicación es: " + resultado);

	}

	public void potencia(Scanner sc) {
		System.out.println("a^b");
		int contador_a = 0;
		do {
			try {
				System.out.println("Valor a");
				this.a = sc.nextDouble();
				contador_a++;
			} catch (Exception ex) {
				System.out.println("No es un valor correcto");
				sc.nextLine();
			}
		} while (contador_a == 0);

		int contador_b = 0;
		do {
			try {
				System.out.println("Valor b");
				this.b = sc.nextDouble();
				contador_b++;
			} catch (Exception ex) {
				System.out.println("No es un valor correcto");
				sc.nextLine();
			}
		} while (contador_b == 0);

		this.resultado = Math.pow(a, b);

		System.out.println("El valor de la potencia es: " + resultado);

	}

	public void raiz(Scanner sc) {
		System.out.println("(a)^1/2");
		int contador_a = 0;
		do {
			try {
				System.out.println("Valor a");
				this.a = sc.nextDouble();
				this.a = Math.abs(a);
				contador_a++;
			} catch (Exception ex) {
				System.out.println("No es un valor correcto");
				sc.nextLine();
			}
		} while (contador_a == 0);

		this.resultado = Math.sqrt(a);

		System.out.println("El valor de la raiz es: " + resultado);

	}

	public void raizCubica(Scanner sc) {
		System.out.println("(a)^1/3");
		int contador_a = 0;
		do {
			try {
				System.out.println("Valor a");
				this.a = sc.nextDouble();
				this.a = Math.abs(a);
				contador_a++;
			} catch (Exception ex) {
				System.out.println("No es un valor correcto");
				sc.nextLine();
			}
		} while (contador_a == 0);

		this.resultado = Math.pow(a, 1 / 3);

		System.out.println("El valor de la raiz cubica es: " + resultado);

	}

	public void division(Scanner sc) {
		System.out.println("a/b");
		int contador_division = 0;
		do {
			try {
				int contador_a =0;
				do {
					try{
						System.out.println("Valor a");
						this.a=sc.nextDouble();
						contador_a++;
					}catch(Exception ex) {
						System.out.println("No es un valor correcto");
						sc.nextLine();
					}
				}while(contador_a==0);
			
				int contador_b =0;
				do {
					try{
						System.out.println("Valor b");
						this.b=sc.nextDouble();
						if (b==0) {
							throw new ExcepcionEj04();
					}
						contador_b++;
					}catch(InputMismatchException ex) {
						System.out.println("No es un valor correcto");
						sc.nextLine();
					}
					catch(ExcepcionEj04 ex) {
						System.out.println(ex.getMessage());
					}
				}while(contador_b==0);
			
				this.resultado = a/b;
			
				System.out.println("El valor de la division es: "+resultado);
				contador_division++;
			}catch(Exception ex) {
				System.out.println("No se puede dividir entre 0");
			}
		}while(contador_division==0);
		
		
	}
}
