/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodosuk;

import java.util.Random;


public class Equalizer {
    public static void main(String[] args) {
        elvegzett_feladat();
    }

    private static void elvegzett_feladat() {
        lilacsikok();
        lilacsikok(19 , false);
        lilacsikok();
        lilacsikok(8, true);
        lilacsikok();
    }

    private static void lilacsikok() {
        Random rnd=new Random();
        int db=rnd.nextInt(3,8);
       lilacsikok(db);
        
        System.out.println("");
    }
    private static void lilacsikok(int db) {
        Random rnd=new Random();
        
  
        for (int i = 0; i < db; i++) {
            szin();
        
           
        }
        
        System.out.println("");
    }

    private static void szin() {
        System.out.printf("\u001B[45m" + " ");
    }
     private static void lilacsikok(int db, boolean anyi) {
        Random rnd=new Random();
        
         if (anyi==true) {
             for (int i = 0; i < db; i++) {
            szin();
                 System.out.printf( "(" + db + ")" );
         }
           
           
        }
         else{
             lilacsikok();
         }
        
        System.out.println("");
    }

}
