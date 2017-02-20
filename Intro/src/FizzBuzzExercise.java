/*
 * Code for FizzBuzz Exercise.
 * @Author Huabin Liu.
 */
public class FizzBuzzExercise {
    public static void main(String args[]) {
        fizzBuzz();
    }

    private static void fizzBuzz() {
        for (int i = 1; i <= 15; i++) {
            boolean dividThree = i % 3 == 0;
            boolean dividFive = i % 5 == 0;
            if (dividThree && dividFive) {
                System.out.println("FizzBuzz");
            } else if (dividThree) {
                System.out.println("Fizz");
            } else if (dividFive) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
