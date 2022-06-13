import java.util.*;
public class ejercicio3{
    public static void main(String [] agrs){
        Scanner scan = new Scanner(System.in);
        int flag = 1;
        while (flag == 1) {
            System.out.println("Ingrese numero:");
            int a = scan.nextInt();
            a+=1;
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
            System.out.println("\n1.\tPara Continuar\n2.\tPara Salir");
            flag = scan.nextInt();
        }
        scan.close();
    }
}