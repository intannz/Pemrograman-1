package Latihan1;

import java.util.Scanner;

public class P2_IntanMaharani {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String nama;
        int usia;
        System.out.print("================================================\n");
        System.out.print("Input nama: ");
        nama = input.nextLine();
        System.out.print("Input usia: ");
        usia = input.nextInt();
        System.out.print("namaku adalah " + nama + " aku berusia " + usia);
        System.out.print("\n==============================================");
    }
}
