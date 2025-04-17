package Mahasiswa;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private ArrayList<Matakuliah> daftarMatakuliah = new ArrayList<>();
    private static int totalMahasiswa = 0;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        totalMahasiswa++;
    }

    public void tambahMatakuliah(Matakuliah mk) {
        daftarMatakuliah.add(mk);
    }

    public void tampilkanBiodata() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Prodi   : " + jurusan);
        System.out.println("Mata Kuliah:");
        for (Matakuliah mk : daftarMatakuliah) {
            mk.tampilkanInfo();
        }
        System.out.println();
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }

    public static boolean isNIMValid(String nim) {
        return nim.matches("23\\d{8}");
    }
}
