package com.educacionit;

import java.util.ArrayList;
import java.util.Iterator;

//clase con Generics
public class BolsaGenerica<T> implements Iterable<T> {
	
	private ArrayList<T> lista = new ArrayList<T>();
	private int tope;

	public BolsaGenerica(int tope) {
		this.tope = tope;
	}

	public void add(T objeto) {
		if (lista.size() < tope) {
			lista.add(objeto);
		} else {
			throw new RuntimeException("No caben mas en la bolsa!");
		}
	}

	@Override
	public Iterator<T> iterator() {
		return lista.iterator();
	}

}
