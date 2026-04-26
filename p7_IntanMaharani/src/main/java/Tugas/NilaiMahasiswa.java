package Tugas;
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM HITUNG NILAI MAHASISWA ===");
        System.out.print("Masukkan Total Pertemuan (Realisasi) : ");
        int realisasi = input.nextInt();
        
        System.out.print("Masukkan Jumlah Hadir (Absen)        : ");
        int absen = input.nextInt();
        
        System.out.print("Masukkan Nilai Tugas                 : ");
        double tugas = input.nextDouble();
        
        System.out.print("Masukkan Nilai UTS                   : ");
        double uts = input.nextDouble();
        
        System.out.print("Masukkan Nilai UAS                   : ");
        double uas = input.nextDouble();

        input.close();

        // Hitung persentase kehadiran
        double persentaseAbsen = ((double) absen / realisasi) * 100;
        
        // bobot masing-masing komponen
        double bobotAbsen = persentaseAbsen * 0.10;
        double bobotTugas = tugas * 0.20;           
        double bobotUts = uts * 0.30;              
        double bobotUas = uas * 0.40;               

        // Total nilai sementara (Raw Score)
        double totalNilai = bobotAbsen + bobotTugas + bobotUts + bobotUas;
        String grade = "";

        // Logika Penentuan Grade & Validasi Kehadiran (< 75%)
        if (persentaseAbsen < 75.0) {
            System.out.println("\n[!] PERINGATAN: Kehadiran di bawah 75% (" + String.format("%.2f", persentaseAbsen) + "%). Dikenakan penalti nilai.");
            
            if (totalNilai >= 55) {
                totalNilai = 55; // Nilai dipotong menjadi 55
                grade = "D";
            } else {
                grade = "E"; // Nilai sesuai yang didapat jika di bawah 55
            }
        } else {
            // (Kehadiran >= 75%)
            if (totalNilai >= 80) {
                grade = "A";
            } else if (totalNilai >= 70) {
                grade = "B";
            } else if (totalNilai >= 60) {
                grade = "C";
            } else if (totalNilai >= 55) {
                grade = "D";
            } else {
                grade = "E";
            }
        }

        System.out.println("\n=== HASIL AKHIR ===");
        System.out.printf("Persentase Kehadiran : %.2f%%\n", persentaseAbsen);
        System.out.printf("Total Nilai Akhir    : %.2f\n", totalNilai);
        System.out.println("Grade Mahasiswa      : " + grade);
        System.out.println("======================================");
    }
}