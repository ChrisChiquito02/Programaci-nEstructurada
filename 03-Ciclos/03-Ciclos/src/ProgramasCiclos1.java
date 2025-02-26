import javax.swing.*;

public class ProgramasCiclos1 {
    public static void main(String[] args) {
        //declaracion de variables
        String menu = "";
        String opcion = "";
        boolean sentinel = true;

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Promedio de Calificaciones (for)\n" +
                "2)Vendedores (while)\n" +
                "3)Tienda (do-while)" +
                "\n4)Salir" +
                "\nElegir opción";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    int numCalif = 0;
                    double calif = 0.0;
                    double promedio = 0.0;

                    //solicictar el número de calificaciones
                    numCalif = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de calificaciones: "));

                    for (int i = 1; i <= numCalif; i++) {
                        //Solicitar calificación
                        calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificación " + i + " : "));

                        //acumular calificaciones
                        promedio += calif;
                    }
                    promedio /= numCalif;
                    JOptionPane.showMessageDialog(null, "El promedio del alumno es: " + promedio);
                    break;
                case "2":
                    String nombre = "";
                    int numVendedores = 0;
                    double sueldoBase = 0.0;
                    double v1 = 0.0;
                    double v2 = 0.0;
                    double v3 = 0.0;
                    double comisión = 0.0;
                    String salida = "";
                    double sueldoTotal = 0.0;

                    numVendedores = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de vendedores: "));
                    sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el sueldo base: "));

                    salida = "Nombre     Comisión     Sueldo total\n";

                    int i = 1;

                    while (i <= numVendedores) {
                        nombre = JOptionPane.showInputDialog("Introduce el nombre del vendedor " + i + " :");
                        v1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 1: "));
                        v2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 2: "));
                        v3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 3: "));

                        comisión = (v1 + v2 + v3) * .10;
                        sueldoTotal = sueldoBase + comisión;
                        salida += nombre + "     " + comisión + "     " + sueldoTotal + "\n";
                        i++;
                    }

                    JOptionPane.showMessageDialog(null, salida);
                    break;

                case "3":
                    //Tienda de bolitas
                    String respuesta = "", resultado = "";
                    boolean sentinel2 = true;
                    double totalCompra = 0.0, descuento = 0.0, importe = 0.0, total = 0.0;
                    String tipoBolita = "";
                    String menuBolita = "Tombola\n" +
                            "a)Bolita roja\n" +
                            "b)Bolita Amarilla\n" +
                            "c)Bolita Blanca\n" +
                            "Elegir opción";

                    resultado = "Total de ventas\n" +
                            "Total a pagar              " + "Descuento            " + "Importe          \n";
                    do {
                        totalCompra = Double.parseDouble(JOptionPane.showInputDialog("Introduce el total de la compra: "));
                        tipoBolita = JOptionPane.showInputDialog(menuBolita);

                        if (tipoBolita.equalsIgnoreCase("a")
                                || tipoBolita.equalsIgnoreCase("b")
                                || tipoBolita.equalsIgnoreCase("c")
                        ) {
                            if (tipoBolita.equalsIgnoreCase("a")) {
                                descuento = totalCompra * .40;
                            } else if (tipoBolita.equalsIgnoreCase("b")) {
                                descuento = totalCompra * .25;
                            } else {
                                descuento = 0.0;
                            }

                            importe = totalCompra - descuento;
                            total += importe;

                            resultado += totalCompra + "            " + descuento + "            " + importe + "\n";
                        } else {
                            JOptionPane.showMessageDialog(null, "Bolita no valida");
                        }

                        salida = JOptionPane.showInputDialog("Desea cerrar la caja Si/No");

                        if (salida.equalsIgnoreCase("si")) ;
                        sentinel2 = false;

                    }while (sentinel2);
                    resultado += "Total: " + total;
                    JOptionPane.showMessageDialog(null, resultado);
                    break;


                case "4":
                    JOptionPane.showMessageDialog(null, "Ádios, el programa ha terminado");
                    sentinel2 = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (sentinel);
    }
}
