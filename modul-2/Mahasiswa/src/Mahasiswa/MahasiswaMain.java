package Mahasiswa;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        int jumlahMahasiswa = 3; // Bisa ubah sesuai kebutuhan

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama     : ");
            String nama = input.nextLine();

            String nim;
            while (true) {
                System.out.print("NIM      : ");
                nim = input.nextLine();
                if (Mahasiswa.isNIMValid(nim)) {
                    break;
                } else {
                    System.out.println("❌ NIM tidak valid! Harus diawali '23' dan total 10 digit.");
                }
            }

            System.out.print("Prodi    : ");
            String jurusan = input.nextLine();

            Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan);

            System.out.print("Jumlah mata kuliah yang diambil: ");
            int jumlahMatkul = Integer.parseInt(input.nextLine());

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.println("  Mata Kuliah ke-" + (j + 1));
                System.out.print("  Kode Mata Kuliah : ");
                String kode = input.nextLine();
                System.out.print("  Nama Mata Kuliah : ");
                String namaMatkul = input.nextLine();

                int sks;
                while (true) {
                    System.out.print("  Jumlah SKS (2/3)  : ");
                    sks = Integer.parseInt(input.nextLine());
                    if (Matakuliah.isSKSValid(sks)) {
                        break;
                    } else {
                        System.out.println("  ❌ SKS tidak valid! Harus 2 atau 3.");
                    }
                }

                Matakuliah mk = new Matakuliah(kode, namaMatkul, sks);
                mhs.tambahMatakuliah(mk);
            }

            daftarMahasiswa.add(mhs);
        }

        // Tampilkan data semua mahasiswa
        System.out.println("\n========= DATA MAHASISWA =========");
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanBiodata();
        }

        System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}
