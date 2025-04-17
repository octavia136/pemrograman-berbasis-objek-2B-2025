package Mahasiswa;

public class Matakuliah {
    private String kode;
    private String nama;
    private int sks;

    public Matakuliah(String kode, String nama, int sks) {
        if (!isSKSValid(sks)) {
            throw new IllegalArgumentException("Jumlah SKS harus 2 atau 3.");
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public void tampilkanInfo() {
        System.out.println("- " + kode + " | " + nama + " (" + sks + " SKS)");
    }

    public static boolean isSKSValid(int sks) {
        return sks == 2 || sks == 3;
    }
}
