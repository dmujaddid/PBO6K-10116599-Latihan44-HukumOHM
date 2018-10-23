/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan44.hukumohm;

/**
 *
 * @author NAMA : Robby Eka Purnama KELAS : PBO6K NIM : 10116599 Deskripsi
 * Program :
 *
 */
public class PBO6K10116599Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("==== Hukum Ohm ====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar"
                + "\n akan berbanding lurus dengan beda potensial"
                + "\n pada ujung-ujung kawat penghantar tersebut"
                + "\n asalkan suhu kawat dijaga konstan.");
        System.out.println();
        
        // Inisialisasi
        Baterai baterai = new Baterai();
        
        System.out.println("Kuat Arus\t: " +baterai.getKuatArus() + " ampere");
        System.out.println("Hambatan\t: " +baterai.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan\t: " +baterai.hitungTegangan() + " volt");

    }

}
