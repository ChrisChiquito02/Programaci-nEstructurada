import javax.swing.*;

public class CicloFor1 {
    public static void main(String[] args) {

        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Promedio\n" +
                "2)Calificaciones grupales\n" +
                "3)Tabla de multiplicar" +
                "\n4)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {
            /**
             * Calcular el promedio de un alumno que tiene n calificaciones en la materia de Metodología de
             * la programación.
             */
            case "1":
                //declaracion de variables
                int numCalif=0;
                double calif=0.0;
                double prom=0.0;
                double sum=0.0;

                //entrada de datos
                numCalif=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de calificaciones: "));
                for (int i = 1; i <= numCalif ; i++) {
                    calif=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificación " + i + " : "));
                    sum+=calif;
                    prom=sum/numCalif;
                }
                JOptionPane.showMessageDialog(null,"Tu promedio es de: " + prom);
                break;


            /**
             * Suponga que se tiene un conjunto de calificaciones de un grupo de n alumnos.
             * Realizar un programa para calcular la calificación media y la calificación más baja de
             * todo el grupo.
             */
            case "2":

                //declaración de variables de alumnos
                int numAlum = 0;

                //solicitar numero de alumnos
                numAlum = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de alumnos: "));

                // debemos de validar que el número de alumnos sea mayor que 0
                if (numAlum <= 0) {
                    JOptionPane.showMessageDialog(null,
                            "El número de alumnos debe ser mayor que 0.");
                    return;
                }

                //declaración de variables para haer cálculos
                double suma = 0;
                double minima = 0;

                //Solictar primer calificaión
                double primeraCalificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno 1:"));
                suma += primeraCalificacion;
                minima = primeraCalificacion;

                //Solicitar calificicaciones restantes y hacer calculo de la calificaion media y calificaion minima
                for (int i = 2; i <= numAlum; i++) {
                    double calificacion = Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingrese la calificación del alumno " + i + ":"));
                    suma += calificacion;
                    if (calificacion < minima) {
                        minima = calificacion;
                    }
                }

                // calculamos el promedio
                double promedio = suma / numAlum;

                // impresion de resultados
                JOptionPane.showMessageDialog(null,
                        "Los resultados son:\nCalificación media: " + promedio +
                                "\nCalificación más baja: " + minima);
                break;

            case "3":
                //declaración de variables
                int num=0;
                int tabla=0;
                num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu número para calcular su tabla de multiplicar"));

                for (int i = 1; i <=10 ; i++) {
                    tabla=num*i;
                    JOptionPane.showMessageDialog(null, num +"*" + i + "=" + tabla);
                }
                break;
            case "4":
                JOptionPane.showMessageDialog
                        (null,"El programa ha terminado");
                break;
        }
    }
}
