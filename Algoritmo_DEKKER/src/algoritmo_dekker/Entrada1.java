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
public class Entrada1 extends Thread{
boolean ENTRA1;
boolean ENTRA2;
int turn =1;

    public Entrada1(boolean ENTRA1, boolean ENTRA2){
        this.ENTRA1 =ENTRA1;
        this.ENTRA2 =ENTRA2;
    }

@Override
public void run(){
 ENTRA1=true;
 while(ENTRA2){
     if(turn ==1){
         ENTRA1=false;
         while (turn ==1){
             System.out.println("Primera Entrada");
             System.out.println();
              ENTRA1=true;
              
             System.out.println("Primera Entrada, Estado Critico");
             System.out.println();
             
             System.out.println("Primera Entrada Finalizada");
             System.out.println();
              turn=1;
              ENTRA1=false;
              turn=0;              
         }
     }
 }
}
 
}
