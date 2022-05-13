package level1;

import java.util.Scanner;

public class Ejercicio1 {
    // hola mundo
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese su peso: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura: ");
        double altura = sc.nextDouble();
        System.out.println("Ingrese su sexo: ");
        String sexo = sc.next();
        System.out.println("Ingrese su estado civil: ");
        String estadoCivil = sc.next();
        System.out.println("Ingrese su nacionalidad: ");
        String nacionalidad = sc.next();
        System.out.println("Ingrese su direccion: ");
        String direccion = sc.next();
        System.out.println("Ingrese su telefono: ");
        String telefono = sc.next();
        System.out.println("Ingrese su correo: ");
        String correo = sc.next();
        System.out.println("Ingrese su fecha de nacimiento: ");
        String fechaNacimiento = sc.next();
        System.out.println("Ingrese su fecha de ingreso: ");
        String fechaIngreso = sc.next();

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);

        sc.close();

    }

}
