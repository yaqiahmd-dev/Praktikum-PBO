package Praktikum2;

public class Increment{
    public static void main(String[]args){
        int a = 10;
        int b = 10;

        System.out.println("Nilai awal a: " + a);
        System.out.println("Pre-increment (++a): " + (++a)); 
        System.out.println("\nNilai awal b: " + b);
        System.out.println("Post increment (b++): " + (b++)); 
        System.out.println("Nilai b setelah post increment: " + b);
    }
}
