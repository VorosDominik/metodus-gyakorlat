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
        lilacsikok(19);
        lilacsikok();
        lilacsikok(8);
        lilacsikok();
    }

    private static void lilacsikok() {
        Random rnd=new Random();
        
        int db= rnd.nextInt(1,7)+1;
        for (int i = 0; i < db; i++) {
            System.out.printf("\u001B[45m" + " ");
        
           
        }
        
        System.out.println("");
    }
    private static void lilacsikok(int a) {
        Random rnd=new Random();
        
  
        for (int i = 0; i < a; i++) {
            System.out.printf("\u001B[45m" + " ");
        
           
        }
        
        System.out.println("");
    }
}
