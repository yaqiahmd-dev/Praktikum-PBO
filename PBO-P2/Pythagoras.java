package Praktikum2;

public class Pythagoras{
    public static void main(String[]args){
        double a = 6;
        double b = 8;
        double c = Math.sqrt((a * a) + (b * b));
        double keliling = a + b + c;

        System.out.println("===Menghitung Sisi C & Keliling Segitiga===");
        System.out.println("Sisi a = " + a);
        System.out.println("Sisi b = " + b);
        System.out.println("Sisi c (Pythagoras) = " + c);
        System.out.println("Keliling Segitiga   = " + keliling);
    }
}