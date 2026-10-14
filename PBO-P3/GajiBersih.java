package PraktikumP3;
import java.util.Scanner;

public class GajiBersih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nomor Induk Karyawan  : ");
        String nip = input.nextLine();
        System.out.print("Nama Karyawan         : ");
        String nama = input.nextLine();
        System.out.print("Alamat                : ");
        String alamat = input.nextLine();

        double gaji_pokok = 2000000;
        double tunjangan_jabatan = 300000;
        double tunjangan_istri = 200000;
        double tunjangan_anak = 150000;
        double total_gaji = gaji_pokok + tunjangan_jabatan + tunjangan_istri + tunjangan_anak;
        double pajak = 0.10 * total_gaji;
        double gaji_bersih = total_gaji - pajak;
        
        System.out.println("NIP                   : " + nip);
        System.out.println("Nama                  : " + nama);
        System.out.println("Alamat                : " + alamat);
        System.out.println("Jabatan               : Manajer");
        System.out.println("Total Gaji            : Rp " + total_gaji);
        System.out.println("Pajak (10%)           : Rp " + pajak);
        System.out.println("Gaji Bersih           : Rp " + gaji_bersih);
        
        input.close();
    }
}