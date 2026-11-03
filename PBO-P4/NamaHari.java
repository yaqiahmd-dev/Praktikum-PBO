package PraktikumP4;

import java.util.Scanner;

public class NamaHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kode hari (1-7) : ");
        int kode_hari = input.nextInt();
        String nama_hari;

        switch(kode_hari){
            case 1:
                nama_hari = "Senin";
                break;
            case 2:
                nama_hari = "Selasa";
                break;
            case 3:
                nama_hari = "Rabu";
                break;
            case 4:
                nama_hari = "Kamis";
                break;
            case 5:
                nama_hari = "Jumat";
                break;
            case 6:
                nama_hari = "Sabtu";
                break;
            case 7:
                nama_hari = "Minggu";
                break;
            default:
                nama_hari = "Kode hari tidak valid! Harap masukkan angka 1 sampai 7.";
        }
        System.out.println("Hasil : " + nama_hari);
        input.close();
    }
}