/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class BukuNonFiksi extends buku {
    String topik;

    // Constructor
    public BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }

    // Method untuk menampilkan info buku non-fiksi
    public void infoNonFiksi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Topik: " + topik);
    }

    // Program utama untuk uji coba
    public static void main(String[] args) {
        BukuNonFiksi buku1 = new BukuNonFiksi("Atomic Habits", "James Clear", "Pengembangan Diri");
        BukuNonFiksi buku2 = new BukuNonFiksi("Sapiens", "Yuval Noah Harari", "Sejarah Manusia");

        buku1.infoNonFiksi();
        System.out.println("----------------------");
        buku2.infoNonFiksi();
    }
}