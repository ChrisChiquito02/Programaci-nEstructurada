import javax.swing.*;

public class CiclosLibres4 {
    public static void main(String[] args) {
        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Números impares de0-100\n" +
                "2)Suma números antecesores\n" +
                "3)Número primo" +
                "\n4)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {

            /**
             * Mostrar los números impares entre el 0 y el 100
             */
            case "1":
                //declaramos cadena para resultado
                String resultado = "Números impares entre 0 y 100:\n";

                //ciclo para identificar impares
                for (int i = 1; i < 100; i += 2) {
                    resultado += i + " ";
                }

                //mostramos solo números impares
                JOptionPane.showMessageDialog(null, resultado);
                break;

            /**
             * Ingresar un número y mostrar la suma de los números que lo anteceden.
             */
            case "2":
                //declaramos variables
                int num, suma = 0;

                //solicitamos número límite
                num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número límite: "));

                //iniciamos ciclo
                for (int i = 1; i < num; i++) {
                    suma += i;
                }

                //imprimir resultados
                JOptionPane.showMessageDialog(null, "La suma de los números anteriores a " + num + " es: " + suma);
                break;

            /**
             * Ingresar un número y determinar si es número primo
             */
            case "3":
                //declaramos variables a usar
                int Num, contador = 0;

                //solicitamos número
                Num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

                //iniciamos ciclo
                for (int i = 1; i <= Num; i++) {
                    if (Num % i == 0) {
                        contador++;
                    }
                }
                //condicionales para identificar si es número primo o no
                if (contador == 2) {
                    //imprimir resultado en caso de ser número primo
                    JOptionPane.showMessageDialog(null, Num + " es un número primo.");
                } else {
                    //imprimir resultado en caso de no ser número primo
                    JOptionPane.showMessageDialog(null, Num + " no es un número primo.");
                }
                break;

            case "4":
                JOptionPane.showMessageDialog
                        (null, "El programa ha terminado");
                break;
        }
    }
}
