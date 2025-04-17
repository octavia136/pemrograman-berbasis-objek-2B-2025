package Kampus;

/**
 *
 * @author user;
 */
import java.util.Scanner;
public class KampusMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // Input nama kampus secara dinamis
        String namaKampus;
        while (true) {
            System.out.print("Masukkan Nama Kampus: ");
            namaKampus = input.nextLine();
            if (Kampus.isNamaKampusValid(namaKampus)) {
                break;
            } else {
                System.out.println("Nama kampus tidak valid (tidak boleh mengandung angka). Coba lagi.");
            }
        }

        System.out.print("Masukkan Alamat Kampus: ");
        String alamatKampus = input.nextLine();

        Kampus kampus = new Kampus(namaKampus, alamatKampus);

        // Input jumlah mahasiswa secara dinamis
        System.out.print("Berapa jumlah mahasiswa yang ingin ditambahkan? ");
        int jumlah = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Mahasiswa ke-" + i + " ditambahkan.");
            Kampus.tambahMahasiswa(); // tambah total mahasiswa
        }

        // Tampilkan info kampus
        kampus.tampilkanInfo();
        input.close();
    }
}