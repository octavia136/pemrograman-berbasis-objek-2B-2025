/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;
/**
 *
 * @author user
 */
import java.util.Scanner;
public class mahasiswa {
    // Atribut
    String nama;
    String nim;
    String prodi;
    String alamat;
    
   // Constructor
public mahasiswa(String nama, String nim, String prodi, String alamat){
    this.nama = nama;
    this.nim = nim;
    this.prodi = prodi;
    this.alamat = alamat;
}
   // Method
void tampilkaninfo(){
    System.out.println("Nama : " + nama);
    System.out.println("Nim : " + nim);
    System.out.println("Prodi : " + prodi);
    System.out.println("Alamat : " + alamat);
    System.out.println("\n");
}

// main method
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
// Mahasiswa ke 1
    System.out.println("\nMasukkan Data Mahasiswa Pertama (1) :");
    System.out.print("Nama              : ");
    String nama1 = input.nextLine();
    System.out.print("Nim               : ");
    String nim1 = input.nextLine();
    System.out.print("Jurusa/Prodi      : ");
    String prodi1 = input.nextLine();
    System.out.print("Alamat            : ");
    String alamat1 = input.nextLine();
    mahasiswa mahasiswa1 = new mahasiswa(nama1, nim1, prodi1, alamat1);
    
// Mahasiswa ke 2
    System.out.println("\nMasukkan Data Mahasiswa kedua (2) :");
    System.out.print("Nama              : ");
    String nama2 = input.nextLine();
    System.out.print("Nim               : ");
    String nim2 = input.nextLine();
    System.out.print("Jurusan/Prodi     : ");
    String prodi2 = input.nextLine();
    System.out.print("Alamat            : ");
    String alamat2 = input.nextLine();
    mahasiswa mahasiswa2 = new mahasiswa(nama2, nim2, prodi2, alamat2);

// Mahasiswa ke 3
    System.out.println("\nMasukkan Data Mahasiswa Ketiga (3)");
    System.out.print("Nama              : ");
    String nama3 = input.nextLine();
    System.out.print("Nim               : ");
    String nim3 = input.nextLine();
    System.out.print("Jurusan/Prodi     : ");
    String prodi3 = input.nextLine();
    System.out.print("Alamat            : ");
    String alamat3 = input.nextLine();
    mahasiswa mahasiswa3 = new mahasiswa(nama3, nim3, prodi3, alamat3);
    
// Menampilkan Hasil codingan diatas
    System.out.println("\n Hasil Data Mahasiswa");
    mahasiswa1.tampilkaninfo();
    mahasiswa2.tampilkaninfo();
    mahasiswa3.tampilkaninfo();
}
}