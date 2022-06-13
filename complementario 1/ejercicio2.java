import java.util.*;
public class ejercicio2{
    public static void main(String [] agrs){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero A:");
        int a = scan.nextInt();
        System.out.println("Ingrese numero B:");
        int b = scan.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        scan.close();
    }
}