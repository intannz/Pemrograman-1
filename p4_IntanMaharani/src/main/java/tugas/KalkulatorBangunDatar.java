package tugas;

import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kalkulator Luas & Keliling ===");
        System.out.println("Pilih bangun datar yang ingin dihitung:");
        System.out.println("1. Lingkaran");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi Panjang");
        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("\n--- Lingkaran ---");
                System.out.print("Masukkan panjang jari-jari (r): ");
                double r = input.nextDouble();

                double luasLingkaran = Math.PI * (r * r);
                double kelilingLingkaran = 2 * Math.PI * r;
                
                System.out.println("Luas Lingkaran     = " + luasLingkaran);
                System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
                break;

            case 2:
                System.out.println("\n--- Segitiga ---");
                System.out.print("Masukkan panjang alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggi;

                System.out.println("\n(Untuk keliling, masukkan panjang ketiga sisinya)");
                System.out.print("Masukkan panjang sisi A: ");
                double sisiA = input.nextDouble();
                System.out.print("Masukkan panjang sisi B: ");
                double sisiB = input.nextDouble();
                System.out.print("Masukkan panjang sisi C: ");
                double sisiC = input.nextDouble();
                double kelilingSegitiga = sisiA + sisiB + sisiC;

                System.out.println("\nLuas Segitiga     = " + luasSegitiga);
                System.out.println("Keliling Segitiga = " + kelilingSegitiga);
                break;

            case 3:
                System.out.println("\n--- Persegi Panjang ---");
                System.out.print("Masukkan nilai panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan nilai lebar: ");
                double lebar = input.nextDouble();
                
                double luasPersegiPanjang = panjang * lebar;
                double kelilingPersegiPanjang = 2 * (panjang + lebar);

                System.out.println("Luas Persegi Panjang     = " + luasPersegiPanjang);
                System.out.println("Keliling Persegi Panjang = " + kelilingPersegiPanjang);
                break;

            default:
                System.out.println("\nError: Pilihan tidak valid! Silakan jalankan ulang program dan masukkan angka 1, 2, atau 3.");
        }

        System.out.println("\n==================================");
        System.out.println("Kalkulator selesai digunakan.");
        
        input.close();
    }
}