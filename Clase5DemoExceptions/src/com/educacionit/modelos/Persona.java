package com.educacionit.modelos;

import com.educacionit.errores.personalizados.MiPropiaException;

public class Persona {

	private int id;
	private String nombre;

	
	public void metodoQuePuedeLanzarUnError(int id) throws MiPropiaException{
		if(id < 0) {
			//si el id es un numero negativo lanzamos una exeption
		    throw new MiPropiaException("El id no puede ser un numero negativo !");
		}else {
			System.out.println("OK: el id es un numero positivo!");
		}
	}
	
	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	 
	
	
}
