package PraktikumP4;

import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tahun : ");
        int tahun = input.nextInt();
        boolean tahun_kabisat = false;

        if(tahun % 4 == 0){
            if(tahun % 100 == 0){
                if(tahun % 400 == 0){
                    tahun_kabisat = true;
                }
            }else{
                tahun_kabisat = true;
            }
        }
        if(tahun_kabisat){
            System.out.println("Tahun " + tahun + " adalah tahun kabisat.");
        }else{
            System.out.println("Tahun " + tahun + " bukan tahun kabisat.");
        }
        input.close();
    }
}