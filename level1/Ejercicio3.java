package level1;
//Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1) de la siguiente forma:

import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        int contador = 1;
        while (contador <= numero) {
            for (int i = 1; i <= contador; i++) {
                System.out.print(i);

            }
            System.out.println("");

            contador++;
        }
        sc.close();
    }

}
