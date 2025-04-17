/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matakuliah;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Matakuliah {
    private String kode;
    private String nama;
    private int sks;
    
    public Matakuliah(String kode, String nama, int sks){
        if (!isSKSValid(sks)){
            throw new IllegalArgumentException("jumlah SKS tidak valid. hanya boleh 2 atau 3");
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }
    public void tampilkanInfo(){
        System.out.println("-" +kode +"|" +nama + "("+ sks + "SKS");
    }
    
    public static boolean isSKSValid(int sks){
        return sks == 2 || sks == 3;
    }
}
