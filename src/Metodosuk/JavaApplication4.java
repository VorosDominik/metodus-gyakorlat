/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodosuk;

/**
 *
 * @author Vörös
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        elso10szam();
        kiir("az elsö 10 szám összege = " + elso10szam());
        osszead(10, 20);
        kiir("a és b öszege");
    }

    private static int elso10szam() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg+=i;
        }
        return osszeg;
    }
    private static int osszead(int a, int b){
    int eredmeny =a+b;
        return eredmeny;
     
    }
    private static void kiir( String szoveg){
        System.out.printf(szoveg);
    }
}
