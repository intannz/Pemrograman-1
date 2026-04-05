package tugas;

import java.util.Scanner;

public class SistemKasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Kasir Sederhana ===");

        System.out.print("Masukkan total belanja: Rp ");
        double totalBelanja = input.nextDouble();

        double diskon = 0;

        if (totalBelanja > 100000) {
            diskon = totalBelanja * 0.10;
            System.out.println("Keterangan: Pelanggan mendapatkan diskon 10%!");
        } else {
            System.out.println("Keterangan: Tidak ada diskon. Belanja di atas Rp 100.000 untuk diskon.");
        }

        double totalBayar = totalBelanja - diskon;

        // output
        System.out.println("\n=========================");
        System.out.println("    STRUK PEMBAYARAN     ");
        System.out.println("=========================");
        System.out.println("Total Belanja   : Rp " + totalBelanja);
        System.out.println("Potongan Diskon : Rp " + diskon);
        System.out.println("-------------------------");
        System.out.println("TOTAL BAYAR     : Rp " + totalBayar);
        System.out.println("=========================");

        input.close();
    }
}
