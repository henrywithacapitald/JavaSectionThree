import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program checks if the number is even or odd");
        System.out.println("Please enter any number");
        Double number = scan.nextDouble();
        if (number % 2 == 0) {
            System.out.println("The number of " + number + " is even");
        } else {
            System.out.println("The number is odd " + number + " is odd");
        }

    }

}