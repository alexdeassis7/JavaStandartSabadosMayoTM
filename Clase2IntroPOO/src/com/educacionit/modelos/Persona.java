package com.educacionit.modelos;

//definimos una clase "Persona" la cual es public ,esto quiere decir que podra ser accedida 
//desde cualquier otra clase que se encuentre definida en nuestro proyecto 
public class Persona {
	// cuerpo de la clase

	// definimos los atributos de la clase Persona , esto van a representar a las
	// caracteristicas comunes de las personas
	private int edad;
	private String nombre;
	private String apellido;
	private char sexo;
	private Documento documento;
	private float altura;
	private String fechaNacimiento;

	// metodo contructor con todos los parametros :
	// me permite instanciar un objeto y setearle estado
	// a sus atributos

	public Persona(int edad, String nombre, String apellido, char sexo, Documento documento, float altura,
			String fechaNacimiento) {
		setEdad(edad);
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.documento = documento;
		this.altura = altura;
		this.fechaNacimiento = fechaNacimiento;
	}

	// metodo constructor vacio
	public Persona() {
	}

	// metodo constructor con dos parametros :
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// metodo constructor con dos parametros :
	public Persona(String p, int j) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Metodos de la clase Persona : definen el comportamiento
	public void caminar() {
		System.out.println("hola Soy " + nombre + " y estoy caminando.");
	}

	public void caminar(int km) {
		System.out.println("hola Soy " + nombre + " y estoy caminando " + km + " km semanales");
	}

	public void estudiar() {
		System.out.println("hola Soy " + nombre + " y estoy estudiando JAVA JSE.");
	}

	public void estudiar(String materia) {
		System.out.println("hola Soy " + nombre + " y estoy estudiando " + materia);
	}

	// getters y setters
	// get : me sirve para obtener el estado de un atributo de la clase
	// desde fuera de mi clase Persona
	public int getEdad() {
		return edad;
	}

	// set : me sirve para modificar el estado de un atributo private
	// de mi clase persona
	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
			System.out.println("la edad fue modificada");
		} else {
			System.out.println("no podes setear el valor " + edad);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {

		if (sexo == 'm' || sexo == 'f') {
			this.sexo = sexo;
			System.out.println("se modifico el sexo de " + nombre);
		} else {
			System.out.println("el sexo no puede ser " + sexo);
		}
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo
				+ ", documento=" + documento + ", altura=" + altura + ", fechaNacimiento=" + fechaNacimiento + "]";
	}


}
