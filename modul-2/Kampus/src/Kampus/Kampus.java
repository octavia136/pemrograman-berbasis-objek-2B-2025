package Kampus;

/**
 *
 * @author user;
 */
public class Kampus {
    private String namaKampus;
    private String alamatKampus;
    private static int totalMahasiswa = 0;

    public Kampus(String namaKampus, String alamatKampus) {
        if (!isalamatKampusValid(alamatKampus)) {
            throw new IllegalArgumentException("Nama kampus tidak valid. Tidak boleh mengandung angka.");
        }
        this.namaKampus = namaKampus;
        this.alamatKampus = alamatKampus;
    }

    public static boolean isNamaKampusValid(String nama) {
        return !nama.matches(".\\d.");
    }

    public static void tambahMahasiswa() {
        totalMahasiswa++;
    }

    public void tampilkanInfo() {
        System.out.println("\n===== INFO KAMPUS =====");
        System.out.println("Nama Kampus     : " + namaKampus);
        System.out.println("Alamat Kampus   : " + alamatKampus);
        System.out.println("Total Mahasiswa : " + totalMahasiswa);
    }
}