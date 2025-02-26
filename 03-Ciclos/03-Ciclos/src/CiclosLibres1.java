import javax.swing.*;

public class CiclosLibres1 {
    public static void main(String[] args) {
        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Promedio Masa Aire\n" +
                "2)Granja\n" +
                "3)Suma" +
                "\n4)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {

            /**
             * 1.	La presión, volumen y temperatura de una masa de aire se relacionan por la fórmula:
             * 𝑝𝑟𝑒𝑠𝑖ó𝑛 ∗ 𝑣𝑜𝑙𝑢𝑚𝑒𝑛
             * 𝑚𝑎𝑠𝑎 =
             * 0.37 ∗ (𝑡𝑒𝑚𝑝𝑒𝑟𝑎𝑡𝑢𝑟𝑎 + 460)
             * Calcular el promedio de masa de aire de los neumáticos de n vehículos que están en compostura
             * en un servicio de alineación y balanceo. Los vehículos pueden ser motocicletas o automóviles.
             */
            case "1":
                //declaración de variables
                int numVehiculos =0;
                double presion, volumen, temperatura, masa, sumaMasa = 0;

                // Solicitar al usuario la cantidad de vehículos
                numVehiculos = Integer.parseInt(JOptionPane.showInputDialog
                        ("Ingresa la cantidad de vehículos: "));

                //inicio del ciclo
                for (int i = 1; i <= numVehiculos; i++) {

                    //solicitar los valores de presión, volumen y temperatura
                    presion = Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa la presión del vehículo " + i + ": "));
                    volumen = Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el volumen del vehículo " + i + ": "));
                    temperatura = Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa la temperatura del vehículo " + i + ": "));

                    //calcular la masa de aire usando la fórmula
                    masa = (presion * volumen) / (0.37 * (temperatura + 460));

                    //sumar la masa
                    sumaMasa += masa;
                }

                //cálculo del promedio y mostrarlo
                double promedioMasa = sumaMasa / numVehiculos;
                JOptionPane.showMessageDialog(null,
                        "El promedio de masa de aire es: " + promedioMasa);
                break;

            /**
             * 1.	En una granja se requiere saber alguna información para determinar el precio de venta
             * por cada kilo de huevo. Es importante determinar el promedio de calidad de las n gallinas que
             * hay en la granja. La calidad de cada gallina se obtiene según la fórmula:
             * 𝑐𝑎𝑙𝑖𝑑𝑎𝑑 = 𝑝𝑒𝑠𝑜 𝑑𝑒 𝑙𝑎 𝑔𝑎𝑙𝑙𝑖𝑛𝑎 ∗ 𝑎𝑙𝑡𝑢𝑟𝑎 𝑑𝑒 𝑙𝑎 𝑔𝑎𝑙𝑙𝑖𝑛𝑎
             *              𝑛𝑢𝑚𝑒𝑟𝑜 𝑑𝑒 ℎ𝑢𝑒𝑣𝑜𝑠 𝑞𝑢𝑒 𝑝𝑜𝑛𝑒
             *
             * Finalmente, para fijar el precio de kilo de huevo, se toma como base la siguiente tabla:
             *
             * Precio Total de Calidad	        Peso por Kilo de Huevo
             * Mayor o igual a 15	            1.2 * promedio de calidad
             * Mayor que 8 y menor que 15	    1.00 * promedio de calidad
             * Menor o igual que 8	            0.80 * promedio de calidad
             */
            case "2":
                //declaración de variables
                int numGallinas;
                double peso, altura, huevos, calidad, promedioCalidad = 0, precioFinal;

                //solicitar número de gallinas
                numGallinas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de gallinas: "));

                for (int i = 1; i <= numGallinas; i++) {
                    //ingresar datos de cada gallina
                    peso = Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el peso de la gallina " + i + ": "));
                    altura = Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa la altura de la gallina " + i + ": "));
                    huevos = Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el número de huevos que pone la gallina " + i + ": "));

                    //calculamos la calidad
                    calidad = (peso * altura) / huevos;
                    promedioCalidad += calidad;
                }

                //calculamos el promedio de calidad
                promedioCalidad /= numGallinas;

                //se determina el precio del kilo de huevo
                if (promedioCalidad >= 15) {
                    precioFinal = 1.2 * promedioCalidad;
                } else if (promedioCalidad > 8 && promedioCalidad < 15) {
                    precioFinal = 1.0 * promedioCalidad;
                } else {
                    precioFinal = 0.8 * promedioCalidad;
                }

                //mostar precio
                JOptionPane.showMessageDialog(null,
                        "El precio por kilo de huevo es: $" + precioFinal);
                break;

            /**
             * Calcular la suma siguiente:
             * 100 + 98 + 96 + 94 + … + 0 en este orden
             */
            case "3":
                //declaración de variables
                int suma = 0;

                for (int i = 100; i >= 0; i -= 2) {
                    suma += i;
                }

                JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                break;


            case "4":
                JOptionPane.showMessageDialog
                        (null,"El programa ha terminado");
                break;

            }
        }
}
