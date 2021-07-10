package com.educacionit.errores.customizados;

public class PersonaInexistenteException extends Exception {

	@Override
	public String getMessage() {
		return " No existe la Persona entre los registros de la DB, por lo cual no se puede borrar algo que no existe ";
	}

}
