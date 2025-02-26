import javax.swing.*;

public class CiclosLibres5 {
    public static void main(String[] args) {
        String menu = "";
        String opcion = "";

        //creacion del menu

        menu = "Menu Principal\n" +
                "1)Suma de positivos, multiplicación de negativos\n" +
                "2)Serie 1\n" +
                "3)Serie 2\n" +
                "4)Imprimir del 1000 al 0" +
                "\n5)Salir" +
                "\nElegir opción";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {

            /**
             * Ingresar n números sumar los + y multiplicar los –
             */
            case "1":
                //declaración de variables
                int n, numero, sumaPositivos = 0, productoNegativos = 1;

                //solicitar cantidad de números
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de números: "));

                //iniciamos ciclo
                for (int i = 0; i < n; i++) {
                    //solicitamos números
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

                    //condicionamos para sumar
                    if (numero >= 0) {
                        sumaPositivos += numero; // Sumar positivos

                        //condicionamos para multiplicar
                    } else {
                        productoNegativos *= numero; // Multiplicar negativos
                    }
                }

                //imprimir resultados
                JOptionPane.showMessageDialog(null,
                        "Suma de positivos: " + sumaPositivos +
                        "\nProducto de negativos: " + productoNegativos);
                break;

            /**
             * Realizar un programa que resuelva la siguiente serie:
             *
             *
             * 𝑆 =
             *
             *
             * 𝑥3/3
             * +
             * 1
             *
             *
             * 𝑥3/6
             * +
             * 3
             *
             *
             * 𝑥3/9
             * +
             * 5
             *
             * 𝑥3/12
             *
             *
             * 7
             *
             *
             * … . 𝑛
             */
            case "2":
                //Declaración de variables
                int NUM=0;
                double s=0.0;
                int denSup=0;
                int deno=0;
                double x=0.0;

                do {
                    NUM=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de Fracciones: "));
                    x=Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de X: "));

                    if (NUM<0 && x<0){
                        JOptionPane.showMessageDialog(null, "Los dos valores no pueden ser negativos");
                    } else if (NUM<0) {
                        JOptionPane.showMessageDialog(null, "El valor de n no puede ser negativo");
                    }else{
                        JOptionPane.showMessageDialog(null, "EL valor de x no puede ser negativox");
                    }
                }while (NUM<0 || x<0.0);

                //Inicializar las variables
                denSup=3;
                deno=1;

                for (int i = 1; i<=NUM; i++) {
                    s+=Math.pow(x,3.0/denSup)/deno;
                    denSup+=3;
                    deno+=2;
                }

                JOptionPane.showMessageDialog(null,"El valor de 'S' es: " + String.format("%.3f",s));
                break;

            /**
             * Realizar un programa que resuelva la siguiente serie:
             *
             *
             * 𝑆 =
             *
             * 𝑥3/3
             * +
             * 1
             *
             * 𝑥3/6
             * −
             * 3
             *
             * 𝑥3/9
             * +
             * 5
             *
             * 𝑥3/12
             * −
             * 7
             *
             * 𝑥3/15
             *
             *
             * 9
             *
             *
             * … . 𝑛
             */
            case "3":
                //declracion de varibales
                double S =0.0;
                double X =0.0;
                int Num =0;
                double denominador =0.0;
                int i=0;
                double supDeno=0.0;

                Num =Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de fraciones a resolver: "));

                i=1;
                denominador =1;
                supDeno=3;
                while (i<= Num){
                    X =Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x: "));

                    if (i%2!=0){
                        S +=Math.pow(X,3.0/supDeno)/ denominador;
                    }else{
                        S -=Math.pow(X,3.0/supDeno)/ denominador;
                    }
                    i++;
                    supDeno+=3;
                    denominador +=2;
                }
                JOptionPane.showMessageDialog(null, "El resultado es: " + S);
                break;

            /**
             * Realizar un programa que imprima del 1000 al 0
             */
            case "4":
                //no necesitamos variables mas que la del ciclo y solo debemos imprmir
                for (int k = 1000; k >= 0; k--) {
                    System.out.println(k + " ");
                }
                break;


            case "5":
                JOptionPane.showMessageDialog
                        (null, "El programa ha terminado");
                break;
        }
    }
}
