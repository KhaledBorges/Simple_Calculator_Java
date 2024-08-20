import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        typeNumbers();
    }

    static void typeNumbers() {
        System.out.println("Small calculator!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.print("Type the second number: ");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Do you wish to add or subtract?\nType 1 to add\nType 2 to subtract\n");
        int question = Integer.parseInt(scanner.nextLine());

        int addition = number + secondNumber;
        int subtraction = number - secondNumber;

        if (question == 1) {
            System.out.println("Your result is: " + addition);
        } else if (question == 2) {
            System.out.println("Your result is: " + subtraction);
        } else {
            System.out.println("Invalid option, try again.\n");
            typeNumbers();
        }
    }
}
