package ej5;

import java.util.Random;

public class Password {
	
	private int longitud;
	private String contraseña;
	final private int LONGITUD_DEFAULT=0;
	final private String CONTRASEÑA_DEFAULT="";
	
	public Password() {
		this.longitud=LONGITUD_DEFAULT;
		this.contraseña=CONTRASEÑA_DEFAULT;
		
	}
	
	public Password(int longitud) {
		this.longitud=longitud;
		this.contraseña=CONTRASEÑA_DEFAULT;
	}

	public void generarPassword() {
		//Hago que la contraseña solo pueda tener numeros, letras minusculas y mayusculas
		this.contraseña="";
		for(int i=0;i<longitud;i++) {
			Random rad_1 = new Random();
			Random rad_2 = new Random();
			int eleccion = rad_1.nextInt(3);
			
			switch(eleccion) {
				case 0:
					//Se obtiene un número
					int num = rad_2.nextInt(10)+48;
					char num_char = (char)num;
					this.contraseña+=num_char;
					break;
				case 1:
					//se obtiene una letra minuscula
					int num_1 = rad_2.nextInt(122-97)+97;
					char num_1_string = (char)num_1;
					this.contraseña+=num_1_string;
					break;
				case 2:
					//se obtiene una letra mayuscula
					int num_2 = rad_2.nextInt(90-65)+65;
					char num_2_string = (char)num_2;
					this.contraseña+=num_2_string;
					break;
			}
		}
		
		
	}
	
	public boolean esFuerte() {
		int contar_num = 0;
		int contar_may = 0;
		int contar_min = 0;
		
		for(int i=0;i<longitud;i++) {
			int num = (int)contraseña.charAt(i);
			
			if (num>47 && num<58) {
				contar_num++;
			} else if (num>64 && num<91) {
				contar_may++;
			} else if (num>96 && num<123) {
				contar_min++;
			}
			
		}
		
		if (contar_num > 5 && contar_min > 1 && contar_may > 2) {
			return true;
		}
		
		return false;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
	
}
