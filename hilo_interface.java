/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compu_paralela_segundo_parcial;

/**
 *
 * @author mfer-
 */
public class hilo_interface implements Runnable {
    
    
    public void run(){
      
        for(int i = 0; i < 10 ; i++)
            System.out.println(i + " " +
                Thread.currentThread().getName());  
                System.out.println("Termina thread " + Thread.currentThread().getName());
        }
    public static void main(String [] args){
          System.out.println("Hilos Interface");
                new Thread(new hilo_interface(), "Pepe").start();
                new Thread (new hilo_interface(), "Juan").start();
                System.out.println("Termina thread main");
    }
    
}
