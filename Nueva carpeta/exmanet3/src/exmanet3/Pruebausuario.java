package nose;

import org.javatuples.Triplet;

public class Pruebausuario {

	public static void main(String[] args) {

        Usuario usuario = new Usuario();

        Triplet<String, Integer, String> datos =
                usuario.crearUsuario("camilo", 19, "Colombia");

        System.out.println("=== Datos del usuario ===");
        System.out.println("Nombre: " + datos.getValue0());
        System.out.println("Edad: " + datos.getValue1());
        System.out.println("País: " + datos.getValue2());
    }
}