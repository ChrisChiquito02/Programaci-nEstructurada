import javax.swing.*;

/**
 *  Escribir un programa que calcula y muestra el promedio de los números enteros 1,
 * 7, 9 y 34.
 */
public class PromedioNumeros {
    public static void main(String[] args) {
        //Declaración de variables
        int a=1, b=7, c=9, d=34;
        String salida= "";
        double sum=0;
        double prom=0;

        //Calcular promedio
        sum=a+b+c+d;
        prom=sum/4;

        //Salida del programm
        JOptionPane.showMessageDialog(null, "El promedio de los valores 1, 7, 9 y 35 es: "
                                    + prom);
    }
}
