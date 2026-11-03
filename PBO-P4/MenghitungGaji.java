package PraktikumP4;

import java.util.Scanner;

public class MenghitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK : ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4) : ");
        int kode_golongan = input.nextInt();
        System.out.print("Masukkan Jumlah Anak : ");
        int jumlah_anak = input.nextInt();

        double gaji_pokok = 0;
        String keterangan = "";
        
        switch(kode_golongan){
            case 1:
                gaji_pokok = 1200000;
                keterangan = "Menikah";
                break;
            case 2:
                gaji_pokok = 1500000;
                keterangan = "Belum menikah";
                break;
            case 3:
                gaji_pokok = 1750000;
                keterangan = "Cerai";
                break;
            case 4:
                gaji_pokok = 2000000;
                keterangan = "Menikah dan punya anak";
                break;
            default:
                System.out.println("Kode golongan tidak valid!");
                System.exit(0);
        }
        double tunjangan_pasangan = (kode_golongan == 1 || kode_golongan == 4) ? 0.10 * gaji_pokok : 0;
        double tunjangan_anak = 0.05 * gaji_pokok * jumlah_anak;
        double total_tunjangan = tunjangan_pasangan + tunjangan_anak;
        double gaji_bersih = gaji_pokok + total_tunjangan;

        System.out.println("\n==== STRUK GAJI KARYAWAN ====");
        System.out.println("NIK          : " + nik);
        System.out.println("Nama         : " + nama);
        System.out.println("Keterangan   : " + keterangan);
        System.out.println("Gaji Pokok   : Rp " + gaji_pokok);
        System.out.println("Total Tunjangan: Rp " + total_tunjangan);
        System.out.println("Gaji Bersih  : Rp " + gaji_bersih);

        input.close();
    }
}