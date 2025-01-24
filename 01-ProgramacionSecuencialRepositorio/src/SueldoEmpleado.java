import javax.swing.*;

/**
 Realizar un programa que calcule e imprima el sueldo de un empleado, bajo las
 siguientes características
 a. Se debe almacenar el nombre del empleado
 b. Las horas trabajadas que deben ser horas sin parte fraccionaria
 c. Cuota por hora
 d. Se debe imprimir el nombre del Trabajador y el Sueldo que va a percibir
 */
public class SueldoEmpleado {
    public static void main(String[] args) {

        //Declaración de variables
        String nombre = "";
        int horas = 0;
        double cuota = 0.0;
        double sueldo = 0.0;
        String salida = "";

        //Solicitar datos del empleado
        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del empleado: ");
        horas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas: "));
        cuota = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cuota por hora: "));

        //Calcular sueldo del empleado
        sueldo = horas*cuota;

        //Salida del programa
        salida = "El sueldo de " + nombre + " es de: $" + String.format("%.2f",sueldo);
        JOptionPane.showMessageDialog(null, salida);

    }
}
