/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa1;

/**
 *
 * @author user
 */
public class mahasiswa1 {
    // Atribut
    String nama;
    String nim;

    // Konstruktor
    public mahasiswa1(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Method untuk menampilkan info mahasiswa
    public void infoMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    // Contoh penggunaan
    public static void main(String[] args) {
        mahasiswa1 mhs1 = new mahasiswa1("Siti Rosiati Octavia Anwaroh", "070");
        mhs1.infoMahasiswa();
    }
}
