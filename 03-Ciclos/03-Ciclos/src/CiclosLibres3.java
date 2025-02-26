import javax.swing.*;

public class CiclosLibres3 {
    public static void main(String[] args) {
        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Menor de un conjunto\n" +
                "2)Suma del 1-100\n" +
                "3)Factorial" +
                "\n4)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {

            /**
             * Elabore un programa que lea n números y calcule e imprima el número mayor y el número
             * menor, de todo el conjunto.
             */
            case "1":
                //declaración de variables
                int n, numero, mayor, menor;

                //solicitar cantidad de números
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números: "));

                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
                mayor = menor = numero;

                //iniciamos ciclo
                for (int i = 1; i < n; i++) {
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

                    if (numero > mayor) {
                        mayor = numero;
                    }
                    if (numero < menor) {
                        menor = numero;
                    }
                }

                //salida de los números mayor y menos
                JOptionPane.showMessageDialog(null,
                        "El número mayor es: " + mayor +
                                "\nEl número menor es: " + menor);
                break;

            /**
             * Elaborar un programa que calcule e imprima la suma de los números del 1 hasta el 100
             */
            case "2":
                //declaración de variables
                int suma = 0;

                //ciclo para llegar a 100
                for (int i = 1; i <= 100; i++) {
                    suma += i;
                }

                //mostramos resultados
                JOptionPane.showMessageDialog(null,
                        "La suma de los números del 1 al 100 es: " + suma);
                break;

            /**
             * Hacer un programa que lea un valor N, entero y positivo y que calcule e imprima su factorial.
             * Por ejemplo, si lee el %, su factorial es el producto de 1*2*3*4*5. El factorial de 0 es 1.
             */
            case "3":
                //declaración de variables
                int N=0;
                long factorial=0;

                //solicitar números
                N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero y positivo: "));

                //debemos validar que el número sea positivo
                if (N < 0) {
                    JOptionPane.showMessageDialog(null, "El número debe ser positivo");
                } else {
                    factorial = 1;

                    //buscamos factorial con ciclo for
                    for (int i = 1; i <= N; i++) {
                        factorial *= i;
                    }
                    //imprimir resultado
                    JOptionPane.showMessageDialog(null, "El factorial de " + N + " es: " + factorial);
                }
                break;


            case "4":
                JOptionPane.showMessageDialog
                        (null, "El programa ha terminado");
                break;
        }
    }
}
