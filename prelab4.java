import java.util.Scanner;

public class prelab4 {

    // Method to perform insertion sort
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Unsorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Perform insertion sort
        insertionSort(numbers);

        System.out.println("Sorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
