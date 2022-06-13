package ejer5;

import java.util.ArrayList;

/**
 *
 * @author Yunes Nicolas
 */
public class Sueldo {
    ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
    ArrayList<Float> sueldoHora = new ArrayList<Float>();
    ArrayList<Float> sueldoTotal = new ArrayList<Float>();
    float tot = 0;

    public void cargarHorasTrabajadas(int h) {
        horasTrabajadas.add(h);
    }

    public void cargarSueldoHora(float s) {
        sueldoHora.add(s);
    }

    public void calcularSueldo() {
        for (int i = 0; i < horasTrabajadas.size(); i++) {
            float s = horasTrabajadas.get(i) * sueldoHora.get(i);
            sueldoTotal.add(s);
        }
    }

    public void mostrarDatos() {
        for (int i = 0; i < sueldoTotal.size(); i++) {
            System.out.println("Empleado " + (i + 1) + ": sueldo total $" + sueldoTotal.get(i));
        }
    }

    public void total() {
        for (int i = 0; i < sueldoTotal.size(); i++) {
            tot += sueldoTotal.get(i);
        }
        System.out.println("Total Final:" + tot);
    }
}