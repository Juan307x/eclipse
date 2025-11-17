package exmanet3;

public class TiendaCamiloSánchez {
private String Camilo;
private String dirección;
private int ClienteCamiloSanchez;
public TiendaCamiloSánchez(String camilo, String dirección, int clienteCamiloSanchez) {
	super();
	Camilo = camilo;
	this.dirección = dirección;
	ClienteCamiloSanchez = clienteCamiloSanchez;
}
@Override
public String toString() {
	return "TiendaCamiloSánchez [Camilo=" + Camilo + ", dirección=" + dirección + ", ClienteCamiloSanchez="
			+ ClienteCamiloSanchez + "]";
}
public void agregarCliente();

}
