package Praktikum2;

public class KonversiSuhu{
    public static void main(String[]args){
        double C = 10;
        double F = 15;
        double R = 5;
        System.out.println("===Konversi Suhu===");
        
        double cToF = (C * 9/5) + 32;
        double fToC = (F - 32) * 5/9;
        System.out.println("a. " + C + " C ke Fahrenheit = " + cToF + " F");
        System.out.println("   " + F + " F ke Celcius = " + fToC + " C");
        
        double cToR = C * 4/5;
        double rToC = R * 5/4;
        System.out.println("b. " + C + " C ke Reamur = " + cToR + " R");
        System.out.println("   " + R + " R ke Celcius = " + rToC + " C");
        
        double fToR = (F - 32) * 4/9;
        double rToF = (R * 9/4) + 32;
        System.out.println("c. " + F + " F ke Reamur = " + fToR + " R");
        System.out.println("   " + R + " R ke Fahrenheit = " + rToF + " F");
    }
}