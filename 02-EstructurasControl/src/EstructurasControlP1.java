import javax.swing.*;

public class EstructurasControlP1 {

    public static void main(String[] args) {
        //Declaración de variables
        String opcion = "";
        String menu = "a)Juego\n" +
                "b)Fruteria\n" +
                "c)Laboratorio\n" +
                "d)Salir\n" +
                "Elegir una opción: ";

        opcion = JOptionPane.showInputDialog(menu);
        opcion = opcion.toUpperCase();

        switch (opcion) {
            case "A":
            jugar();
                //Llamada al método
            break;

            case "B":
                double cantKilos = 0.0;
                double precio = 0.0;
                String resultado = "";
                precio = Double.parseDouble
                        ("Ingresa el precio de la manzana: ");
                cantKilos = Double.parseDouble
                        ("Introduce el de kilos de manzana: ");
                if (cantKilos > 0.0 && precio > 0.0) {
                    if (cantKilos >= 0.0 && cantKilos <= 2.0) {
                        resultado = "El total a pagar sin descuento es: " + (cantKilos * precio);
                    } else if (cantKilos >= 2.01 && cantKilos <= 5.0) {
                        double descuento = (cantKilos * precio) * 0.10;
                        resultado = "El total a pagar con un descuento(10%) " + descuento +
                                " es:  " + (cantKilos * precio - descuento);
                    } else if (cantKilos >= 5.01 && cantKilos <= 10.0) {
                        double descuento = (cantKilos * precio) * 0.15;
                        resultado = "El total a pagar con un descuento(15%) " + descuento +
                                " es:  " + (cantKilos * precio - descuento);
                    } else {
                        double descuento = (cantKilos * precio) * 0.20;
                        resultado = "El total a pagar con un descuento(20%) " + descuento +
                                " es:  " + (cantKilos * precio - descuento);
                    }
                    JOptionPane.showMessageDialog(null, resultado);

                } else {
                    if (cantKilos < 0.0) {
                        JOptionPane.showMessageDialog(null, "La cantidad de kilos no puede ser negativa ni 0");
                    }
                    if (precio < 0.0) {
                        JOptionPane.showMessageDialog(null, "El precio no puede ser negativo ni 0");
                    }
                }


                break;
            case "C":
                break;
            case "D":
                JOptionPane.showMessageDialog
                        (null,"El programa ha terminado");
                break;
            default:
                JOptionPane.showMessageDialog
                        (null,"Opción no válida");
        }

    }
    public static void jugar(){

        String pregunta = "¿Cólon descubrió América?";
        String resp = JOptionPane.showInputDialog(pregunta + " Si/No");
        if (resp.equalsIgnoreCase("Si")) {
            resp = JOptionPane.showInputDialog("¿La independencia de México fue en 1810?");

            if (resp.equalsIgnoreCase("Si")){
                resp = JOptionPane.showInputDialog("The Door fue un grupo de rock Americano?: ");

                if (resp.equalsIgnoreCase("Si")) {
                    JOptionPane.showMessageDialog(null, "Has ganado...");
                }else {
                    JOptionPane.showMessageDialog
                            (null, "Respuesta incorrecta, has perdido");
                }
                }else {
                JOptionPane.showMessageDialog
                        (null, "Respuesta incorrecta, has perdido");
            }
                }else{
                    JOptionPane.showMessageDialog
                            (null, "Respuesta incorrecta, has perido");
                }
            }
        }


