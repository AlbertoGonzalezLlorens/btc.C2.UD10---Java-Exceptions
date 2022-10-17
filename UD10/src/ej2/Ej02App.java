package ej2;

import miexception.MiExcepcion;

public class Ej02App {

	public static void main(String[] args) {
		String mensaje = "Excepcion capturada con mensaje: Esto es un objeto Excepcion";
		
		try {
			System.out.println("Lanzar un exception customizado");
			throw new MiExcepcion(mensaje);
		}catch(MiExcepcion ex){
			System.out.println(ex.getMensaje());
			System.out.println("Programa terminado");
		}
		
	}

}
