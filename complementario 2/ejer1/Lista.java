package ejer1;
import java.util.ArrayList;
/**
 *
 * @author Yunes Nicolas
 */
public class Lista {
    ArrayList ciudades = new ArrayList();
    public void añadirFavoritos(String ciudad) {
        ciudades.add(ciudad);
    }
    public void mostrarCiudades() {
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println((i + 1) + ": " + ciudades.get(i));
        }
    }
}
