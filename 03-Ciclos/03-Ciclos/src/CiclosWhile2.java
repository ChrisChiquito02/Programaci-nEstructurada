import javax.swing.*;

public class CiclosWhile2 {
    public static void main(String[] args) {
        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Calcomanias autos\n" +
                "2)Promedio grupo alumnos\n" +
                "3)Promedio edades hombre y mujeres" +
                "\n4)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {

            case "1":
                int n = 0;
                int i = 1, amarilla = 0, rosa = 0, roja = 0, verde = 0, azul = 0;
                int ultimoDigito;

                //Solicitar cantidad de autos
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de autos:"));

                //inicio del ciclo
                while (i <= n) {
                    ultimoDigito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el último dígito de la placa del auto " + i + ":"));

                    if (ultimoDigito == 1 || ultimoDigito == 2) {
                        amarilla++;
                    } else if (ultimoDigito == 3 || ultimoDigito == 4) {
                        rosa++;
                    } else if (ultimoDigito == 5 || ultimoDigito == 6) {
                        roja++;
                    } else if (ultimoDigito == 7 || ultimoDigito == 8) {
                        verde++;
                    } else if (ultimoDigito == 9 || ultimoDigito == 0) {
                        azul++;

                        //si ingresa un valor no válido vuelve a inciar las condicionales
                    } else {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un dígito del 0 al 9.");
                        continue;

                    }

                    i++;
                }
                JOptionPane.showMessageDialog(null, "Cantidad de autos por calcomanía:\n"
                        + "Amarilla: " + amarilla + "\n"
                        + "Rosa: " + rosa + "\n"
                        + "Roja: " + roja + "\n"
                        + "Verde: " + verde + "\n"
                        + "Azul: " + azul);
                break;

            /**
             * Obtener el promedio de calificaciones de un grupo de n alumnos
             */
            case "2":
                //declaración de variables
                int numAlum=0;
                double suma=0.0;
                double prom=0.0;
                int j=1;
                double calif=0.0;

                //solicitar el número de alumnos
                numAlum=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de alumnos: "));

                //Inicialización del ciclo
                while (j<=numAlum){
                    calif=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificaión del alumno " + j + ": "));
                    suma+=calif;
                    j++;
                }
                prom=suma/numAlum;
                JOptionPane.showMessageDialog(null,"El promedio de las calificaciones de los alumnos es: " + prom);

                break;

            /**
             * Calcular el promedio de edades de hombres, mujeres y de todo un grupo de n alumnos
             */
            case "3":
                //declaración de variables
                int numAlumnos=0;
                double promedio=0.0;
                double sumaEdades=0.0;
                int k = 1, hombres = 0, mujeres = 0;
                int edadHombre=0, edadMujer=0;
                int edad=0;
                double promedioHom=0.0, promedioMuj=0.0;
                String genero="";

                //solicitar numero de alumnos
                numAlumnos=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de alumnos: "));

                while (k<=numAlumnos) {
                    //pregunta para determinar si es hombre o mujer
                    genero = JOptionPane.showInputDialog
                            ("Ingrese el género de la persona " + k + " (M para mujer, H para hombre):");

                    if (genero.equalsIgnoreCase("M")) {
                        mujeres++;
                        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad: "));
                        edadMujer+=edad;
                        promedioMuj=edadMujer/mujeres;

                    } else if (genero.equalsIgnoreCase("H")) {
                        hombres++;
                        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad: "));
                        edadHombre+=edad;
                        promedioHom=edadHombre/hombres;
                    }
                    k++;
                }
                JOptionPane.showMessageDialog(null,
                        "El promedio de edad de los hombres es de: " + promedioHom +
                                "\nEl promedio de edad de las mujeres es de: " +promedioMuj);
                break;

            case "4":
                JOptionPane.showMessageDialog
                        (null,"El programa ha terminado");
                break;
        }
    }
}
