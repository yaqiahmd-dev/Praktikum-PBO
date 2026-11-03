package PraktikumP5;

public class PerulanganForeach {
    public static void main(String[] args) {
        int[] nilai_tugas_PBO = {85, 90, 78, 92, 88};

        System.out.println("Daftar Nilai Praktikum PBO Menggunakan Foreach:");
        
        for (int nilai : nilai_tugas_PBO) {
            System.out.println("Nilai: " + nilai);
        }
    }
}