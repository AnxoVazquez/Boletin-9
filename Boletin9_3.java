/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base=0;
        int altura=0;
        int area=0;
        
        base= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de la base: "));
        altura= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de la altura: "));
        
        if(base>0 & altura>0){
            area= base*altura;
            JOptionPane.showMessageDialog(null,"El área es "+ area );
        }
            else{
               JOptionPane.showMessageDialog(null,"No puede haber datos negativos");    
                    
        }
    }
    
}
