package ejecutable;

import javax.swing.JOptionPane;

public class Test

{
    public static void main(String[] args)
    {

        /*Declaracion de variables*/
        int a;
        int b; 
        int c;
        //input
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite b:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite c:"));


        //processing
        if(a>b)
        if(a>c){
            JOptionPane.showMessageDialog(null,"el numero mayor es: " + a);
            }
        if(b>a)
        if(b>c){
            JOptionPane.showMessageDialog(null,"el numero mayor es: " + b);
            }
        if(c>b)
        if(c>a){
            JOptionPane.showMessageDialog(null,"el numero mayor es: " + c);
            }

        //fin

    
    }
}