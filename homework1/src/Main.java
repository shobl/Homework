import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int winNumber = new Random().nextInt(101);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let the game begin!");

        System.out.print("Input name, please: ");
        String name = scanner.nextLine();

        int capacity = 50;
        int currentLength = 0;
        int[] arr = new int[capacity];
        int number;


        for (; ; ) {
            System.out.print("Input number, please: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Input a number, please:");

                if (!scanner.hasNextInt()) {
                    System.err.println("Not a number");
                    return;
                }
            }

            number = scanner.nextInt();
            arr[currentLength] = number;
            currentLength++;

            if (number == winNumber) {
                System.out.println("Congratulations, " + name + "!");
                scanner.close();
                break;
            } else if (number < winNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Your number is too big. Please, try again.");
            }

        }

        for (int i = 0; i < currentLength; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = 0; j < currentLength; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;

        }
        System.out.println(Arrays.toString(arr));


    }
}