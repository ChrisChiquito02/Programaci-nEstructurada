import javax.swing.*;

/**
 * Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, el vendedor
 * desea saber cuánto dinero obtendrá por concepto de comisiones por las tres
 * ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su
 * ueldo base y comisiones.
 */
public class Vendedor {
    public static void main(String[] args) {
        //Declaración de variables
        double sueldobase=0.0;
        double sueldocomision=0.0;
        double comision1=0.0;
        double comision2=0.0;
        double comision3=0.0;
        double vent1=0.0;
        double vent2=0.0;
        double vent3=0.0;
        double totalcomisiones=0.0;

        //Entrada de datos
        sueldobase=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el sueldo base del empleado:"));
        vent1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el monto de la primera venta: "));
        vent2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el monto de la segunda venta: "));
        vent3=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el monto de la tercer venta: "));

        //Calculo de las comisiones
        comision1=vent1*.10;
        comision2=vent2*.10;
        comision3=vent3*.10;

        //Total de comisiones
        totalcomisiones=comision1+comision2+comision3;

        //Calculo del sueldo con comisiones
        sueldocomision=sueldobase+vent1+vent2+vent3+comision1+comision2+comision3;

        //Salida del programa
        JOptionPane.showMessageDialog(null, "El sueldo total del empleado es de: " + sueldocomision);
    }
}
