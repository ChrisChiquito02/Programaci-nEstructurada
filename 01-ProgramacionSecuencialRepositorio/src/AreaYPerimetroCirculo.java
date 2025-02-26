import javax.swing.*;

/**
 * Escribir un programa para calcular y de
 * salida el perímetro y el área de un círculo con un radio de 3,2 pulgadas
 */
public class AreaYPerimetroCirculo {
    public static void main(String[] args) {
        // Definir el radio del círculo
        double radio = 3.2;
        double perimetro=0.0;
        double area=0.0;

        // Calcular el perímetro (circunferencia)
        perimetro = 2 * Math.PI * radio;

        // Calcular el área
        area = Math.PI * Math.pow(radio, 2);

        //Mostrar resultados
        JOptionPane.showMessageDialog(null, "El perímetro del círculo es: " +
                String.format("%.2f",perimetro) + " pulgadas\n" +
                "El área del círculo es: " + String.format("%.2f",area) + " pulgadas cuadradas\n");
    }
}
