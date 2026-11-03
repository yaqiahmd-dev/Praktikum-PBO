package PraktikumP5;

import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bilangan yang ingin diinput: ");
        int n = scanner.nextInt();
        
        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            double angka = scanner.nextDouble();
            total += angka;
        }

        double rata_rata = total / n;

        System.out.println("\n=== HASIL ===");
        System.out.println("Total jumlah bilangan : " + total);
        System.out.println("Rata-rata bilangan    : " + rata_rata);
    }
}