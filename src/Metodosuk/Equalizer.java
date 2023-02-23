/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodosuk;

import java.util.Random;


public class Equalizer {
    public static void main(String[] args) {
        lilacsikok();
        lilacsikok();
        lilacsikok();
        lilacsikok();
        lilacsikok();
    }

    private static void lilacsikok() {
        Random rnd=new Random();
        int db= rnd.nextInt(7)+1;
        for (int i = 0; i < db; i++) {
            System.out.printf("\u001B[45m" + " ");
        
           
        }
        System.out.println("");
    }
}
