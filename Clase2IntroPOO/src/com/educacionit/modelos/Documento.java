package com.educacionit.modelos;

public class Documento {
	// Tipo de Documento y Numero de Documento
	private String tipo;
	private long numero;

	public Documento(String tipo, long numero) {
		this.tipo = tipo;
		this.numero = numero;
	}

	public Documento() {

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}


	public String toString() {
		return "Documento [tipo=" + tipo + ", numero=" + numero + "]";
	}

	
}
