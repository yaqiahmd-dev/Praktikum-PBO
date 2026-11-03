package PraktikumP5;

public class PerulanganWhile {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("=== Menggunakan i++ Post-increment ===");
        while (i <= 7) {
            System.out.println("Nilai i saat dicetak: " + (i++));
        }

        System.out.println("\n=== Menggunakan ++i Pre-increment ===");
        int j = 5;
        while (j <= 7) {
            System.out.println("Nilai j saat dicetak: " + (++j));
        }
    }
}