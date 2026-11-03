package Praktikum2;

public class PersamaanKuadrat{
    public static void main(String[]args){
        int a = 2;
        int b = 10;
        int c = 5;
        int hasil = (b * b) - (4 * a * c);

        System.out.println("===Menghitung Persamaan Kuadrat===");
        System.out.println("Nilai a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Hasil dari b^2 - 4ac adalah: " + hasil);
    }
}