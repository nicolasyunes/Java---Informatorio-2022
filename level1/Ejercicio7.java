package level1;

//Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().
import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);
            if (letra >= 'a' && letra <= 'z') {
                letra = (char) (letra - 32);

            }

            System.out.print(letra);

        }

        sc.close();
    }

}
