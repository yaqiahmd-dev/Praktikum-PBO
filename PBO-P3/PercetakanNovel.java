package PraktikumP3;
import java.util.Scanner;

public class PercetakanNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah novel yang akan dicetak : ");
        long jumlah_novel = input.nextLong();

        System.out.print("Masukkan tebal lembar per novel : ");
        long tebal_lembar = input.nextLong();
        
        long total_lembar = jumlah_novel * tebal_lembar;
        
        long total_detik = total_lembar;
        
        long hari = total_detik / 86400;
        long sisa_hari = total_detik % 86400;

        long jam = sisa_hari / 3600;
        long sisa_jam = sisa_hari % 3600;

        long menit = sisa_jam / 60;
        long detik = sisa_jam % 60;

        System.out.println("\n=== ESTIMASI WAKTU PERCETAKAN ===");
        System.out.println("Total lembar dicetak : " + total_lembar + " lembar");
        System.out.println("Waktu yang diperlukan: " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik.");
        
        input.close();
    }
}