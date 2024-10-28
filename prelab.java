import java.util.Scanner;

public class prelab {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sum = 0;
            int count = 0;
            int max = 0;
            int min = 0;

            System.out.println("Enter integers (type 'done' to finish):");

            if (scanner.hasNextInt()) {
                int firstNumber = scanner.nextInt();
                sum = firstNumber;
                count = 1;
                max = firstNumber;
                min = firstNumber;
            }

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }

            if (count > 0) {
                
                double average = (double) sum / count;
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + String.format("%.2f", average));
                System.out.println("Maximum: " + max);
                System.out.println("Minimum: " + min);
            } else {
                System.out.println("No integers were entered.");
            }
        }
    }
}