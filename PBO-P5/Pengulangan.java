package PraktikumP5;

import java.util.Scanner;

public class Pengulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan, terbesar, terkecil;

        System.out.print("Masukkan bilangan ke-1: ");
        bilangan = scanner.nextInt();
        terbesar = bilangan;
        terkecil = bilangan;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            bilangan = scanner.nextInt();

            if (bilangan > terbesar) {
                terbesar = bilangan;
            }
            if (bilangan < terkecil) {
                terkecil = bilangan;
            }
        }

        System.out.println("\n=== HASIL ===");
        System.out.println("Bilangan terbesar : " + terbesar);
        System.out.println("Bilangan terkecil : " + terkecil);
    }
}