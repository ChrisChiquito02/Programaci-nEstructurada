import javax.swing.*;

public class CondicionalesCompuestos2 {
    public static void main(String[] args) {

        //Declaracion de variables para el menú

        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Estéreos\n" +
                "2)Frutería\n" +
                "3)Empresa" +
                "\n4)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {
            /**
             * Un proveedor de estéreos ofrece un descuento del 10% sobre el precio sin IVA, de algún aparato si
             * este cuesta $2000 o mas. Además, independientemente de esto, ofrece un 5% de descuento si la marca
             * es "NOSY". Determinar cuanto pagara, con IVA incluido, un cliente cualquiera por la compra de su
             * aparato.
             */
            case "1":

                //declaracion de variables
                double desc=0.0;
                double precioDcto=0.0;
                String marca="¿Tu aparato es marca NOSY?";
                String resp = JOptionPane.showInputDialog(marca + "   Si/No") ;
                double iva=0.16;
                double precioAparato=0.0;
                double IVA =0.0;
                double descuento=0.0;
                double precioFin=0.0;
                double preciomarca=0.0;
                double dctomarca=0.0;

                //Entrada de datos
                precioAparato=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio de tu producto: "));

                //Proceso del programa
                if (precioAparato>=2000){
                    desc=precioAparato*0.10;
                    precioDcto=precioAparato-desc;
                    IVA=precioDcto*iva;
                    descuento=precioAparato+IVA;
                    precioFin= IVA +precioDcto;

                    JOptionPane.showMessageDialog
                            (null,"El precio de tu aparato sin IVA es de: " + precioAparato +
                                    "\nEl precio de tu aparato con IVA es de: " + descuento +
                                    "\nEl IVA es de: " + IVA+
                                    "\nEL precio de tu aparato con descuento es de: " + precioFin);
                } else if (resp.equalsIgnoreCase("Si")) {
                    preciomarca=precioFin*.5;
                    dctomarca=precioFin-preciomarca;
                    JOptionPane.showMessageDialog
                            (null,"El precio de tu aparato sin IVA es de: " + precioAparato +
                                    "\nEl precio de tu aparato con IVA es de: " + IVA +
                                    "\nEL precio con descuento es de: " + dctomarca);
                }else{
                    IVA=precioAparato*iva;
                    precioFin=precioAparato+IVA;

                    JOptionPane.showMessageDialog
                            (null,"El precio de tu aparato sin IVA es de: " + precioAparato +
                                    "\nEl IVA es de: " + IVA +
                                    "\nEl precio de tu aparato con IVA es de: " + precioFin);
                }

                break;
            /**
             * Una frutería ofrece las manzanas con descuento según la siguiente tabla:
             * NUM. DE KILOS COMPRADOS
             * 0 - 2
             * 2.01 - 5
             * 5.01 - 10
             * 10.01 en adelante
             * % DESCUENTO
             * 0%
             * 10%
             * 15%
             * 20%
             * Determinar cuanto pagara una persona que compre manzanas es esa frutería.
             */
            case "2":
                //declaración de variables
                double cantKilos = 0.0;
                double precioMan = 0.0;
                String resultado = "";
                precioMan = Double.parseDouble
                        (JOptionPane.showInputDialog("Ingresa el precio de la manzana: "));
                cantKilos = Double.parseDouble
                        (JOptionPane.showInputDialog("Introduce el de kilos de manzana: "));
                if (cantKilos > 0.0 && precioMan > 0.0) {
                    if (cantKilos >= 0.0 && cantKilos <= 2.0) {
                        resultado = "El total a pagar sin descuento es: " + (cantKilos * precioMan);
                    } else if (cantKilos >= 2.01 && cantKilos <= 5.0) {
                        double descuen = (cantKilos * precioMan) * 0.10;
                        resultado = "El total a pagar con un descuento(10%) " + descuen +
                                " es:  " + (cantKilos * precioMan - descuen);
                    } else if (cantKilos >= 5.01 && cantKilos <= 10.0) {
                        double descuen = (cantKilos * precioMan) * 0.15;
                        resultado = "El total a pagar con un descuento(15%) " + descuen +
                                " es:  " + (cantKilos * precioMan - descuen);
                    } else {
                        double descuen = (cantKilos * precioMan) * 0.20;
                        resultado = "El total a pagar con un descuento del " + descuen +
                                " es:  " + (cantKilos * precioMan - descuen);
                    }
                    JOptionPane.showMessageDialog(null, resultado);

                } else {
                    if (cantKilos < 0.0) {
                        JOptionPane.showMessageDialog(null, "La cantidad de kilos no puede ser negativa ni 0");
                    }
                    if (precioMan < 0.0) {
                        JOptionPane.showMessageDialog(null, "El precio no puede ser negativo ni 0");
                    }
                }

                break;
            /**
             * El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente año. La manera de planificarlas depende de lo siguiente:
             * Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para que su nuevo saldo sea de $10 000. Si su capital tiene actualmente un saldo positivo pedirá un préstamo bancario para tener un nuevo saldo de $20 000, pero si su capital tiene actualmente un saldo superior a los $20 000 no pedirá ningún préstamo.
             * Posteriormente repartirá su presupuesto de la siguiente manera.
             * $5 000 para equipo de computo
             * $2 000 para mobiliario y el resto la mitad será para la compra de insumos y la otra para otorgar
             * al personal. Desplegar que cantidades se destinaran para la compra de insumos e incentivos al
             * personal y, en caso de que fuera necesario, a cuanto ascendería la cantidad que se pediría al banco.
             */
            case "3":
                //declaración de variables
            double saldo = 0.0;
            double prestamo = 0.0;
            double equipoComputo = 0.0;
            double compraInsumos = 0.0;
            double incentivos = 0.0;
            double mobiliario = 2000;
            String salida = "";

            //Solicitar saldo
            saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu saldo: "));

            if (saldo < 0.0) {
                prestamo = 10000.0;
            } else if (saldo > 0.0 && saldo < 20000) {
                prestamo = (20000 - saldo);
            } else {
                prestamo = saldo;
            }
            equipoComputo = 5000;
            prestamo -= equipoComputo;
            prestamo -= mobiliario;
            compraInsumos = prestamo / 2.0;
            prestamo -= compraInsumos;
            incentivos = prestamo;

            salida = "Resultados\n" +
                    "Compra de Insumos: " + compraInsumos +
                    "\nIncentivo del Personal: " + incentivos +
                    "\nEquipo Computo: " + equipoComputo +
                    "\nMobiliario: " + mobiliario;

            JOptionPane.showMessageDialog(null, salida);
            break;

            case "4":
                JOptionPane.showMessageDialog
                        (null,"El programa ha terminado");
                break;
        }
    }
}
