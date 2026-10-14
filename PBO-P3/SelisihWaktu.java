package PraktikumP3;
import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== WAKTU PERTAMA ===");
        System.out.print("Jam   : "); int jam1 = input.nextInt();
        System.out.print("Menit : "); int menit1 = input.nextInt();
        System.out.print("Detik : "); int detik1 = input.nextInt();

        System.out.println("\n=== WAKTU KEDUA ===");
        System.out.print("Jam   : "); int jam2 = input.nextInt();
        System.out.print("Menit : "); int menit2 = input.nextInt();
        System.out.print("Detik : "); int detik2 = input.nextInt();
        
        int total_detik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int total_detik2 = (jam2 * 3600) + (menit2 * 60) + detik2;

        int selisih_detik_total = Math.abs(total_detik2 - total_detik1);
        
        int jm = selisih_detik_total / 3600;
        int sisa = selisih_detik_total % 3600;
        int mn = sisa / 60;
        int dt = sisa % 60;

        System.out.println("\n=== HASIL SELISIH WAKTU ===");
        System.out.println("Selisih waktu adalah: " + jm + " jam, " + mn + " menit, " + dt + " detik.");
        
        input.close();
    }
}