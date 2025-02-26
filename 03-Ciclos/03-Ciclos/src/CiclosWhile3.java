import javax.swing.*;

public class CiclosWhile3 {
    public static void main(String[] args) {
        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Menor de un conjunto\n" +
                "2)Mayor de un conjunto\n" +
                "3)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {

            /**
             * Encontrar el menor valor de un conjunto de n números dados
             */
            case "1":
                //declaración de variables
                int numCon=0;
                double valor=0.0;
                double menor=0.0;
                int i=1;

                //Solicitar el total de datos
                numCon=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el total de números: "));

                if (numCon>0){
                    menor=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor 1: "));
                    i=2;
                }

                //Inicialización del ciclo
                while (i<=numCon){
                    valor=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor " + i + ": "));
                    if (valor<menor) {
                        menor = valor;
                    }
                        i++;
                }
                JOptionPane.showMessageDialog(null, "El valor menor del conjunto es: " + menor);
                break;

            /**
             * Encontrar el mayor valor de un conjunto de n números dados
             */
            case "2":
                //declaración de variables
                int numTotal =0;
                double numero=0.0;
                double mayor =0.0;
                int j =1;

                //Solicitar el total de datos
                numTotal =Integer.parseInt(JOptionPane.showInputDialog("Ingresa el total de números: "));

                if (numTotal >0){
                    mayor =Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor 1: "));
                    j =2;
                }

                //Inicialización del ciclo
                while (j <= numTotal){
                    numero=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor " + j + ": "));
                    if (numero > mayor) {
                        mayor = numero;
                    }
                    j++;
                }
                JOptionPane.showMessageDialog(null, "El valor menor del conjunto es: " + mayor);
                break;

            case "3":
                JOptionPane.showMessageDialog
                        (null,"El programa ha terminado");
                break;

        }
    }
}
