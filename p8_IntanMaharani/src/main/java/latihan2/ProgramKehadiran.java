package latihan2;

import java.util.Scanner;

public class ProgramKehadiran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM NILAI LATIHAN 2 ===");
        
        System.out.print("Masukkan Total Pertemuan (Realisasi): ");
        int realisasi = input.nextInt();

        int absen = 0;
        double persentaseAbsen = 0.0;
        double totalNilai = 0.0;
        String grade = "-";
        
        // S1: INPUT PILIHAN
        System.out.print("\n[S1] Tekan '1' untuk Input Nilai, angka lain untuk Lewati: ");
        int pilihan = input.nextInt();
        
        // KONDISI IF
        if (pilihan == 1) {
            
            // TRUE
            // S2: Input Kehadiran
            System.out.print("[S2] Input Kehadiran (Absen) : ");
            absen = input.nextInt();
            persentaseAbsen = ((double) absen / realisasi) * 100;

            // KONDISI LOOPING (WHILE)
            // Mengecek apakah kehadiran kurang dari 75%
            while (persentaseAbsen < 75.0) {
                // S4: Output peringatan dan minta input lagi
                System.out.println("\n[S4] Kehadiran kamu dibawah 75% (" + String.format("%.2f", persentaseAbsen) + "%), input kehadiran!");
                System.out.print("[S4] Input ulang Kehadiran (Absen) : ");
                absen = input.nextInt();
                
                // Hitung ulang agar kondisi loop bisa berubah menjadi False
                persentaseAbsen = ((double) absen / realisasi) * 100;
            }

            System.out.print("Masukkan Nilai Tugas         : ");
            double tugas = input.nextDouble();
            System.out.print("Masukkan Nilai UTS           : ");
            double uts = input.nextDouble();
            System.out.print("Masukkan Nilai UAS           : ");
            double uas = input.nextDouble();

            // Hitung Bobot
            double bobotAbsen = persentaseAbsen * 0.10;
            double bobotTugas = tugas * 0.20;
            double bobotUts = uts * 0.30;
            double bobotUas = uas * 0.40;

            totalNilai = bobotAbsen + bobotTugas + bobotUts + bobotUas;

            // Grade (absen >= 75%)
            if (totalNilai >= 80) grade = "A";
            else if (totalNilai >= 70) grade = "B";
            else if (totalNilai >= 60) grade = "C";
            else if (totalNilai >= 55) grade = "D";
            else grade = "E";

        } else {
            // FALSE / ELSE
            
            // S3: Proses Alternatif
            System.out.println("\n[S3] Anda tidak memilih angka 1. Proses input nilai dibatalkan.");
            totalNilai = 0;
            grade = "E (Dibatalkan)";
        }

        input.close();

        // S5: CETAK KEHADIRAN (Dan Hasil)
        System.out.println("\n=== [S5] CETAK HASIL AKHIR ===");
        System.out.printf("Persentase Kehadiran : %.2f%%\n", persentaseAbsen);
        System.out.printf("Total Nilai Akhir    : %.2f\n", totalNilai);
        System.out.println("Grade Mahasiswa      : " + grade);
        System.out.println("==============================");
    }
}
