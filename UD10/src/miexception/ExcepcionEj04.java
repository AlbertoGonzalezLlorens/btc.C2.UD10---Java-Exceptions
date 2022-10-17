package miexception;

public class ExcepcionEj04 extends Exception{

	public ExcepcionEj04() {
		super();
	}
	
	public String getMessage() {
		String mensaje="No se puede dividir entre 0";
		return mensaje;
	}
}
