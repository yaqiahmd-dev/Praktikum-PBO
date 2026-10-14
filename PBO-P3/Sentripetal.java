package PraktikumP3;
import java.util.Scanner;

public class Sentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENGHITUNG GAYA SENTRIPETAL ===");
        System.out.print("Masukkan Massa (M) dalam kg     : ");
        double m = input.nextDouble();

        System.out.print("Masukkan Kecepatan (V) dalam m/s: ");
        double v = input.nextDouble();

        System.out.print("Masukkan Jari-jari (r) dalam m  : ");
        double r = input.nextDouble();
        
        double fc = (m * (v * v)) / r;

        System.out.println("Gaya Sentripetal (Fc) = " + fc + " Newton");
        
        input.close();
    }
}