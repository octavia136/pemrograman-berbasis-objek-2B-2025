import java.util.ArrayList;
import java.util.Scanner;

// Class Buku (Induk)
class buku {
    String judul;
    String penulis;

    // Constructor
    public buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    // Method untuk menampilkan info buku
    public void info() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

// Class BukuFiksi (Turunan dari Buku)
class BukuFiksi extends buku {
    String genre;

    // Constructor
    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    // Method untuk menampilkan info buku fiksi
    public void infoFiksi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Genre: " + genre);
    }
}

// Class BukuNonFiksi (Turunan dari Buku)
class BukuNonFiksi extends buku {
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
}

// Class Perpustakaan
class Perpustakaan {
    ArrayList<BukuFiksi> koleksiFiksi = new ArrayList<>();
    ArrayList<BukuNonFiksi> koleksiNonFiksi = new ArrayList<>();

    // Method untuk menambahkan buku fiksi
    public void tambahBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
    }

    // Method untuk menambahkan buku non-fiksi
    public void tambahBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
    }

    // Method untuk menampilkan semua koleksi buku
    public void tampilkanKoleksi() {
        System.out.println("\nKoleksi Buku Fiksi:");
        for (BukuFiksi buku : koleksiFiksi) {
            buku.infoFiksi();
            System.out.println("----------------------------");
        }

        System.out.println("\nKoleksi Buku Non-Fiksi:");
        for (BukuNonFiksi buku : koleksiNonFiksi) {
            buku.infoNonFiksi();
            System.out.println("----------------------------");
        }
    }
}

