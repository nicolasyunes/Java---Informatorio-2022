package level1;

import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exponente = sc.nextInt();

        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }
        sc.close();
        System.out.println("El resultado de la potencia es:" + resultado);
    }

}