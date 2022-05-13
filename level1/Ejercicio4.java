package level1;

//factorial 
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int num1 = sc.nextInt();

        int resultado = 1;
        for (int i = num1; i > 0; i--) {
            resultado = resultado * i;
        }
        System.out.println("El resultado factorial es:" + resultado);
        sc.close();

    }
}
