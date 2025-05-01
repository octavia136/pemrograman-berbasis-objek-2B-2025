import java.util.Scanner;

public class perpustakaanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan buku secara dinamis
        while (true) {
            System.out.println("\nTambah Buku ke Perpustakaan");
            System.out.println("1. Buku Fiksi");
            System.out.println("2. Buku Non-Fiksi");
            System.out.println("3. Tampilkan Koleksi Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            if (pilihan == 1) {
                System.out.print("Masukkan Judul Buku Fiksi: ");
                String judulFiksi = scanner.nextLine();
                System.out.print("Masukkan Penulis Buku Fiksi: ");
                String penulisFiksi = scanner.nextLine();
                System.out.print("Masukkan Genre Buku Fiksi: ");
                String genreFiksi = scanner.nextLine();

                BukuFiksi bukuFiksi = new BukuFiksi(judulFiksi, penulisFiksi, genreFiksi);
                perpustakaan.tambahBukuFiksi(bukuFiksi);
                System.out.println("Buku Fiksi telah ditambahkan.\n");

            } else if (pilihan == 2) {
                System.out.print("Masukkan Judul Buku Non-Fiksi: ");
                String judulNonFiksi = scanner.nextLine();
                System.out.print("Masukkan Penulis Buku Non-Fiksi: ");
                String penulisNonFiksi = scanner.nextLine();
                System.out.print("Masukkan Topik Buku Non-Fiksi: ");
                String topikNonFiksi = scanner.nextLine();

                BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judulNonFiksi, penulisNonFiksi, topikNonFiksi);
                perpustakaan.tambahBukuNonFiksi(bukuNonFiksi);
                System.out.println("Buku Non-Fiksi telah ditambahkan.\n");

            } else if (pilihan == 3) {
                perpustakaan.tampilkanKoleksi();

            } else if (pilihan == 4) {
                System.out.println("Terima kasih! Program selesai.");
                break;

            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.\n");
            }
        }

        scanner.close();
    }
}
