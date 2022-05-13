package level1;

//Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String frase = sc.nextLine();
        System.out.println("Ingrese una letra: ");
        String letra = sc.nextLine();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }

        sc.close();

        System.out.println("La letra " + letra + " aparece " + contador + " veces en la frase.");
    }

}
