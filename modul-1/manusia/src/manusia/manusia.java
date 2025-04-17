/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manusia;

/**
 *
 * @author user
 */
public class manusia {
     String nama;
     String alamat;
     int umur;
    
    void manusia(String nama, String alamat, int umur){
       this. nama = nama;
      this.  alamat =  alamat;
        this. umur = umur;
    }

    void tampilkanInfo(){
        System.out.println("nama : " +nama);
        System.out.println("alamat : " +alamat);
        System.out.println("umur : " +umur);
}
    
    void berjalan() {
        System.out.println(nama + " sedang berjalan");
}
    
    void berlari() {
       System.out.println(nama + " sedang berlari");
    }
    
public static void main(String[] args) {
        manusia manusia1 = new manusia();
        System.out.println("informasi manusia ke 1");
        manusia1.manusia("Siti Rosiati Octavia Anwaroh", "Bangkalan", 19);
        manusia1.tampilkanInfo();
        manusia1.berjalan();
        manusia1.berlari();
        
        manusia manusia2 = new manusia();
        System.out.println("informasi manusia ke 2");
        manusia2.manusia("Chandra  Crisly", "Palangkaraya", 20);
        manusia2.tampilkanInfo();
        manusia2.berjalan();
        manusia2.berlari();
        
        manusia manusia3 = new manusia();
        System.out.println("informasi manusia ke 3");
        manusia3.manusia("Khoirotul Nur Wahyuni", "Bangkalan", 19);
        manusia3.tampilkanInfo();
        manusia3.berjalan();
        manusia3.berlari();
        
        manusia manusia4 = new manusia();
        System.out.println("informasi manusia ke 4");
        manusia4.manusia("Christio Delvero", "Palangkaraya", 16);
        manusia4.berjalan();
        manusia4.berlari();
        
        manusia manusia5 = new manusia();
        System.out.println("informasi manusia ke 5");
        manusia5.manusia("Caca Yaya", "Kamal", 15);
        manusia5.berjalan();
        manusia5.berlari();
}
}
