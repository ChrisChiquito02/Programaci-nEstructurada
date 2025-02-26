import javax.swing.*;

public class CiclosDoWhile1 {
    public static void main(String[] args) {
        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Tienda de decuentos\n" +
                "2)Supermercado\n" +
                "3)Teatro" +
                "\n4)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {

            /**
             * 1.	En una tienda de descuento las personas que van a pagar el importe de su compra llegan a
             * la caja y sacan una bolita de color, que les dirá que descuento tendrán sobre el total de su compra.
             * Determinar la cantidad que pagara cada cliente desde que la tienda abre hasta que cierra. Se sabe que
             * si el color de la bolita es roja el cliente obtendrá un 40% de descuento; si es amarilla un 25% y
             * si es blanca no obtendrá descuento.
             */
            case "1":
                //declaración de variables
                int numClientes=0;

                // Solicitar número de clientes
                numClientes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de clientes:"));

                //iniciamos contador
                int i = 1;
                double descuento = 0;

                //iniciamos ciclo
                do {
                    // solicitar el monto de la compra
                    double totalCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de la compra " + i  + ": "));

                    //solicitamos el color de la bolita
                    String colorBolita = JOptionPane.showInputDialog("Ingrese el color de la bolita (roja, amarilla, blanca): ");

                    // condicionamos el descuento según el color de la bolita
                    if (colorBolita.equalsIgnoreCase("roja")) {
                        descuento = 0.40;
                    } else if (colorBolita.equalsIgnoreCase("amarilla")) {
                        descuento = 0.25;
                    } else if (colorBolita.equalsIgnoreCase("blanca")) {
                        descuento = 0.0;

                        //en caso de agregar otro color que no exista se cumple con
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Color no válido. No se aplicará descuentoen tu compra");
                    }

                    // total a pagar
                    double totalPagar = totalCompra - (totalCompra * descuento);

                    // Imprimir resultados
                    JOptionPane.showMessageDialog(null, "El cliente " + i  + " debe pagar: $" + totalPagar);

                    //incremento del ciclo
                        i++;

                //se repite hasta que
                } while (i < numClientes);
                break;


            /**
             * 2.	En un supermercado una ama de casa pone en su carrito los artículos que va tomando de los
             * estantes. La señora quiere asegurarse de que el cajero le cobre bien lo que ella ha comprado,
             * por lo que cada vez que toma un artículo anota su precio junto con la cantidad de artículos
             * iguales que ha tomado y determina cuánto dinero gastara en ese artículo; a esto le suma lo que
             * ira gastando en los demás artículos, hasta que decide que ya tomo todo lo que necesitaba.
             * Ayúdale a la señora a obtener el total de sus compras.
             */
            case "2":
                // Declaración de variables al inicio
                double totalCompra = 0;
                double precio;
                int cantidad;
                String proseguir;

                do {
                    //Solicitar precio del producto
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo:"));

                    //Solicitar cantidad de productos
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de artículos:"));

                    //acumulador del pago total
                    totalCompra += precio * cantidad;

                    // ocpion para proseguir o no
                    proseguir= JOptionPane.showInputDialog("¿Desea agregar otro artículo? (si/no)");

                } while (proseguir.equalsIgnoreCase("si"));

                //Imprimir el total de la compra
                JOptionPane.showMessageDialog(null,
                        "El total de la compra es: $" + totalCompra);
                break;

            /**
             * 3.	Un teatro otorga descuentos según la edad del cliente. Determinar la cantidad de dinero
             * que el teatro deja de percibir por cada una de las categorías. Tomar en cuenta que los niños
             * menores de 5 años no pueden entrar al teatro y que existe un precio único en los asientos.
             * Los descuentos se hacen tomando en cuenta el siguiente cuadro:
             *
             * Categoría	Edad	Descuento
             * Categoría 1	5 -14	35%
             * Categoría 2	15-19	25%
             * Categoría 3	20-45	10%
             * Categoría 4	46-65	25%
             * Categoría 5	66 en adelante	35%
             */
            case "3":
                // Declaración de variables
                double precioAsiento;
                int edad;
                double dcto;
                double dineroPerdido;
                String continuar;
                double totalPerdido = 0;

                //solicitar precio de los asientos
                precioAsiento = Double.parseDouble(JOptionPane.showInputDialog
                        ("Ingresa el precio de los asientos: "));

                do {
                    //solicitar la edad del cliente
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del cliente: "));

                    if (edad < 5) {
                        JOptionPane.showMessageDialog(null,
                                "Los niños menores de 5 años no pueden entrar al teatro");
                        dcto = 0;
                    } else if (edad >= 5 && edad <= 14) {
                        dcto = 0.35;
                    } else if (edad >= 15 && edad <= 19) {
                        dcto = 0.25;
                    } else if (edad >= 20 && edad <= 45) {
                        dcto = 0.10;
                    } else if (edad >= 46 && edad <= 65) {
                        dcto = 0.25;
                    } else {
                        dcto = 0.35;
                    }

                    //
                    // cálculo del dinero no percibido por el teatro
                    dineroPerdido = precioAsiento * dcto;
                    totalPerdido += dineroPerdido;

                    //mostrar resultados
                    JOptionPane.showMessageDialog(null,
                            "Su descuento aplicado: " + (dcto * 100) +
                                    "%\nEl dinero que deja de percibir el teatro: $" + dineroPerdido);

                   //Repetir ciclo
                    continuar = JOptionPane.showInputDialog("¿Desea ingresar otro cliente? (si/no)");
                } while (opcion.equalsIgnoreCase("si"));

                // mostrar el dinero no percibido por el banco
                JOptionPane.showMessageDialog(null,
                        "Total de dinero que deja de percibir el teatro es de: $" + totalPerdido);
                break;

            case "4":
                JOptionPane.showMessageDialog
                        (null,"El programa ha terminado");
                break;

        }
    }
}
