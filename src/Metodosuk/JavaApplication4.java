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
        feladatok();
    }

    private static void feladatok() {
        elso10szam();
        kiir("az elsö 10 szám összege = " + elso10szam());
        System.out.println("");
        osszead(10, 20);
        kiir("a és b öszege");
        System.out.println("");
        osszead(5, osszead(4, 6));
        kiir("a három szam gyöke: " + gyökvonas(25));
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
    private static int osszead4(int a, int b, int c,int d){
    int osszeg=a+b+c+d;
        return osszeg;
    
    
    
    
    
    }
    private static double gyökvonas(int gyök){
        double vegeredmeny=  Math.sqrt(gyök);
        return vegeredmeny;
    
    }
}
