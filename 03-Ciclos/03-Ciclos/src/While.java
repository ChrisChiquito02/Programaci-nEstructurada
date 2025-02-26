import javax.swing.*;

public class While {
    public static void main(String[] args) {
        //declaracion de variables
        int num=0;
        int det=0;
        //entrada de datos
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número: "));
        det=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número en que deseas detener: "));
        //proceso del ciclo
        while (num>=det){
            System.out.println(num);
            num--;
        }
    }
}
