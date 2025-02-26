import javax.swing.*;

public class For {
    public static void main(String[] args) {
        //declaracion de variables
        int num = 0;
        int det = 0;
        //entrada de datos
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número inical: "));
        det=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número en que deseas detener: "));
        //proceso del ciclo
         for (num= num; num>=det; num--){
             System.out.println(num);
         }
    }
}
