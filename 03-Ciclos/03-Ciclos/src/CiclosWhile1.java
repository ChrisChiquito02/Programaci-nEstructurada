import javax.swing.*;

public class CiclosWhile1 {
    public static void main(String[] args) {

        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Compañía de seguros\n" +
                "2)Sueldo Obreros\n" +
                "3)Hombres y mujeres" +
                "\n4)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {

            /**
             * Una compañía de seguros tiene contratados a n vendedores. Cada uno hace tres ventas a
             * la semana. Su política de pagos es que un vendedor recibe un sueldo base y un 10% extra por
             * comisiones de sus ventas. El gerente de su compañía desea saber cuánto dinero obtendrá en la
             * semana cada vendedor por concepto de comisiones por las tres ventas realizadas, y cuanto tomando
             * en cuenta su sueldo base y sus comisiones.
             */
            case "1":
                //declaración de variables
                int numVendedores=0;
                double venta1=0.0;
                double venta2=0.0;
                double venta3=0.0;
                double sueldoBase=0.0;
                final double comisionVenta=.10;
                double comisiones=0.0;
                double sueldoFinal=0.0;
                int i=1;

                //solicitar numero de vendedores
                numVendedores=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de vendedores: "));
                while (i<=numVendedores){
                    sueldoBase=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el sueldo base del vendedor " + i + ": "));
                    venta1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto de la primer venta del vendedor " + i + ": "));
                    venta2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto de la segunda venta del vendedor " + i + ": "));
                    venta3=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto de la tercer venta del vendedor " + i + ": "));

                    comisiones= (venta1+venta2+venta3)*comisionVenta;
                    sueldoFinal=comisiones+sueldoBase;

                    JOptionPane.showMessageDialog(null,
                            "El vendedor " + i + " tuvo $" + comisiones + " de comisiones" +
                                    "\nY su sueldo final es de: $" + sueldoFinal);
                    i++;
                }
                break;

            /**
             * 2.	En una empresa se requiere calcular el salario semanal de cada uno de los n obreros que
             * laboran en ella. El salario de la siguiente manera:
             * a.	Si el obrero trabaja 40 horas o menos se le paga $20 por hora
             * b.	Si trabaja más de 40 horas se le paga $20 por cada una de las primeras 40 horas y
             * $25 por cada hora extra.
             */
            case "2":
                //declaración de variables
                int numObreros=0;
                double horasTrabajadas=0.0;
                double salario=0.0;
                int j=1;

                //solicitar número de obreros
                numObreros=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de obreros: "));
                while (j<=numObreros){
                    horasTrabajadas=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el número de horas trabajadas del obrero " + j + ": "));
                    if (horasTrabajadas<=40){
                        salario=horasTrabajadas*20;
                    }else {
                        salario=40*20 + (horasTrabajadas-40)*25;
                    }
                    JOptionPane.showMessageDialog(null,
                            "El obrero " + j + " tiene un horario semanal de: $" + salario);
                    j++;
                }
                break;

            /**
             * Determinar cuántos hombres y cuantas mujeres se encuentran en un grupo de n personas,
             * suponiendo que los datos son extraídos alumno por alumno.
             */
            case "3":
                //declaración de variables
                int numAlum=0;
                int k = 1, hombres = 0, mujeres = 0;
                String genero="";
                //solicitar numero de alumnos
                numAlum=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de alumnos: "));

                //inicio del ciclo
                while (k<=numAlum) {
                    //pregunta para determinar si es hombre o mujer
                    genero = JOptionPane.showInputDialog
                            ("Ingrese el género de la persona " + k + " (M para mujer, H para hombre):");

                    if (genero.equalsIgnoreCase("M")) {
                        mujeres++;
                    } else if (genero.equalsIgnoreCase("H")) {
                        hombres++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese M o H.");
                        continue;
                    }
                    k++;
                }
                JOptionPane.showMessageDialog(null,
                        "Total de hombres en el grupo: " + hombres +
                                "\nTotal de mujeres en el grupo: " + mujeres);
                break;

            case "4":
                JOptionPane.showMessageDialog
                        (null,"El programa ha terminado");
                break;
        }
    }
}
