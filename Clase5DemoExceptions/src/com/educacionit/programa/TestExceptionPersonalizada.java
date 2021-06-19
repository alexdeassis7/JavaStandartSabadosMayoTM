package com.educacionit.programa;

import com.educacionit.errores.personalizados.MiPropiaException;
import com.educacionit.modelos.Persona;

public class TestExceptionPersonalizada {

	public static void main(String[] args) {
		//atajo para importa : ctrl + shitf + o
		Persona p = new Persona(10, "Gustavo Bearzi"); 
		
		
		
		
		System.out.println(p.toString());
		
		try {
			

			p.metodoQuePuedeLanzarUnError(-5);
			
		} catch (MiPropiaException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
