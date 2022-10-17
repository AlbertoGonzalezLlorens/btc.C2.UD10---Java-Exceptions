package miexception;

public class MiExcepcion extends Exception {
	
	private String mensaje = "";
	
	public MiExcepcion(String mensaje) {
		super();
		this.mensaje = mensaje;
		
	}

	public String getMensaje() {
		return mensaje;
	}
	
}
