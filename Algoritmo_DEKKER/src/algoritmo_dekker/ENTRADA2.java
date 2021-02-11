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
public class ENTRADA2 extends Thread{
boolean ENTRA1;
boolean ENTRA2;
int turn =0;

    public ENTRADA2(boolean ENTRA1, boolean ENTRA2){
        this.ENTRA1 =ENTRA1;
        this.ENTRA2 =ENTRA2;
    }


@Override
public void run(){
 ENTRA2=true;
 while(ENTRA1){
     if(turn ==0){
         ENTRA2=false;
         while (turn ==0){
             System.out.println("Segunda Entrada");
             System.out.println();
             
             
             ENTRA2=true;
             System.out.println("Segunda Entrada, Estado Critico");
             System.out.println();
             
             System.out.println("Segunda Entrada Finalizada");
             System.out.println();
              turn=0;
              ENTRA2=false;
              turn=1;              
         }
     }
 }
}
 
}
