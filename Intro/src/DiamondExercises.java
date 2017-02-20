/*
 * Code for Triangle Exercises.
 * @Author Huabin Liu.
 */
import java.util.*;

public class DiamondExercises {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        isoscelesTriangle();
        diamond();
        diamondName();
    }

    private static void isoscelesTriangle() {
        System.out.print("Please set the number n for a centered triangle: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int j = 0;
            while(j < n - i - 1) {
                System.out.print(" ");
                j++;
            }
            while(j <= n + i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }

    private static void diamond() {
        System.out.print("Please set the number n for a centered diamond: ");
        int n = sc.nextInt();
        for (int i = 0; i < 2 * n; i++) {
            int j = 0;
            int k =  (i < n) ? i : 2 * n - 2 - i;
            while(j < n - k - 1) {
                System.out.print(" ");
                j++;
            }
            while(j <= Math.abs(n + k - 1)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }

    private static void diamondName() {
        System.out.print("Please set the number n for a centered diamond: ");
        int n = sc.nextInt();
        for (int i = 0; i < 2 * n; i++) {
            if (i == n - 1) {
                System.out.println("Ellie");
                continue;
            }
            int j = 0;
            int k =  (i < n) ? i : 2 * n - 2 - i;
            while(j < n - k - 1) {
                System.out.print(" ");
                j++;
            }
            while(j <= Math.abs(n + k - 1)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }

}
