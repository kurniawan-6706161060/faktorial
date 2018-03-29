import java.util.Scanner;

/**
 * Create by Kurniawan Yudha Putrama
 * Telkom Univwersity
 * D3IF-40-04
 */
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            // Space
            for (int y = 0; y < n-(i+1); y++) {
                System.out.print("O");
            }
            // Star
            for (int y = 0; y < (i+1)*2; y++) {
                System.out.print("*");
            }
            // Space
            for (int y = 0; y < n-(i+1); y++) {
                System.out.print("O");
            }
            // End Line
            System.out.println();
        }
        for (int i = n-1; i >= 0; i--) {
            // Space
            for (int y = 0; y < n-(i+1); y++) {
                System.out.print("O");
            }
            // Star
            for (int y = 0; y < (i+1)*2; y++) {
                System.out.print("*");
            }
            // Space
            for (int y = 0; y < n-(i+1); y++) {
                System.out.print("O");
            }
            // End Line
            System.out.println();
        }
    }
}
