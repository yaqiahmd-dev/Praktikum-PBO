package PraktikumP3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Buah {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== PROGRAM MENGHITUNG TOTAL BUAH IBU SISCA ===");
        System.out.print("Tekan ENTER untuk melihat hasil perhitungan otomatis...");
        reader.readLine();

        int mangga_beli = 70;
        int mangga_busuk = 15;
        int mangga_bagus = mangga_beli - mangga_busuk;

        int jumlah_tetangga = 4;
        int jambu_per_tetangga = 30;
        int total_jambu = jumlah_tetangga * jambu_per_tetangga;

        int total_buah_keseluruhan = mangga_bagus + total_jambu;

        System.out.println("\n=== RINCIAN BUAH ===");
        System.out.println("Mangga dibeli awal      : " + mangga_beli + " pcs");
        System.out.println("Mangga busuk (dikembalikan): " + mangga_busuk + " pcs");
        System.out.println("Mangga bagus yang diterima : " + mangga_bagus + " pcs");
        System.out.println("Total Jambu (4 tetangga x 30): " + total_jambu + " pcs");
        System.out.println("======================================");
        System.out.println("TOTAL BUAH BERSIH YANG DIBELI: " + total_buah_keseluruhan + " pcs");
    }
}