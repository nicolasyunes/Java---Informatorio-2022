import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flag = 1;
        int resul = 1;
        while (flag == 1) {
            System.out.println("Ingrese numero");
            int a = scan.nextInt();
            for (int i = 1; i <= a; i++) {
                resul *= i;
            }
            System.out.println("El resultado es " + resul);
            System.out.println("\n1.\tPara Continuar\n2.\tPara Salir");
            flag = scan.nextInt();
        }
        scan.close();
    }
}