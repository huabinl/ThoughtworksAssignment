/*
 * Code for Triangle Exercises.
 * @Author Huabin Liu.
 */
import java.util.*;

public class TriangleExercises {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        easiestExersise();
        horizontalLine();
        verticalLine();
        rightTriangle();
    }

    private static void easiestExersise() {
        System.out.println("*");
    }

    private static void horizontalLine() {
        System.out.print("Please set the number n for a horizontal line: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void verticalLine() {
        System.out.print("Please set the number n for a vertical line: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    private static void rightTriangle() {
        System.out.print("Please set the number n for a right triangle: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
