package exmanet3;

public class ClienteCamiloSanchez {
private String nombre;
private String dirección;
private int PerroCamiloSanchez;
public ClienteCamiloSanchez(String nombre, String dirección, int perroCamiloSanchez) {
	super();
	this.nombre = nombre;
	this.dirección = dirección;
	PerroCamiloSanchez = perroCamiloSanchez;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDirección() {
	return dirección;
}
public void setDirección(String dirección) {
	this.dirección = dirección;
}
public int getPerroCamiloSanchez() {
	return PerroCamiloSanchez;
}
public void setPerroCamiloSanchez(int perroCamiloSanchez) {
	PerroCamiloSanchez = perroCamiloSanchez;
}
@Override

public String toString() {
	return "ClienteCamiloSanchez [nombre=" + nombre + ", dirección=" + dirección + ", PerroCamiloSanchez="
			+ PerroCamiloSanchez + "]";
}
public void comprarPerro();



}
