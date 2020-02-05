package serenity.cucumber.winappdriver.exception;

public class FallaInstanciaDriver extends Error{
	
	private static final long serialVersionUID = 1L;

	public FallaInstanciaDriver(String mensaje, Exception e) {
		super(mensaje, e);
	}

}
