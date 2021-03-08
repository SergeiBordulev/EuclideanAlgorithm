import java.util.Scanner;

public class EuclideanAlgorithm {
    private static int getGreatestCommonDivisor(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }

        return getGreatestCommonDivisor(number2, number1 % number2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value A:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the value B:");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.println("Both numbers are 0, the greatest common divisor cannot be searched for.");
        } else {
            System.out.println("Greatest common divisor: " + getGreatestCommonDivisor(number1, number2));
        }
    }
}
