package ejecutable;
import javax.swing.JOptionPane;
public class Raices
{
    public static void main(String[] args) 
    {
        //Declaración de variables
        int a,b,c;
        double raiz,resultado1,resultado2;
        resultado1=0;
        resultado2=0;
        
        raiz=0;


        //Input
        
        a= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de a : ", "ax**2+bx+c=0", JOptionPane.PLAIN_MESSAGE));
        b= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de b : ", "ax**2+bx+c=0", JOptionPane.PLAIN_MESSAGE));
        c= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el valor de c : ", "ax**2+bx+c=0", JOptionPane.PLAIN_MESSAGE));

        raiz=(b*b)-4*a*c;
        

        //Processing
        if (raiz<0){
            JOptionPane.showMessageDialog(null, "NO TIENE SOLUCION EN LOS REALES!!","Hey!", JOptionPane.ERROR_MESSAGE);
        }
        else{
        resultado1=(-b-Math.sqrt(raiz))/(2*a);
        resultado2=(-b+Math.sqrt(raiz))/(2*a);
        JOptionPane.showMessageDialog(null,"X1 : " +  resultado1 + "\nX2 : " + resultado2, "RESULTADOS", JOptionPane.PLAIN_MESSAGE);

        }
        
      
        

        //Output
        

        //end
        System.exit(0);
    }
}
