import javax.swing.JOptionPane;

public class case1{
   public static void main(String[] args) {
    int n,m;
    float re,mul;
    n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que desea dividir"));
    m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que va a dividir"));
   
    re=n/m;
    System.out.println( "\n" + n + " / "+ m+ " = "+ re);

   }
}