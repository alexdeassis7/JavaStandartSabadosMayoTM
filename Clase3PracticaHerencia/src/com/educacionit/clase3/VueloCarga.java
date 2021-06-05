package com.educacionit.clase3;

//clase hija de vuelo ,hereda todos metodo y atributos public y protected de vuelo  
public class VueloCarga extends Vuelo {

	public int asientos = 12;
	public float espacioMaximoDeCarga = 1000; // pies cubicos de espacio en bodega del avion
	public float espacioCargaUsado; // este atributo indica la cantidad de espacio que se ah utilizado en la bodega
									// del avion!

	// metodo que permite agregar un paquete a la bodega del avion , enviandoles las
	// dimensiones de la encomienda
	public void agregarPaquete(float altura, float ancho, float profundidad) {
		double size = altura * ancho * profundidad;

		if (espacioDeCargaDisponible(size)) {
			espacioCargaUsado += size;
			System.out.println("se agrego el paquete a la bodega del avion");
		} else {
			faltaEspacio();
		}
	}

	private boolean espacioDeCargaDisponible(double tamanio) {
		return espacioCargaUsado + tamanio <= espacioMaximoDeCarga;
	}

	private void faltaEspacio() {
		System.out.println("disculpe , no tenemos espacio suficiente para enviar su encomienda en el vuelo de hoy");
	}

	// utilizamos esta anotacion para asegurarnos que no cometimos un error
	// accidental y
	// que coincide con la firma del metodo que vamos a sobreescribir
	// esto le indica al compilador que nuestra intencion es ANULAR un metodo de
	// nuestra clase padre
	// esto no tiene impacto en tiempo de ejecucion(runtime) solo en tiempo de
	// compilacion!.
	@Override
	public int getAsiento() {
		return 12;
	}
}
