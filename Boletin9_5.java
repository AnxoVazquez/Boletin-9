/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;
import javax.swing.JOptionPane;
/**
 *
 * @author avazquezsuarez
 */
public class Boletin9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int suma = 0;
        int contador =0;
        int a=0,b=0,c=0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        //a
        for (int i = 0; i<numero; i++){
            System.out.print((suma+=2) + " ");
        }
           System.out.println("");
        //b
        for (int i = 0; i<numero; i++){
            if (i%2==0){
                System.out.print(-(contador+=1) + " ");
            }
            else{
                System.out.print("+" + (contador+=1) + " ");
            }
        }
        System.out.println("");
        //c
        
        a=0;
        b=1;
        
        for (int i = 0; i<numero; i++){
            
                      
            System.out.print(" " + a);
            a = a+b;
            c=a-b;
            b=c;
            
        }
    }
    
}
