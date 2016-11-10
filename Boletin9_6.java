/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0, negativo = 0, poco = 0, trabajadores, porcentaje;
        int[] sueldos = {900, 700, -3000, 1000, 1200,1300,1400,1500,1600,1750};
    
    for(int i=0; i<sueldos.length; i++){
	
        if (sueldos[i]>=1000 && sueldos[i]<=1750){
            contador+=1;
        }
        else if (sueldos[i]<0){
            negativo+=1;
        }
        else if (sueldos[i]<1000){
            poco+=1;
        }
        
        
	}
    
    trabajadores = contador + negativo + poco;
    porcentaje = (poco*100)/trabajadores;
    
        System.out.println("Sueldos entre 1000 y 1750: " + contador + ", los sueldos negativos son: " + negativo + " y los sueldos menores a 1000 son: " + porcentaje + " %");
    }
    
}
