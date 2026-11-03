package PraktikumP5;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("=== Half Triangle ===");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int currentStar = 2 * i - 1; // 1, 3, 5, 7, 9
            int maxStar = 9;

            int spaces = (maxStar - currentStar) / 2;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= currentStar; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\n=== Full Triangle ===");
        int[] starCount = {1, 3, 5, 3, 1};
        int maxFull = 5;
        
        for (int count : starCount) {
            int spaces = (maxFull - count) / 2;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}