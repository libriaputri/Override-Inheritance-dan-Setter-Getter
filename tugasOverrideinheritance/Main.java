/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasOverrideinheritance;

/**
 *
 * @author WINDOWS 10
 */
public class Main {
    public static void main(String[] args) {
        Buah buah = new Buah();
        
        //contoh tanpa override
        buah.berasa("jeruk");
        Jeruk jeruk = new Jeruk();
        jeruk.Rasa();
        
        //contoh dengan override
        Kesemek kesemek = new Kesemek();
        kesemek.berasa("Jus Buah Kesemek\n");
        
        //contoh tanpa override
        buah.berasa("Semangka");
        Semangka semangka = new Semangka();
        semangka.Rasa();
        
        Pare pare = new Pare();
        pare.berasa("Jus Buah Pare\n");
        
    }
}
