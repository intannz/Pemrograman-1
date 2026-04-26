package latihan;

import java.util.Scanner;

public class P5_IntanMaharani {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Simulasi Sistem E-Wallet Interaktif ===");

        // Mengambil data input dari user
        System.out.print("Apakah akun Anda aktif? (ketik 'true' atau 'false'): ");
        boolean akunAktif = input.nextBoolean();

        System.out.print("Masukkan jumlah saldo awal Anda: Rp");
        double saldo = input.nextDouble();

        System.out.print("Masukkan nominal transaksi yang ingin dilakukan: Rp");
        double nominalTransaksi = input.nextDouble();

        System.out.println("\nMemproses data...\n");

        // 1. Struktur if
        System.out.println("--- 1. Cek Status Akun (if) ---");
        
        if (akunAktif) {
            System.out.println("Sistem: Akun aktif terverifikasi. Mempersiapkan transaksi...");
        }

        // 2. Struktur if-else
        System.out.println("\n--- 2. Proses Pembayaran (if-else) ---");
        
        if (saldo >= nominalTransaksi) {
            saldo = saldo - nominalTransaksi;
            System.out.println("Sistem: Transaksi berhasil diproses.");
            System.out.println("Sistem: Sisa saldo Anda saat ini adalah Rp" + saldo);
        } else {
            System.out.println("Sistem: Transaksi DITOLAK. Saldo Anda tidak mencukupi.");
        }

        // 3. Struktur if-else if
        System.out.println("\n--- 3. Kalkulasi Poin Bonus (if-else if) ---");
        
        int poinBonus = 0;

        if (nominalTransaksi >= 100000.0) {
            poinBonus = 50;
            System.out.println("Sistem: Transaksi besar! Anda mendapat Tier 1 (" + poinBonus + " poin).");
        } 
        else if (nominalTransaksi >= 50000.0) {
            poinBonus = 20;
            System.out.println("Sistem: Transaksi menengah! Anda mendapat Tier 2 (" + poinBonus + " poin).");
        } 
        else if (nominalTransaksi >= 10000.0) {
            poinBonus = 5;
            System.out.println("Sistem: Transaksi kecil! Anda mendapat Tier 3 (" + poinBonus + " poin).");
        } 
        else {
            System.out.println("Sistem: Transaksi di bawah Rp10.000 tidak mendapatkan poin bonus.");
        }

        System.out.println("\n=== Selesai ===");
        
        input.close();
    }
}
