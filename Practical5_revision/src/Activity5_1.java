import java.util.InputMismatchException;
import java.util.Scanner;

public class Activity5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        while (true) {
            try {
                System.out.print("Enter the size of the array: ");
                size = sc.nextInt();
                if (size%1 != 0) {
                    System.out.println("Size must be an integer. Try again.");
                    continue;
                }
                break; // exit loop if valid size is entered
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // clear invalid input
            }
        }

        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    array[i] = sc.nextDouble();
                    break; // exit loop if valid double is entered
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a decimal number.");
                    sc.next(); // clear invalid input
                }
            }
        }

        double average = avgArry(array);
        System.out.println("The average of the array elements is: " + average);
    }

    public static double avgArry(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }
}
