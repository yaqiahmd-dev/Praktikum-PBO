package PraktikumP5;

import java.util.Scanner;

public class AngkaGanjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan banyak angka : ");
        int n = scanner.nextInt();
        
        int total_penjumlahan = 0;
        
        System.out.print("Output: ");
        for (int i = 1; i <= n; i++) {
            int ganjil = 2 * i - 1;
            System.out.print(ganjil + " ");
            total_penjumlahan += ganjil;
        }
        
        System.out.println("\nTotal penjumlahan : " + total_penjumlahan);
    }
}