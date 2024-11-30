import javax.swing.JOptionPane;

public class horas {
    public static void main(String[] args) {
        int semanas, horas, dias;
        String ht=JOptionPane.showInputDialog("Digite el total de horas");
        int horastotales= Integer.parseInt(ht);
        semanas=horastotales/168;
        dias=horastotales/24;
        horas=horastotales%24;
        JOptionPane.showMessageDialog(null, "El equivalente es"+ "\nSemanas:" + semanas+"\nDias: "+dias+ "\nHoras: "+ horas);
    }
}
