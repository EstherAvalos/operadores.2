import javax.swing.JOptionPane;

public class Eje {
    public static void main(String[] args) {
        Float guillermo, luis, juan, total;
        guillermo= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que tiene Guillermo"));
        luis=guillermo/2;
        juan=(guillermo+luis)/2;
        total= guillermo+luis+juan;
        JOptionPane.showMessageDialog(null, "La cantidad de dinero entre los tres es:"+total+ "\nGuillermo:"+ guillermo+
        "\nLuis:"+luis+ "\nJuan:"+juan);
    }
}
