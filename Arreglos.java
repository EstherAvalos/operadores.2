/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
import javax.swing.JOptionPane;
public class Arreglos {
    public static void main (String [] tete){
        //declaracion de variables
        String materias[]= {"CalcDif", "MateDis", "FundPro", "FundInv","Quimica","Dessust"};
        String encabezado[]={"Materia","U1", "U2","U3","U4","U5", "Promedio"};
        byte calificaciones[][]=new byte[6][5];//primero se cuentan las filas y despues las columnas 
        byte x,y=1;
        
        
        for(x=0;x<=5;x++){// maneja las filas
            for(y=0;y<5;y++){//columnoas
                calificaciones[x][y]=Byte.parseByte(JOptionPane.showInputDialog("Ingrese las calificaciones de " + materias[x]+ " Unidad "+ (y+1))); 
                
                
            }
        }
        for(x=0;x<=6;x++){
            System.out.printf(encabezado[x]+ "\t"); 
        }System.out.print("\n");
        for(x=0;x<=5;x++){// maneja las filas
         System.out.print(materias[x] +"\t");
            
          
            for(y=0;y<5;y++){//columnoas
                System.out.print(calificaciones[x][y]+ "\t");    
                
            }
              System.out.println();
        }
    }
}

