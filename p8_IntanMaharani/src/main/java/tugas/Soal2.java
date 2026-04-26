package tugas;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;
        int totalNilai = 0;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();

            totalNilai += nilai; 

            System.out.print("Apakah ingin input lagi? (y/t): ");
            pilihan = input.next();
            System.out.println("-------------------------");
            
        } while (!pilihan.equalsIgnoreCase("t"));

        System.out.println("Total keseluruhan nilai: " + totalNilai);
        input.close();
    }
}