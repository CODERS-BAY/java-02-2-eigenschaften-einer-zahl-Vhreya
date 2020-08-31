import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int luckyNumber = 15;

        Scanner scannerVariable = new Scanner(System.in);
        int number = scannerVariable.nextInt();

        if (number % 10 == 0) {
            System.out.printf("%d is a round number.%n", number);

        }
        if (number % 2 == 0) {
            System.out.printf("%d is an even number.%n", number);
        }
        if (number == luckyNumber) {
            System.out.printf("%d is my lucky number.%n", number);

        }
        if (number > 9 && number < 100) {
            System.out.printf("%d has 2 digits.%n", number);
        }
    }
}
