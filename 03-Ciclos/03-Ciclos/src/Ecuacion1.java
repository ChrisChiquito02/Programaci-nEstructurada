import javax.swing.*;

public class Ecuacion1 {
    public static void main(String[] args) {
        //Declaración de variables
        int n=0;
        double s=0.0;
        int denSup=0;
        int deno=0;
        double x=0.0;

        do {
            n=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de Fracciones: "));
            x=Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de X: "));

            if (n<0 && x<0){
                JOptionPane.showMessageDialog(null, "Los dos valores no pueden ser negativos");
            } else if (n<0) {
                JOptionPane.showMessageDialog(null, "El valor de n no puede ser negativo");
            }else{
                JOptionPane.showMessageDialog(null, "EL valor de x no puede ser negativox");
            }
        }while (n<0 || x<0.0);

        //Inicializar las variables
        denSup=3;
        deno=1;

        for (int i = 1; i<=n; i++) {
            s+=Math.pow(x,3.0/denSup)/deno;
            denSup+=3;
            deno+=2;
        }

            JOptionPane.showMessageDialog(null,"El valor de 'S' es: " + String.format("%.3f",s));
    }
}
