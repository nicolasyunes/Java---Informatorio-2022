package level1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // ingresar dos numeros para suma resta multiplicacion y division
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("La suma es: " + (num1 + num2));
        System.out.println("La resta es: " + (num1 - num2));
        System.out.println("La multiplicacion es: " + (num1 * num2));
        System.out.println("La division es: " + (num1 / num2));

        sc.close();

    }
}
