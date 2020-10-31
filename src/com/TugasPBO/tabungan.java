package com.TugasPBO;
import java.util.Scanner;
//nama = Argya Aulia Fauzandika
//nim = 10119035
//kelas = IF1
//Deskripsi = menghitung bunga menggunakan perulangan for

public class tabungan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan saldo awal : ");
        int saldoAwal = scanner.nextInt();
        System.out.print("masukkan bunga : (%)");
        String bunga = scanner.next();
        System.out.print("masukkan lama tabungan (bulan): ");
        int lamaBulan = scanner.nextInt();
        hitung(saldoAwal,bunga,lamaBulan);
    }

    public static void hitung(int saldoAwal, String bunga, int lamaBulan){
        double bungaString= Double.parseDouble(bunga); //ubah string ke double
        double bungaFinal = bungaString/ 100 + 1;
        for(int i = 1; i <= lamaBulan; i++){
            saldoAwal *= bungaFinal;
            System.out.println("saldo di bulan ke-" + i + " Rp " + saldoAwal);
        }

    }
}
