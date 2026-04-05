package tugas;
import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Pengecek Bilangan Ganjil & Genap ===");
        System.out.print("Masukkan sebuah bilangan bulat: ");
        
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("-> " + angka + " adalah bilangan GENAP.");
        } else {
            System.out.println("-> " + angka + " adalah bilangan GANJIL.");
        }

        System.out.println("========================================");
        
        input.close(); 
    }
}
