package nose;
import org.javatuples.Triplet;
public class Usuario {
	    
	    public Triplet<String, Integer, String> crearUsuario(String nombre, int edad, String pais) {
	        return Triplet.with(nombre, edad, pais);
	    }

	}

