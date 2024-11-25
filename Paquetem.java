import javax.swing.JOptionPane;

public class Paquetem {
    public static void main(String[] args) {
        // para sacar la raiz a un número
        double r, base;
        float numero;
        r=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número al que decea sacarle la raiz"));
        double raiz = Math.sqrt(r);
        JOptionPane.showMessageDialog(null, "La raiz de "+ r + " es"+ raiz);

        // para elevaar un número 
        base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número"));
        double  exponente=2;
        double e= Math.pow(base, exponente);
        JOptionPane.showMessageDialog(null, "El cuadrado de "+ base+ "es: " + e);

        //para redonder un número 
        numero=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el numero que decea redondiar"));
        int s=Math.round(numero);
        JOptionPane.showMessageDialog(null, s);

    }
}
