import javax.swing.*;

public class CicloFor2 {
    public static void main(String[] args) {

        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Peso y edades\n" +
                "2)Descuento naranjas\n" +
                "3)Centro de verificación" +
                "\n4)Suma de 10 cantidades" +
                "\n5)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {

            /**
             * Una persona debe realizar un muestreo con n personas para determinar el promedio de peso de los niños,
             * jóvenes, adultos y viejos que existen en su zona habitacional. Se determinan las categorías con base a la siguiente tabla:
             * Categoría Edad
             * Niños    0-12
             * Jóvenes  13-29
             * Adultos  30-59
             * Viejos   60 en adelante
             */
            case "1":

                //declaracion de variables
                int n;
                double sumaNinos = 0, sumaJovenes = 0, sumaAdultos = 0, sumaViejos = 0;
                int countNinos = 0, countJovenes = 0, countAdultos = 0, countViejos = 0;
                int edad;
                double peso;
                String resultado;

                //ingresar numero de personas
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas: "));

                //vallidar que el numero de personas no sea 0
                if (n <= 0) {
                    JOptionPane.showMessageDialog(null, "El número de personas debe ser mayor que 0");
                    return;
                }

                //se inicia ciclo para ingresar edades y peso de las personas
                for (int i = 1; i <= n; i++) {
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona " + i + ": "));
                    peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona " + i + ": "));

                    if (edad >= 0 && edad <= 12) {
                        sumaNinos += peso;
                        countNinos++;
                    } else if (edad >= 13 && edad <= 29) {
                        sumaJovenes += peso;
                        countJovenes++;
                    } else if (edad >= 30 && edad <= 59) {
                        sumaAdultos += peso;
                        countAdultos++;
                    } else {
                        sumaViejos += peso;
                        countViejos++;
                    }
                }

                //creacion de los resultados
                resultado = "Promedio de pesos:\n" +
                        "Niños: " + (countNinos > 0 ? sumaNinos / countNinos : "No hay datos") + "\n" +
                        "Jóvenes: " + (countJovenes > 0 ? sumaJovenes / countJovenes : "No hay datos") + "\n" +
                        "Adultos: " + (countAdultos > 0 ? sumaAdultos / countAdultos : "No hay datos") + "\n" +
                        "Viejos: " + (countViejos > 0 ? sumaViejos / countViejos : "No hay datos");

                //impresion de los resultados
                JOptionPane.showMessageDialog(null, resultado);
        break;

                /**
                 * Al cerrar un expendio de naranjas, 15 clientes que aún no han pagado recibirán un 15% de descuento si compran más
                 * de 10 kilos. Determinar cuánto pagará cada cliente y cuanto percibirá la tienda por esas compras.
                 */
            case "2":
                //declaracion de variables
                final int CLIENTES = 15;
                final double DESCUENTO = 0.15;
                double precioPorKilo, kilos, totalCliente, totalTienda = 0;

                //solicitar el precio por kilo de la naranja
                precioPorKilo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por kilo de naranjas:"));

                //inicio del ciclo
                for (int i = 1; i <= CLIENTES; i++) {
                    kilos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los kilos comprados por el cliente " + i + ":"));

                    if (kilos > 10) {
                        totalCliente = kilos * precioPorKilo * (1 - DESCUENTO);
                    } else {
                        totalCliente = kilos * precioPorKilo;
                    }

                    totalTienda += totalCliente;
                    JOptionPane.showMessageDialog(null, "Cliente " + i + " pagará: $" + totalCliente);
                }

                JOptionPane.showMessageDialog(null, "Total percibido por la tienda: $" + totalTienda);
                break;

            /**
             * En un centro de verificación de automóviles se debe saber el promedio de puntos de contaminantes de los primeros 25
             * automóviles que lleguen. Asimismo, se desea saber los puntos contaminantes del carro que menos contamino y el que más
             * contamino.
             */
            case "3":

                //declaración de variables
                double min=0.0;
                double max=0.0;
                double promedio=0.0;
                double puntos=0.0;
                double suma=0.0;

                //inicio del ciclo
                for (int i = 1; i <= 25; i++) {
                    puntos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los puntos de contaminantes del auto " + i + ":"));
                    suma += puntos;

                    if (i == 1) {
                        min = max = puntos;
                    } else {
                        if (puntos < min) {
                            min = puntos;
                        }

                        if (puntos > max) {
                            max = puntos;
                        }
                    }
                }

                promedio = suma / 25;

                JOptionPane.showMessageDialog(null, "El promedio de puntos contaminantes es: " + promedio + "\n"
                        + "Los puntos del auto que menos contaminó son: " + min + "\n"
                        + "Los puntos del auto que más contaminó son: " + max);
                break;

            /**
             * Realizar un programa que permita obtener la suma de diez cantidades.
             */
            case "4":
                //declaración de variables
                double sumTotal=0.0;
                double cantidad=0.0;
                final int cant=10;

                //inicio del ciclo
                for (int i = 1; i <= cant ; i++) {
                    cantidad=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número" + i + ": "));
                    sumTotal+=cantidad;
                }
                JOptionPane.showMessageDialog(null,"La suma final de tus números es: " + sumTotal);
                break;

            case "5":
                JOptionPane.showMessageDialog
                        (null,"El programa ha terminado");
                break;
        }
    }
}