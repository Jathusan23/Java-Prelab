import java.util.Scanner;

public class prelab3 {
    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] numbers = new int[size];

        // Read the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Read the target value
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // Perform linear search
        int result = linearSearch(numbers, target);

        // Display the result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }

        // scanner.close(); // No need to close explicitly when using try-with-resources
    }
    }
}