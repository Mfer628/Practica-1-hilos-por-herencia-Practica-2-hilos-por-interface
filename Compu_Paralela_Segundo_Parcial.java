/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compu_paralela_segundo_parcial;

/**
 *
 * @author mfer-
 */
public class Compu_Paralela_Segundo_Parcial extends Thread {
    public Compu_Paralela_Segundo_Parcial(String str) {
        super(str);
        }
        public void run() {
        for(int i = 0; i < 10 ; i++)
            System.out.println(i + " " + getName());
            System.out.println("Termina thread " + getName());
            }
        public static void main( String [] args) {
            new Compu_Paralela_Segundo_Parcial("Pepe").start();
            new Compu_Paralela_Segundo_Parcial("Juan").start();
            System.out.println("Termina thread main");
            }

   
    
}
