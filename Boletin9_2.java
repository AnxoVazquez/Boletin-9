package boletin9_2;

/**
 * @author avazquezsuarez
 */
public class Boletin9_2 {

    public static void main(String[] args) {
        int suma=0;
        int producto=0;
       
       for(int i=10; i<=90; i++){
           suma+= i;
       }
       
       for(int i=10; i<=90; i++){
           producto= i*i+1;
       }
       
        System.out.println("La suma es: "+suma);
        System.out.println("La multiplicacion es: "+producto);
    }
    
}
