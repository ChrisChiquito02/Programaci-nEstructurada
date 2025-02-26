import javax.swing.*;

public class CiclosLibres2 {
    public static void main(String[] args) {
        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Porcentaje reprobados y aprobados\n" +
                "2)Suma de sucesión\n" +
                "3)Suma de sucesión" +
                "\n4)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {

            /**
             * Leer n calificaciones de un grupo de alumnos. Calcule y escriba el porcentaje de reprobados
             * y de aprobados. Tomando en cuenta que la calificación mínima aprobatoria es de 70.
             */
            case "1":

                //declaración de variables
                int numAlumnos, aprobados = 0, reprobados = 0;
                double calificacion;
                double porcentajeAprobados=0.0;
                double porcentajeReprobados=0.0;

                //solicitar número de alumnos
                numAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));


                //inicio del ciclo
                for (int i = 1; i <= numAlumnos; i++) {
                    calificacion = Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingrese la calificación del alumno " + i + ":"));
                    if (calificacion >= 70) {
                        aprobados++;
                    } else {
                        reprobados++;
                    }
                }
                porcentajeAprobados = aprobados / numAlumnos * 100;
                porcentajeReprobados = reprobados / numAlumnos * 100;


                //impresión de los resultados
                JOptionPane.showMessageDialog(null,
                        "Aprobados: " + porcentajeAprobados +
                                "%\nReprobados: " + porcentajeReprobados + "%");
                break;

                /**
                * Calcular la suma de la siguiente sucesión e imprimir la sucesión y la suma: 20, 25, 30, 35, …. N
                */
            case "2":

                //declaración de variables
                int n, suma = 0;

                //solicitar valor de N
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N:"));

                for (int i = 20; i <= n; i += 5) {
                    suma += i;
                }

                //salida del resultado
                JOptionPane.showMessageDialog(null,
                        "La suma de la sucesión es: " + suma);
                break;

            /**
             * Calcular la suma de la sucesión e imprimir la sucesión y la suma: 1, 4, 9, 16, 25, 36, 49, 64, 81, ...n
             */
            case "3":
                //declaración de variables
                int num, sumaTot = 0;
                String sucesion = "";
                int cuadrado=0;

                //solicitar número límite para la sucesión
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número límite de la sucesión:"));

                //iniciamos ciclo
                for (int i = 1; i <= n; i++) {
                    cuadrado = i * i;
                    sumaTot += cuadrado;

                    //creación de lasucesión
                    sucesion += cuadrado;
                    if (i < n) {
                        sucesion += ", ";
                    }
                }

                //Imprimir suma y sucesión
                JOptionPane.showMessageDialog(null, "Sucesión: " + sucesion + "\nSuma total: " + sumaTot);
                break;


            case "4":
                JOptionPane.showMessageDialog
                        (null, "El programa ha terminado");
                break;
        }
    }
}
