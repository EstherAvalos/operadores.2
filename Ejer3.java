import javax.swing.JOptionPane;

public class Ejer3 {
    public static void main(String[] args) {
        float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
        participacion=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota de la praticipación: "));
        primerExamen=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
        segundoExamen=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
        examenFinal=Float.parseFloat(JOptionPane.showInputDialog("Digute la nota del examen final"));

        participacion*=0.10f;
        primerExamen*=0.25f;
        segundoExamen*=0.25f;
        examenFinal*=0.40f;
        notaFinal= participacion+primerExamen+segundoExamen+examenFinal;
        JOptionPane.showMessageDialog(null, "\nLa nota finla es: "+ notaFinal);
    }
}
