import javax.swing.JOptionPane;

public class empresa {
    public static void main(String[] args) {
      float ve, sm, v, co, c;
      short sa;
      sa=1000;
      c=Float.parseFloat(JOptionPane.showInputDialog("Inrese los carros vendicos"));
      co=c*150;
      ve=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto de la venta total"));
      v=(float)(ve*0.05)/100;
      sm=sa+co+v;
      JOptionPane.showMessageDialog(null, "El salari mensul es: "+sm);
    }
}
