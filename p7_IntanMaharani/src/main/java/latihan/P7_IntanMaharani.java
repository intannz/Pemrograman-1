package latihan;

import java.util.Scanner;

public class P7_IntanMaharani {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float hitungKehadiran = 21 * 75f / 100f;
        
        System.out.print("Masukkan kehadiran: ");
        float kehadiran = input.nextFloat();

        
        System.out.print("Masukkan Nilai Akhir: ");
        float nilai = input.nextFloat();
        
        if(kehadiran >= hitungKehadiran){
            String grade;
            
            if(nilai >= 80){
                grade = "A";
            } else if(nilai >= 70){
                grade = "B";
            } else if(nilai >= 60){
                grade = "C";
            } else if(nilai >= 55){
                grade = "D";
            } else{
                grade = "E";
            }
            
            System.out.println("Hasil Akhir");
            System.out.println("Jumlah kehadiran: " + kehadiran);
            System.out.println("Nilai akhir: " + nilai);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("kehadiran kurang dari 75%");
        }
        
        input.close();
    }
}
