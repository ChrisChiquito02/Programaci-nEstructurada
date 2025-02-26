import javax.swing.*;

public class Expresiones {
    public static void main(String[] args) {
        boolean resultado = !(5!=5 || !(5>3&& 3*3==10) || !true) && true ||false;
        JOptionPane.showMessageDialog(null, resultado); 
    }
}
