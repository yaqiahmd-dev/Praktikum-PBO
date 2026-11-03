package PraktikumP3;
import java.io.*;
import java.util.Scanner;

public class BedaScannerBuffered {
    public static void main(String[] args) throws IOException {
        
        Scanner input_scanner = new Scanner(System.in);
        System.out.print("Masukkan umur (Scanner): ");
        int umur_scanner = input_scanner.nextInt();
        System.out.println("Umur Anda (Scanner): " + umur_scanner);
        
        BufferedReader input_buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan nama (BufferedReader): ");
        String nama_buffer = input_buffer.readLine();
        System.out.println("Nama Anda (BufferedReader): " + nama_buffer);
        
        input_scanner.close();
    }
}