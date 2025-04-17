package Matakuliah;

import java.util.ArrayList;
import java.util.Scanner;


public class MatakuliahMain {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Matakuliah> daftarMatkul = new ArrayList<>();
            
            System.out.println("=== DATA MATA KULIAH ===");
            int jumlah = 8;
            
            for (int i = 1; i <= jumlah; i++) {
                System.out.println("\nMata Kuliah ke-" + i);
                
                System.out.print("Kode Mata Kuliah: ");
                String kode = input.nextLine();
                
                System.out.print("Nama Mata Kuliah: ");
                String nama = input.nextLine();
                
                System.out.print("Jumlah SKS (2 atau 3): ");
                int sks = Integer.parseInt(input.nextLine());
                
                Matakuliah mk = new Matakuliah(kode, nama, sks);
                daftarMatkul.add(mk);
            }
            
            // Tampilkan semua data
            System.out.println("\n=== DAFTAR MATA KULIAH ===");
            for (Matakuliah mk : daftarMatkul) {
                mk.tampilkanInfo();
            }
        }
    }
}