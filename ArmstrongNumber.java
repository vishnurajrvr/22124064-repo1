import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check and display whether the number is Armstrong or not
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
    }
}
