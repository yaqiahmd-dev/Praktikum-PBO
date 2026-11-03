package PraktikumP4;

import java.util.Scanner;

public class PendapatanSalesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan total penjualan hari ini (Rp) : ");
        double penjualan = input.nextDouble();

        double uang_jasa = 0;
        double komisi = 0;
        
        if(penjualan <= 2000000){
            uang_jasa = 100000;
            komisi = 0.10 * penjualan;
        }else if(penjualan > 2000000 && penjualan <= 5000000){
            uang_jasa = 200000;
            komisi = 0.15 * penjualan;
        }else{
            uang_jasa = 300000;
            komisi = 0.20 * penjualan;
        }
        double total_pendapatan = uang_jasa + komisi;

        System.out.println("\n==== RINCIAN PENDAPATAN SALESMAN ====");
        System.out.println("Total Penjualan  : Rp " + penjualan);
        System.out.println("Uang Jasa        : Rp " + uang_jasa);
        System.out.println("Uang Komisi      : Rp " + komisi);
        System.out.println("Total Pendapatan : Rp " + total_pendapatan);

        input.close();
    }
}