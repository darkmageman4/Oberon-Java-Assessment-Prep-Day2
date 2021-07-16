import java.util.Arrays;
import java.util.Scanner;

public class questions {

    public static void ascending(int[] missedUp) {
        int[] sortedArray = new int[missedUp.length];
        int temp;
        for (int j = 0; j < missedUp.length - 1; j++) {
            for (int i = 0; i < missedUp.length - 1; i++) {
                if (missedUp[i] > missedUp[i + 1]) {
                    temp = missedUp[i];
                    missedUp[i] = missedUp[i + 1];
                    missedUp[i + 1] = temp;
                    sortedArray = missedUp;

                }
            }
        }
        System.out.println(Arrays.toString(sortedArray));
    }



    public static void countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return;
        }
        String[] words = input.split("\\s+");
        System.out.println(words.length);
    }

    public static void Calculator(int num1, int num2) {
        Scanner cal = new Scanner(System.in);
        double number, other, resolution;
        System.out.println("Enter a number");
        number = cal.nextInt();
        System.out.println("Enter an operator");
        String operator = cal.next();
        System.out.println("Enter a other number");
        other = cal.nextInt();

        switch (operator) {
            case "+":
                resolution = num1 + num2;
                break;
            case "-":
                resolution = num1 - num2;
                break;
            case "*":
                resolution = num1 * num2;
                break;
            case "/":
                resolution = num1 / num2;
                break;
            default:
                System.out.println("That's not an operator");
                throw new IllegalStateException("Unexpected value: " + operator);
        }
    }

}

