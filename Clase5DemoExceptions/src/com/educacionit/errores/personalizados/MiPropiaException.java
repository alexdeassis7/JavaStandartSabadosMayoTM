package com.educacionit.errores.personalizados;

//esta clase sera una exception propia de nuestro negocio 

public class MiPropiaException extends Exception {

	private String message;

	public MiPropiaException(String mensaje) {
		this.message = mensaje;
	}

	// sobreescribimos un metodo de la clase Padre
	@Override
	public String getMessage() {
		return "soy mi propio mensaje de error customizado" + message;
	}

}
