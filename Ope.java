import javax.swing.JOptionPane;

public class Ope {

    public static void main(String[] args) {
        float num1, num2, resta, suma, div, mult, resto;
        num1=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el primer número"));
        num2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el segundo número"));
        suma= num1+num2;
        resta=num1-num2;
        mult=num1*num2;
        div=num1/num2;
        resto=num1%num2;

        JOptionPane.showMessageDialog(null, "la suma es: "+suma+
        "\n la resta es: "+ resta+
        "\n la multiplicación es: "+ mult+
        "\n la divición es: "+ div+
        "\n la el restante es: "+resto);
    }
}