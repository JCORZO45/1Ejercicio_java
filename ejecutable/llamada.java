package ejecutable;

import javax.swing.JOptionPane;

public class llamada

{
    public static void main(String[] args)
    {
        int a;
        int z;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de munitos: "));

        if(a <= 3)
        JOptionPane.showMessageDialog(null,"el costo de la llamda es de 300 pesos ");
        
        if (a>3);
        z=(a-3)*50+300;
        JOptionPane.showMessageDialog(null,"el costo de la llamda es de: " + z +" pesos");


    }
}
