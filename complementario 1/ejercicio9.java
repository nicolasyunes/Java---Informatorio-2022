import java.util.*;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cant = 0;
        System.out.println("Ingrese Texto");
        String cadena = scan.nextLine();
        System.out.println("Ingrese caracter");
        char letra = scan.nextLine().charAt(0);
        for (int i = 0; i < cadena.length(); i++) {
            if (letra == cadena.charAt(i)) {
                cant += 1;
            }
        }
        System.out.println(cant);
        scan.close();
    }
}