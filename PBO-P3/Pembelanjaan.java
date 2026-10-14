package PraktikumP3;
import java.io.*;

public class Pembelanjaan {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.print("Nama          : ");
        String nama = dis.readLine();

        System.out.print("Total Belanja : ");
        double total_belanja = Double.parseDouble(dis.readLine());

        System.out.print("Diskon (%)    : ");
        double diskon_persen = Double.parseDouble(dis.readLine());

        double diskon = total_belanja * (diskon_persen / 100);
        double total = total_belanja - diskon;

        System.out.print("Bayar         : ");
        double bayar = Double.parseDouble(dis.readLine());

        double kembalian = bayar - total;
        
        System.out.println("Nama          : " + nama);
        System.out.println("Total Belanja : Rp " + total_belanja);
        System.out.println("Diskon        : Rp " + diskon);
        System.out.println("Total Bayar   : Rp " + total);
        System.out.println("Uang Dibayar  : Rp " + bayar);
        System.out.println("Kembalian     : Rp " + kembalian);
    }
}