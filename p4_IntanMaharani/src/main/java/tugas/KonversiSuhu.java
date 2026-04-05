package tugas;

import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Konversi Suhu ===");
        System.out.print("Masukkan suhu dalam Celcius: ");
        
        double celcius = input.nextDouble();
        double fahrenheit = (celcius * 9.0 / 5.0) + 32;
        double kelvin = celcius + 273.15;
        double reamur = celcius * 4.0 / 5.0;

        // Menampilkan Hasil
        System.out.println("\n--- Hasil Konversi ---");
        System.out.println("Celcius    : " + celcius + " Derajat Celcius");
        System.out.println("Fahrenheit : " + fahrenheit + " Derajat Fahrenheit");
        System.out.println("Kelvin     : " + kelvin + " Kelvin");
        System.out.println("Reamur     : " + reamur + " Derajat Reamur");
        
        System.out.println("==============================");

        input.close();
    }
}
