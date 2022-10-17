package ej3;

public class ExcepcionEj3 extends Exception{
		
	private int val_eleccion;
	
	public ExcepcionEj3(int valor) {
		super();
		this.val_eleccion=valor;
	}
	
	public String getMessage() {
		String mensaje="";
		if (val_eleccion==1) {
			mensaje = "Es par";
		} else {
			mensaje = "Es impar";
		}
		return mensaje;
	}
	
}
