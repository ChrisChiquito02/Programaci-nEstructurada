import javax.swing.*;
public class CondicionalesCompuestos1 {
    public static void main(String[] args) {

        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Computadoras\n" +
                "2)Llantera\n" +
                "3)Juego" +
                "\n4)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {
            /**
             * 1) En una fábrica de computadoras se planea ofrecer a los clientes un descuento que dependerá del
             * número de computadoras que compre. Si las computadoras son menos de cinco se les dará un 10% de
             * descuento sobre el total de la compra; si el número de computadoras es mayor o igual a cinco pero
             * menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un 40% de descuento.
             * El precio de cada computadora es de $11,000
             */
            case "1":
                //declaracion de variables
                double dcto = 0.0;
                int numComp = 0;
                int precio = 11000;
                double total = 0.0;
                double pago = 0.0;

                //Solicitar variables
                numComp = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de computadoras: "));

                //Proceso del programa
                total = precio * numComp;
                if (numComp < 5) {
                    dcto = total * .10;
                    pago = (total - dcto);
                    JOptionPane.showMessageDialog(null, "El total a pagar es de: $" + pago);
                } else if (numComp >= 5 && numComp < 10) {
                    dcto = total * .20;
                    pago = (total - dcto);
                    JOptionPane.showMessageDialog(null, "El total a pagar es de: $" + pago);
                } else if (numComp >= 10) {
                    dcto = total * .40;
                    pago = (total - dcto);
                    JOptionPane.showMessageDialog(null, "El total a pagar es de: $" + pago);
                }

                break;
            /**
             * 2) En una llantera se ha establecido una promoción de las llantas marca "Ponchadas",
             * dicha promoción consiste en lo siguiente:Si se compran menos de cinco llantas el precio es de $300
             * cada una, de $250 si se compran de cinco a 10 y de $200 si se compran más de 10.Obtener la cantidad
             * de dinero que una persona tiene que pagar por cada una de las llantas que compra y la que tiene que
             * pagar por el total de la compra.
             */
            case "2":
                //Declaración de variables
                int compra = 0;
                double totPago = 0.0;
                double prePorLlan = 0.0;

                //Entrada de datos
                compra = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de llantas a comprar: "));

                //Proceso del programa
                if (compra < 5) {
                    prePorLlan = 300;
                    totPago = prePorLlan * compra;
                    JOptionPane.showMessageDialog(null, "El precio por llanta es de $" +
                            prePorLlan + " y el total por pagar es de: $" + totPago);
                } else if (compra >= 5 && compra <= 10) {
                    prePorLlan = 250;
                    totPago = prePorLlan * compra;
                    JOptionPane.showMessageDialog(null, "El precio por llanta es de $" +
                            prePorLlan + " y el total por pagar es de: $" + totPago);
                } else if (compra > 10) {
                    prePorLlan = 200;
                    totPago = prePorLlan * compra;
                    JOptionPane.showMessageDialog(null, "El precio por llanta es de $" +
                            prePorLlan + " y el total por pagar es de: $" + totPago);
                }

                break;
            /**
             * 3) En un juego de preguntas a las que se responde "Si" o "No" gana quien responda correctamente
             * las tres preguntas. Si se responde mal a cualquiera de ellas ya no se pregunta la siguiente y
             * termina el juego. Las preguntas son:
             * 1. Colon descubrió América?
             * 2. La independencia de México fue en el año 1810?
             * 3. The Doors fue un grupo de rock Americano?
             */
            case "3":
                //declaración de variables
                String pregunta = "¿Cólon descubrió América?";

                String resp = JOptionPane.showInputDialog(pregunta + " Si/No");

                if (resp.equalsIgnoreCase("Si")) {
                    resp = JOptionPane.showInputDialog("¿La independencia de México fue en 1810?");

                    if (resp.equalsIgnoreCase("Si")) {
                        resp = JOptionPane.showInputDialog("The Door fue un grupo de rock Americano?: ");

                        if (resp.equalsIgnoreCase("Si")) {
                            JOptionPane.showMessageDialog(null, "Has ganado...");
                        } else {
                            JOptionPane.showMessageDialog
                                    (null, "Respuesta incorrecta, has perdido");
                        }
                    } else {
                        JOptionPane.showMessageDialog
                                (null, "Respuesta incorrecta, has perdido");
                    }
                } else {
                    JOptionPane.showMessageDialog
                            (null, "Respuesta incorrecta, has perdido");
                }
                break;

            case "4":
                JOptionPane.showMessageDialog
                           (null,"El programa ha terminado");
                break;
        }
    }
}

