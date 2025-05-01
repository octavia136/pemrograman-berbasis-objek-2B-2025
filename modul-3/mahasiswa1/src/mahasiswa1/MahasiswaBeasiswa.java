/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa1;

/**
 *
 * @author user
 */
public class MahasiswaBeasiswa extends mahasiswa1 {
    String jenisBeasiswa;

    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public void infoBeasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
        System.out.println("-----------------------");
    }

    // Program utama untuk membuat objek dan menampilkan data
    public static void main(String[] args) {
        MahasiswaBeasiswa mhs1 = new MahasiswaBeasiswa("Siti Rosiati Octavia Anwaroh", "070", "Beasiswa Prestasi");
        MahasiswaBeasiswa mhs2 = new MahasiswaBeasiswa("Jaka Pratama", "071", "Beasiswa KIP-Kuliah");
        MahasiswaBeasiswa mhs3 = new MahasiswaBeasiswa("Ida Ayu", "072", "Beasiswa Riset");

        mhs1.infoBeasiswa();
        mhs2.infoBeasiswa();
        mhs3.infoBeasiswa();
    }
}