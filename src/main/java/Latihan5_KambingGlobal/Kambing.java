/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5_KambingGlobal;

/**
 *
 * @author 
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Penggunaan Method dan Penambahan hasil variabel
 */
public class Kambing {
//Variabel Jumlah Kambing Menjadi Variabel Instance
    
    int jumlahKambing = 88;
    
//Method Untuk Menampilkan Jumlah Kambing
public void getJumlahKambing() {
    System.out.println("Jumlah Kambing : " +  jumlahKambing);
}
    
 public void tambahKambing () {
    //Deklarasi Variabel Lokal
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah : " + jumlahKambing
        );

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingSusu = new Kambing();
        
        kambingSusu.getJumlahKambing();
        
        kambingSusu.tambahKambing();
        
        kambingSusu.getJumlahKambing();
        
       
    }

}