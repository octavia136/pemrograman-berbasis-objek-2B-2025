/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package hewan;

/**
 *
 * @author user
 */
public class hewan {

    /**
     * @param args the command line arguments
     */
    String nama;
    int umur;

    hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void tampilkansuara() {
        System.out.println(nama + " mengeluarkan suara.");
    }

    void tampilkaninfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun");
    }
}

// Jenis hewan 1: Sapi
class Sapi extends hewan {
    double berat;

    Sapi(String nama, int umur, double berat) {
        super(nama, umur);
        this.berat = berat;
    }

    void tampilkansuara() {
        System.out.println(nama + " bersuara: Moooo....Moooo.Mooooo");
    }

    void tampilkaninfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun, Berat: " + berat + " kg");
    }
}

// Jenis hewan 2: Kambing
class Kambing extends hewan {
    String warna;

    Kambing(String nama, int umur, String warna) {
        super(nama, umur);
        this.warna = warna;
    }

    void tampilkansuara() {
        System.out.println(nama + " bersuara: Mbeeek....Mbekkk....Mbeeekk");
    }

    @Override
    void tampilkaninfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun, Warna: " + warna);
    }
}

// Jenis hewan 3: Ayam
class Ayam extends hewan {
    boolean bisaTerbang;

    Ayam(String nama, int umur, boolean bisaTerbang) {
        super(nama, umur);
        this.bisaTerbang = bisaTerbang;
    }

    void tampilkansuara() {
        System.out.println(nama + " bersuara: Ptok....Ptok....Ptok....Ptokk");
    }

    void tampilkaninfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun, Bisa Terbang: " + (bisaTerbang ? "Ya" : "Tidak"));
    }
}

// Class utama
class hewanMain {
    public static void main(String[] args) {
        System.out.println("=== Ini Tentang Sapi ===");
        for (int i = 1; i <= 3; i++) {
            Sapi sapi = new Sapi("Sapi " + i, 2 + i, 250 + (i * 50));
            sapi.tampilkaninfo();
            sapi.tampilkansuara();
        }

        System.out.println("\n=== Ini Tentang Kambing ===");
        for (int i = 1; i <= 3; i++) {
            Kambing kambing = new Kambing("Kambing " + i, 1 + i, "Putih");
            kambing.tampilkaninfo();
            kambing.tampilkansuara();
        }

        System.out.println("\n=== Nahh Yang ini Tentang Ayam ===");
        for (int i = 1; i <= 3; i++) {
            boolean terbang = (i % 2 == 0); // selang-seling bisa terbang
            Ayam ayam = new Ayam("Ayam " + i, i, terbang);
            ayam.tampilkaninfo();
            ayam.tampilkansuara();
        }
    }
}