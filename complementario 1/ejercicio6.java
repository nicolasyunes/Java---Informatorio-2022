import java.util.*;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flag = 1, a, b, c;
        while (flag == 1) {
            System.out.println("Introduzca un entero base: ");
            a = scan.nextInt();
            System.out.println("Introduzca un entero pontencia: ");
            b = scan.nextInt();
            c = 1;
            for (int i = 0; i < b; i++) {
                c *= a;
            }
            System.out.println(a + " elevado a " + b + " = " + c);
            System.out.println("\n1.\tPara Continuar\n2.\tPara Salir");
            flag = scan.nextInt();
        }
        scan.close();
    }
}