package Praktikum2;

public class WaktuTempuh{
    public static void main(String[]args){
        double jarakBulan = 384400.0;
        double jarakMatahari = 152100000.0;
        double kecepatanCahaya = 300000.0;
        double waktuBulan = jarakBulan / kecepatanCahaya;
        double waktuMatahari = jarakMatahari / kecepatanCahaya;

        System.out.println("===Waktu Tempuh Kecepatan Cahaya===");
        System.out.println("Waktu tempuh ke Bulan   : " + waktuBulan + " detik");
        System.out.println("Waktu tempuh ke Matahari: " + waktuMatahari + " detik (" + (waktuMatahari / 60) + " menit)");
    }
}