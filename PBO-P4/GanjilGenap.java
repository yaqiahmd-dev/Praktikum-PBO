package PraktikumP4;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka : ");
        int angka = input.nextInt();
        
        if(angka % 2 == 0){
            System.out.println("Angka " + angka + " adalah bilangan genap.");
        }else{
            System.out.println("Angka " + angka + " adalah bilangan ganjil.");
        }
        input.close();
    }
}
