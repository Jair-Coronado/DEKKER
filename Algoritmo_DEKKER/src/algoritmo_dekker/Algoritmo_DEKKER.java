/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo_dekker;

/**
 *
 * @author Jair Coronado
 */
public class Algoritmo_DEKKER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     boolean ENTRA1 = true;
     boolean ENTRA2 = true;
     
     Entrada1 hilo1= new Entrada1 (ENTRA1,ENTRA2);
     ENTRADA2 hilo2= new ENTRADA2 (ENTRA1,ENTRA2);
        
     hilo1.start();
     hilo2.start();
    }
}
