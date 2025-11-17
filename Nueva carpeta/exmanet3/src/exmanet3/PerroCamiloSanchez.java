package exmanet3;

public class PerroCamiloSanchez {
private String nombre;
private int edad;
private String raza;
public PerroCamiloSanchez(String nombre, int edad, String raza) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.raza = raza;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getRaza() {
	return raza;
}
public void setRaza(String raza) {
	this.raza = raza;
}

public void hacerRuido() {
	System.out.print("guau");
};

@Override
public String toString() {
	return "PerroCamiloSanchez [nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + "]";
}

	
}
