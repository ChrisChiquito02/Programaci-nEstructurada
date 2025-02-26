import javax.swing.*;

public class ContinueAndBreak {
    public static void main(String[] args) {
        //declaración de variables
        int suma=0;
        int numero=0;
        int n=0;

        n= Integer.parseInt(JOptionPane.showInputDialog("Introduce el total de números a ingresar: "));

        for (int i=1; i<=n; i++){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número " + i +" : "));
            if (numero==0){
                continue;
            }
            if (numero<0){
                break;
            }
            suma+=numero;
        }

        JOptionPane.showMessageDialog(null, "La suma de los números es: " + suma);
    }
}
