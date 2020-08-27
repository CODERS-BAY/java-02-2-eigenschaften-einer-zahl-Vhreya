import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int luckyNumber = 15;

        Scanner scannerVariable = new Scanner(System.in);
        int  number = scannerVariable.nextInt();

        if (number%10 == 0){
            System.out.printf("%d is a round number.", number);

        } else if (number%2 == 0) {
            System.out.printf("%d is an even number.", number);
        } else if (number == luckyNumber) {
            System.out.printf("%d is my lucky number.", number);

        } else if (number>9 && number<100) {
            System.out.printf("%d has 2 digits.", number);
        }
    }
}
