import javax.swing.*;

public class CondicionalesCompuestos3 {
    public static void main(String[] args) {
        //Declaracion de variables para el menú

        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Anémicos\n" +
                "2)Rendimiento académico\n" +
                "3)Número medio" +
                "\n4)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {

            /**
             * Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un medico
             * determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la sangre,
             * de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor que el rango
             * que le corresponde, se determina su resultado como positivo y en caso contrario como negativo.
             * La tabla en la que el medico se basa para obtener el resultado es la siguiente:
             * EDAD
             * 0-1 mes
             * > 1 y < = 6 meses
             * > 6 y < = 12 meses
             * > 1 y < = 5 años > 5 y < = 10 años > 10 y < 15 años mujeres > 15 años
             * =
             * hombres > 15 años
             * NIVEL HEMOGLOBINA
             * 13 - 26 g%
             * 10 - 18 g%
             * 11 - 15 g% 11.5-15 g% 12.6-15.5 g% 13 - 15.5 g%
             * 12
             * - 16 g%
             * 14
             * - 18 g%
             */
            case "1":
                double edad = Double.parseDouble
                                (JOptionPane.showInputDialog("Ingrese la edad en años: "));
                double hemoglobina = Double.parseDouble(JOptionPane.showInputDialog
                                ("Ingrese el nivel de hemoglobina: "));

                String sexo = "";
                if (edad > 15) {
                    sexo = JOptionPane.showInputDialog
                            ("Ingrese el sexo M para masculino y F para femenino: ").toUpperCase();
                }

                // Determinar el rango de hemoglobina
                double minHemoglobina = 0;
                double maxHemoglobina = 0;

                if (edad >= 0 && edad <= 1.0 / 12) {
                    minHemoglobina = 13; maxHemoglobina = 26;

                } else if (edad > 1.0 / 12 && edad <= 0.5) {
                    minHemoglobina = 10; maxHemoglobina = 18;

                } else if (edad > 0.5 && edad <= 1) {
                    minHemoglobina = 11; maxHemoglobina = 15;

                } else if (edad > 1 && edad <= 5) {
                    minHemoglobina = 11.5; maxHemoglobina = 15;

                } else if (edad > 5 && edad <= 10) {
                    minHemoglobina = 12.6; maxHemoglobina = 15.5;

                } else if (edad > 10 && edad <= 15) {
                    minHemoglobina = 13; maxHemoglobina = 15.5;

                } else if (edad > 15 && sexo.equalsIgnoreCase("F")) {
                    minHemoglobina = 12; maxHemoglobina = 16;

                } else if (edad > 15 && sexo.equalsIgnoreCase("M")) {
                    minHemoglobina = 14; maxHemoglobina = 18;

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Datos inválidos. Ingresa una edad y sexo válido.");
                    return;
                }

                        // Determinar si tiene anemia
                if (hemoglobina < minHemoglobina) {
                    JOptionPane.showMessageDialog
                            (null, "El paciente tiene anemia");
                } else {
                    JOptionPane.showMessageDialog
                            (null, "El paciente no tiene anemia");
                }
                break;



            /**
             * Una institución educativa estableció un programa para estimular a los alumnos con buen rendimiento
             * académico y que, consiste en lo siguiente:
             * Si el promedio es de 9.5 o más y el alumno es de preparatoria, entonces este podrá cursar
             * 55 unidades y se le hará un 25% de descuento.
             * Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de preparatoria, entonces
             * este podrá cursar 50 unidades y se le hará un 10% de descuento.
             * Si el promedio es mayor que 7 y menor que 9 y el alumno es de preparatoria, este podrá cursar
             * 0 unidades y no tendrá ningún descuento.
             * Si el promedio es de 7 o menor, el numero de materias reprobadas es de 0 a 3 y el alumno es de
             * preparatoria, entonces podrá cursar 45 unidades y no tendrá descuento.
             * Si el promedio es de 7 o menor, el numero de materias reprobadas es de 4 o mas y el alumno es de
             * preparatoria, entonces podrá cursar 40 unidades y no tendrá ningún descuento.
             * Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá cursar 55
             * unidades y se le hará un 20% de descuento.
             * Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55 unidades
             * y no tendrá descuento.
             * Obtener el total que tendrá que pagar un alumno si la colegiatura para alumnos de
             * profesional es de $300 por cada cinco unidades y para alumnos de preparatoria es de $180 por
             * cada cinco unidades.
             */
            case "2":
                //declaración de variables
                int materiasRep=0;
                String quest="¿En que nivel de educación está el estudiante?";
                double promedio=0.0;
                double descuento=0.0;
                int unidades=0;
                int gpoUnid=0;
                double colegiatura=0;
                double colegTot =0.0;
                double pagoCole =0.0;
                
                //Validar nivel

                String nivel = JOptionPane.showInputDialog(quest + " Preparatoria/Profesional");
                promedio=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el promedio del estudiante: "));

                if (promedio<0){
                    JOptionPane.showMessageDialog(null, "El promedio debe ser mayor a 0");

                } else if (promedio>=9.5 && nivel.equalsIgnoreCase("Preparatoria" )) {
                    unidades=55;
                    colegiatura=180;
                    JOptionPane.showMessageDialog(null,"Este alumno podrá cursar 55 unidades y se " +
                            "le hará un 25% de descuento. ");
                    gpoUnid=unidades/5;
                    colegTot =gpoUnid*colegiatura;
                    descuento=colegTot*.25;
                    pagoCole =colegTot-descuento;
                    JOptionPane.showMessageDialog(null,
                            "El alumno debe pagar una colegiatura de: $" + pagoCole);

                } else if (promedio>=9 && promedio<9.5 && nivel.equalsIgnoreCase("Preparatoria") ) {
                    unidades=50;
                    colegiatura=180;
                    JOptionPane.showMessageDialog(null,"Este alumno podrá cursar 50 unidades y se " +
                            "le hará un 10% de descuento. ");
                    gpoUnid=unidades/5;
                    colegTot =gpoUnid*colegiatura;
                    descuento=colegTot*.10;
                    pagoCole =colegTot-descuento;
                    JOptionPane.showMessageDialog(null,
                            "El alumno debe pagar una colegiatura de: $" + pagoCole);
                    
                } else if (promedio>7 && promedio<9 && nivel.equalsIgnoreCase("Preparatoria")) {
                    unidades=50;
                    colegiatura=180;
                    JOptionPane.showMessageDialog(null,"Este alumno podrá cursar 50 unidades y no se" +
                            "aplica descuento");
                    gpoUnid=unidades/5;
                    colegTot =gpoUnid*colegiatura;
                    JOptionPane.showMessageDialog(null,
                            "El alumno debe pagar una colegiatura de: $" + colegTot);
                    
                } else if (promedio <= 7 && materiasRep >= 0 && materiasRep <= 3 && nivel.equalsIgnoreCase
                        ("Preparatoria")) {
                    materiasRep=Integer.parseInt(JOptionPane.showInputDialog
                            ("Ingresa el número de materias reprobadas: "));
                    unidades=45;
                    colegiatura=180;
                    JOptionPane.showMessageDialog(null,"Este alumno podrá cursar 45 unidades " +
                            "y debido a que tiene " + materiasRep + " materias reprobadas no se le aplica ningún descuento");
                    gpoUnid=unidades/5;
                    colegTot =gpoUnid*colegiatura;
                    JOptionPane.showMessageDialog(null,
                            "El alumno debe pagar una colegiatura de: $" + colegTot);
                    
                } else if (promedio<7 && materiasRep>=4 && nivel.equalsIgnoreCase("Preparatoria")) {
                    materiasRep=Integer.parseInt(JOptionPane.showInputDialog
                            ("Ingresa el número de materias reprobadas: "));
                    unidades=40;
                    colegiatura=180;
                    JOptionPane.showMessageDialog(null,"Este alumno podrá cursar 40 unidades " +
                            "y debido a que tiene " + materiasRep + " materias reprobadas no se le aplica ningún descuento");
                    gpoUnid=unidades/5;
                    colegTot =gpoUnid*colegiatura;
                    JOptionPane.showMessageDialog(null,
                            "El alumno debe pagar una colegiatura de: $" + colegTot);
                    
                } else if (promedio>=9.5 && nivel.equalsIgnoreCase("Profesional")) {
                    unidades=55;
                    colegiatura=300;
                    JOptionPane.showMessageDialog(null,"Este alumno podrá cursar 55 unidades y se " +
                            "le hará un 20% de descuento. ");
                    gpoUnid=unidades/5;
                    colegTot =gpoUnid*colegiatura;
                    descuento=colegTot*.20;
                    pagoCole =colegTot-descuento;
                    JOptionPane.showMessageDialog(null,
                            "El alumno debe pagar una colegiatura de: $" + pagoCole);
                    
                } else if (promedio<9 && nivel.equalsIgnoreCase("Profesional")) {
                    unidades=55;
                    colegiatura=300;
                    JOptionPane.showMessageDialog(null,"Este alumno podrá cursar 55 unidades y no se" +
                            "aplica descuento");
                    gpoUnid=unidades/5;
                    colegTot =gpoUnid*colegiatura;
                    JOptionPane.showMessageDialog(null,
                            "El alumno debe pagar una colegiatura de: $" + colegTot);
                }
                break;


            /**
             * Que lea tres números diferentes y determine el numero medio del conjunto de los tres
             * números (el numero medio es aquel numero que no es ni mayor, ni menor).
             */
            case "3":
                //Declaracion de variables
                int num1=0;
                int num2=0;
                int num3=0;

                //solicitar números

                num1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número "));
                num2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número: "));
                num3=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer número: "));

                //identificar cual es el número medio
                if (num1>num2 && num1<num3){
                    JOptionPane.showMessageDialog(null,"El número medio es: " + num1);
                } else if (num2>num1 && num2<num3) {
                    JOptionPane.showMessageDialog(null, "El número medio es: " + num2);
                }else{
                    JOptionPane.showMessageDialog(null, "El número medio es: " + num3);
                }
                break;
            case "4":
                JOptionPane.showMessageDialog
                        (null,"El programa ha terminado");
                break;
        }
    }
}
